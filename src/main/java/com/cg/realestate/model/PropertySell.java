package com.cg.realestate.model;
/*
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
*/
//@Entity
public class PropertySell {

	//@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int propertySellId ;
	//@OneToOne(cascade = CascadeType.ALL) 
	//@JoinColumn
	private Property property;
	//@OneToOne(cascade = CascadeType.ALL) 
	//@JoinColumn
	private Seller seller;
	//@OneToOne(cascade = CascadeType.ALL) 
	//@JoinColumn
	private Buyer buyer;
		
	
	public PropertySell() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PropertySell(Property property, Seller seller, Buyer buyer) {
		super();
		this.property = property;
		this.seller = seller;
		this.buyer = buyer;
	}
	public int getPropertySellId() {
		return propertySellId;
	}
	public void setPropertySellId(int propertySellId) {
		this.propertySellId = propertySellId;
	}
	public Property getProperty() {
		return property;
	}
	public void setProperty(Property property) {
		this.property = property;
	}
	public Seller getSeller() {
		return seller;
	}
	public void setSeller(Seller seller) {
		this.seller = seller;
	}
	public Buyer getBuyer() {
		return buyer;
	}
	public void setBuyer(Buyer buyer) {
		this.buyer = buyer;
	}
	
	
	
}
