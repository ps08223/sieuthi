/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Admin
 */
public class Product {
    public String ID;
    public String categoryID;
    public String name;
    public int TonKho;
    public String picURL;
    public int price;
    
    public Product(String ID, String categoryID, String name, int TonKho, int price, String picURL) {
        this.ID = ID;
        this.categoryID = categoryID;
        this.name = name;
        this.TonKho = TonKho;
        this.picURL = picURL;
        this.price = price;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(String categoryID) {
        this.categoryID = categoryID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTonKho() {
        return TonKho;
    }

    public void setTonKho(int TonKho) {
        this.TonKho = TonKho;
    }

    public String getPicURL() {
        return picURL;
    }

    public void setPicURL(String picURL) {
        this.picURL = picURL;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
