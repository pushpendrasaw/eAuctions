package com.abyeti.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "bid")
public class Bid extends Base {

	private Long bidPrice;
	@OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name = "buyer_id")
	private Buyer buyer;
	@OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name = "product_id")
	private Product product;

	public Long getBidPrice() {
		return bidPrice;
	}

	public void setBidPrice(Long bidPrice) {
		this.bidPrice = bidPrice;
	}

	public Buyer getBuyer() {
		return buyer;
	}

	public void setBuyer(Buyer buyer) {
		this.buyer = buyer;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((bidPrice == null) ? 0 : bidPrice.hashCode());
		result = prime * result + ((buyer == null) ? 0 : buyer.hashCode());
		result = prime * result + ((product == null) ? 0 : product.hashCode());
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
		Bid other = (Bid) obj;
		if (bidPrice == null) {
			if (other.bidPrice != null)
				return false;
		} else if (!bidPrice.equals(other.bidPrice))
			return false;
		if (buyer == null) {
			if (other.buyer != null)
				return false;
		} else if (!buyer.equals(other.buyer))
			return false;
		if (product == null) {
			if (other.product != null)
				return false;
		} else if (!product.equals(other.product))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Bid [bidPrice=" + bidPrice + ", buyer=" + buyer + ", product="
				+ product + ", id=" + id + "]";
	}

}
