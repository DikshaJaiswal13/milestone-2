package com.example.stockspring.model;

public class Stock {
	private int stockExchangeId;
	private String stockExchangeName;
	private String brief;
	private String contactAddress;
	private String remarks;
	public int getStockExchangeId() {
		return stockExchangeId;
	}
	public void setStockExchangeId(int stockExchangeId) {
		this.stockExchangeId = stockExchangeId;
	}
	public String getStockExchangeName() {
		return stockExchangeName;
	}
	public void setStockExchangeName(String stockExchangeName) {
		this.stockExchangeName = stockExchangeName;
	}
	public String getBrief() {
		return brief;
	}
	@Override
	public String toString() {
		return "Stock [stockExchangeId=" + stockExchangeId + ", stockExchangeName=" + stockExchangeName + ", brief="
				+ brief + ", contactAddress=" + contactAddress + ", remarks=" + remarks + "]";
	}
	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	public String getContactAddress() {
		return contactAddress;
	}
	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public Stock(int stockExchangeId, String stockExchangeName, String brief, String contactAddress, String remarks) {
		super();
		this.stockExchangeId = stockExchangeId;
		this.stockExchangeName = stockExchangeName;
		this.brief = brief;
		this.contactAddress = contactAddress;
		this.remarks = remarks;
	}
	
}
