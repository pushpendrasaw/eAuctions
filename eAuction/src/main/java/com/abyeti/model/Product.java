package com.abyeti.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product extends Base {

	private String name;
	private Long intialBid;
	private String lastDateBid;

	/**
	 * @return the lastDateBid
	 */
	public String getLastDateBid() {
		return lastDateBid;
	}

	/**
	 * @param lastDateBid the lastDateBid to set
	 */
	public void setLastDateBid(String lastDateBid) {
		this.lastDateBid = lastDateBid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getIntialBid() {
		return intialBid;
	}

	public void setIntialBid(Long intialBid) {
		this.intialBid = intialBid;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((intialBid == null) ? 0 : intialBid.hashCode());
		result = prime * result
				+ ((lastDateBid == null) ? 0 : lastDateBid.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Product))
			return false;
		Product other = (Product) obj;
		if (intialBid == null) {
			if (other.intialBid != null)
				return false;
		} else if (!intialBid.equals(other.intialBid))
			return false;
		if (lastDateBid == null) {
			if (other.lastDateBid != null)
				return false;
		} else if (!lastDateBid.equals(other.lastDateBid))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Product [name=" + name + ", intialBid=" + intialBid
				+ ", lastDateBid=" + lastDateBid + ", id=" + id + "]";
	}

}
