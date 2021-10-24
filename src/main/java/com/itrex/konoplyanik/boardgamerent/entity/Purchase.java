package com.itrex.konoplyanik.boardgamerent.entity;

public class Purchase {

	private Long id;
	private Long accessoryId;
	private Long orderId;
	private Integer quantity;
	private Integer price;
	
	public Purchase() {
	}
	
	public Purchase(Long accessoryId, Long orderId, Integer quantity, Integer price) {
		this.accessoryId = accessoryId;
		this.orderId = orderId;
		this.quantity = quantity;
		this.price = price;
	}
	
	public Purchase(Long id, Long accessoryId, Long orderId, Integer quantity, Integer price) {
		this.id = id;
		this.accessoryId = accessoryId;
		this.orderId = orderId;
		this.quantity = quantity;
		this.price = price;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getAccessoryId() {
		return accessoryId;
	}
	public void setAccessoryId(Long accessoryId) {
		this.accessoryId = accessoryId;
	}
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accessoryId == null) ? 0 : accessoryId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((quantity == null) ? 0 : quantity.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Purchase other = (Purchase) obj;
		if (accessoryId == null) {
			if (other.accessoryId != null)
				return false;
		} else if (!accessoryId.equals(other.accessoryId))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (orderId == null) {
			if (other.orderId != null)
				return false;
		} else if (!orderId.equals(other.orderId))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (quantity == null) {
			if (other.quantity != null)
				return false;
		} else if (!quantity.equals(other.quantity))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Purchase [id=" + id + ", accessoryId=" + accessoryId + ", orderId=" + orderId + ", quantity=" + quantity
				+ ", price=" + price + "]";
	}
	
}