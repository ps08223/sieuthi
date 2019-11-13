/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cart;

import java.util.HashMap;

/**
 *
 * @author KietLPT
 */
public class CartBean extends HashMap{
    public void addSanPham(ProductDTO sp){
        String key = sp.getSanpham().getID();
        if(this.containsKey(key)){
            int oldQuantity = ((ProductDTO)this.get(key)).getQuantity();
            ((ProductDTO)this.get(key)).setQuantity(oldQuantity+1);
        }else{
            this.put(sp.getSanpham().getID(), sp);
        }
    }
    public boolean removeSanPham(String code){
        if(this.containsKey(code)){
            this.remove(code);
            return true;
        }
        return false;
    }
    public CartBean() {
        super();
    }  
}
