package com.core.entity;

/**
 * 测试用户实体类
 * @author PengKe
 * @Date 2018年3月10日 下午7:28:33
 */
public class TestUser {
	private String id;
	private String name;
	private String pwd;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "TestUser [id=" + id + ", name=" + name + ", pwd=" + pwd + "]";
	}
}
