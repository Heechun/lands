package com.pknu.member.dto;

public class MemberDto {
	private String id;
	private String pass;
	private String name;
	private String date;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "MemberDto [id=" + id + ", pass=" + pass + ", name=" + name + ", date=" + date + "]";
	}
	
	
}
