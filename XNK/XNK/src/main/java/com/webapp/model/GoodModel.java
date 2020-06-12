package com.webapp.model;

import javax.validation.constraints.NotEmpty;

public class GoodModel {
	
	@NotEmpty(message = "ID khong duoc bo trong")
	private String id;
    
    @NotEmpty(message = "Ten san pham khong duoc bo trong")
    private String name;
    
    private int quantity;
    private int price;
    
    public GoodModel(){}

    public GoodModel(String id, String name, int quantity, int price) {
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
