package com.itrex.konoplyanik.boardgamerent.entity;

public class Accessory {

	private Long id;
	private String name;
	private Integer price;
	private Integer quantity;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "Accessory [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
}
