package org.emids.Domain;

public class Customer {
	private int customerId;
	private String customerName;
	private String phoneNo;
	private String customerAdress;

	public Customer(int customerId, String customerName, String phoneNo, String customerAdress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.phoneNo = phoneNo;
		this.customerAdress = customerAdress;
	}

	public int getCustomerid() {
		return customerId;
	}

	public void setCustomerid(int customerid) {
		this.customerId = customerid;
	}

	public String getCustomername() {
		return customerName;
	}

	public void setCustomername(String customername) {
		this.customerName = customername;
	}

	public String getPhno() {
		return phoneNo;
	}

	public void setPhno(String phno) {
		this.phoneNo = phno;
	}

	public String getCustomeradress() {
		return customerAdress;
	}

	public void setCustomeradress(String customeradress) {
		this.customerAdress = customeradress;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", phoneNo=" + phoneNo
				+ ", customerAdress=" + customerAdress + "]";
	}

}