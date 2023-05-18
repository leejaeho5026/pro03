package com.myshop.dto;

import java.util.Date;

public class Payment {
	private	String	pnum;
	private	String	id;
	private	String	pcode;
	private	String	ptype;
	private	String	ptnum;
	private	int	pprice;
	private	String	pdate;
	
	public Payment(){
		Date now = new Date();
		this.pdate = now.toString();
	}
	
	public String getPnum() {
		return pnum;
	}
	public void setPnum(String pnum) {
		this.pnum = pnum;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPcode() {
		return pcode;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	public String getPtype() {
		return ptype;
	}
	public void setPtype(String ptype) {
		this.ptype = ptype;
	}
	public String getPtnum() {
		return ptnum;
	}
	public void setPtnum(String ptnum) {
		this.ptnum = ptnum;
	}
	public int getPprice() {
		return pprice;
	}
	public void setPprice(int pprice) {
		this.pprice = pprice;
	}
	public String getPdate() {
		return pdate;
	}
	public void setPdate(String pdate) {
		this.pdate = pdate;
	}
}
