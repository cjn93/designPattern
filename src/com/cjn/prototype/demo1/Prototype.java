package com.cjn.prototype.demo1;
/**
*@author cjn
*@version 1.0
*@date 2018年5月28日 下午2:46:41
*@remark 
*
**/
public abstract class Prototype {
	private String id;
	
	public Prototype(String id) {
		// TODO Auto-generated constructor stub
		this.id = id;
	}
	
	public abstract Prototype cloneInfo();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	

}
