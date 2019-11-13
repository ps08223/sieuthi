/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.HoaDonDAO;
import DAO.KhachHangDAO;
import Entities.TaiKhoanKH;
import Entities.TaiKhoanKHHD;
import cart.CartBean;
import cart.ProductDTO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Product;
import model.Products;

/**
 *
 * @author Admin
 */
public class ControllerCartBean extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try{
            String action = request.getParameter("action");
            if(action.equals("Đặt Hàng")){
                HttpSession session = request.getSession(true);
                CartBean shop = (CartBean)session.getAttribute("SHOP");
                if(shop==null){
                    shop = new CartBean();
                }
                String ID = request.getParameter("txtID");
                String categoryID = request.getParameter("txtCategoryID");
                String name = request.getParameter("txtName");
                int TonKho = Integer.parseInt(request.getParameter("txtNumeraire"));
                String price = request.getParameter("txtPrice");
                String picURL = request.getParameter("txtPicURL");
                
                int pri = Integer.parseInt(price);
                Product s = new Product(ID, categoryID, name, TonKho, pri, picURL);
                ProductDTO sp = new ProductDTO(s);
                shop.addSanPham(sp);
                session.setAttribute("SHOP", shop);
                String tcart = request.getParameter("cart");
                if (tcart.equals("cart1")) {
                    RequestDispatcher rd = request.getRequestDispatcher("laptop.jsp");
                    rd.forward(request, response);
                } else if (tcart.equals("cart2")) {
                    RequestDispatcher rd = request.getRequestDispatcher("phuKien.jsp");
                    rd.forward(request, response);
                } else if (tcart.equals("cart3")) {
                    RequestDispatcher rd = request.getRequestDispatcher("dienThoai.jsp");
                    rd.forward(request, response);
                } else if (tcart.equals("cart")) {
                    RequestDispatcher rd = request.getRequestDispatcher("sanPham.jsp");
                    rd.forward(request, response);
                }
            }else if(action.equals("View Cart")){
                RequestDispatcher rd = request.getRequestDispatcher("gioHang1.jsp");
                rd.forward(request, response);
            }
            else if(action.equals("AddMore")){
                RequestDispatcher rd = request.getRequestDispatcher("sanPham.jsp");
                rd.forward(request, response);
            }else if(action.equals("Remove")){
                String[] list = request.getParameterValues("rmv");
                if(list !=null){
                    HttpSession session = request.getSession();
                    if(session !=null){
                        CartBean shop = (CartBean)session.getAttribute("SHOP");
                        if(shop !=null){
                            for(int i=0;i<list.length;i++){
                                shop.removeSanPham(list[i]);
                            }
                            session.setAttribute("SHOP", shop);
                        }
                    }
                }
                String url = "gioHang.jsp";
                RequestDispatcher rd = request.getRequestDispatcher(url);
                rd.forward(request, response);
            } else if (action.equals("Login")) {
                String username = request.getParameter("username");
                String pass = request.getParameter("pass");
                
                KhachHangDAO khDAO = new KhachHangDAO();
                List<TaiKhoanKH> tkkh = khDAO.TKKH();
                
                for (TaiKhoanKH tk: tkkh) {
                    if (tk.TaiKhoan.equals(username) && tk.MatKhau.equals(pass)) {
                        TaiKhoanKHHD.setMaKH(tk.MaKH);
                        TaiKhoanKHHD.setTenKH(khDAO.TenKH(tk.MaKH));
                        RequestDispatcher rd = request.getRequestDispatcher("login_success.jsp");
                        rd.forward(request, response);
                    } else {
                        TaiKhoanKHHD.setMaKH(0);
                        TaiKhoanKHHD.setTenKH("");
                        RequestDispatcher rd = request.getRequestDispatcher("login_fail.jsp");
                        rd.forward(request, response);
                    }
                }
            } else if (action.equals("Đặt Mua")) {
                HoaDonDAO hdDAO = new HoaDonDAO();
                KhachHangDAO khDAO = new KhachHangDAO();
                int MaKH, MaHD;

                if (TaiKhoanKHHD.MaKH == 0) {
                    khDAO.Insert();
                    MaKH = khDAO.KHMoiNhat();
                } else {
                    MaKH = TaiKhoanKHHD.MaKH;
                }

                hdDAO.Insert(1, MaKH, 1, 0);
                MaHD = hdDAO.MaHDMoiNhat();
                
                for (int i = 1; i <= 8; i++) {
                    String ma = request.getParameter("txtID" + i);
                    String sl = request.getParameter("txtSL" + i);
                    System.out.println(ma + sl);
                    try {
                        int Ma = Integer.parseInt(ma);
                        int SL = Integer.parseInt(sl);
                       
                        hdDAO.HDCTOInsert(MaHD, 
                        Ma, 
                        SL, 
                        0);
                    } catch (Exception e) {
                        
                    }
                }
                
                RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
                rd.forward(request, response);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{ out.close();}            
        }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
