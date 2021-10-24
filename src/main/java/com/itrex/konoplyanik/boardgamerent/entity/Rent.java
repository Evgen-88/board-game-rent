package com.itrex.konoplyanik.boardgamerent.entity;

import java.time.LocalDate;

public class Rent {
	
	private Long id;
	private Long boardGameId;
	private Long orderId;
	private LocalDate from;
	private LocalDate to;
	private Integer price;
	
	public Rent() {
	}
	
	public Rent(Long boardGameId, Long orderId, LocalDate from, LocalDate to, Integer price) {
		this.boardGameId = boardGameId;
		this.orderId = orderId;
		this.from = from;
		this.to = to;
		this.price = price;
	}
	
	public Rent(Long id, Long boardGameId, Long orderId, LocalDate from, LocalDate to, Integer price) {
		this.id = id;
		this.boardGameId = boardGameId;
		this.orderId = orderId;
		this.from = from;
		this.to = to;
		this.price = price;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getBoardGameId() {
		return boardGameId;
	}
	public void setBoardGameId(Long boardGameId) {
		this.boardGameId = boardGameId;
	}
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public LocalDate getFrom() {
		return from;
	}
	public void setFrom(LocalDate from) {
		this.from = from;
	}
	public LocalDate getTo() {
		return to;
	}
	public void setTo(LocalDate to) {
		this.to = to;
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
		result = prime * result + ((boardGameId == null) ? 0 : boardGameId.hashCode());
		result = prime * result + ((from == null) ? 0 : from.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((to == null) ? 0 : to.hashCode());
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
		Rent other = (Rent) obj;
		if (boardGameId == null) {
			if (other.boardGameId != null)
				return false;
		} else if (!boardGameId.equals(other.boardGameId))
			return false;
		if (from == null) {
			if (other.from != null)
				return false;
		} else if (!from.equals(other.from))
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
		if (to == null) {
			if (other.to != null)
				return false;
		} else if (!to.equals(other.to))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Rent [id=" + id + ", boardGameId=" + boardGameId + ", orderId=" + orderId + ", from=" + from + ", to="
				+ to + ", price=" + price + "]";
	}
	
}