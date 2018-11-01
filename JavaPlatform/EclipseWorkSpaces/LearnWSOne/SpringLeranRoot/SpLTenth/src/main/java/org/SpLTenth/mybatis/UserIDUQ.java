package org.SpLTenth.mybatis;

import java.util.Date;

public class UserIDUQ {
	private int id;
	private String username;
	private String mobile;
	private Date created;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return username;
	}

	public void setName(String name) {
		this.username = name;
	}

	public Date getCreate() {
		return created;
	}

	public void setCreate(Date create) {
		this.created = create;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}