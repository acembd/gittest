package com.adv.pojo1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Customer {

	@Value("100")
	private int cid;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + "]";
	}

	public Customer(int cid) {
		super();
		this.cid = cid;
	}
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
}
