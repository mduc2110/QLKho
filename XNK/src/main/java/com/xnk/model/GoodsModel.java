/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xnk.model;

import javax.validation.constraints.NotEmpty;

/**
 *
 * @author user
 */
public class GoodsModel {
    private String id;
    
    @NotEmpty(message = "Ten san pham khong duoc bo trong")
    private String name;
    @NotEmpty(message = "So luong khong duoc bo trong")
    private int quantity;
    @NotEmpty(message = "Gia khong duoc bo trong")
    private int price;
    public GoodsModel(){}

    public GoodsModel(String id, String name, int quantity, int price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}
