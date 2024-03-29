package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Custemers {
	private int custId;
	private String custName;
	private String courseName;
	@Autowired
	public Technologies technologies;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Technologies getTech() {
		return technologies;
	}
	public void setTech(Technologies tech) {
		this.technologies = tech;
	}
	public void display() {
		System.out.println("Custemers object return successfuly...");
		technologies.tech();
	}
}
