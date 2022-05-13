package com.restapi.book.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Entity
@EnableJpaRepositories
public class Author {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer aid;
	private String firstName;
	private String lastName;
	private Float salary;
	

	//	toString method
	@Override
	public String toString() {
		return "Author [aid=" + aid + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ "]";
	}

//	Parameterized Constructor
	/*
	 * public Author(Integer aid, String firstName, String lastName, Float salary) {
	 * super(); this.aid = aid; this.firstName = firstName; this.lastName =
	 * lastName; this.salary = salary; }
	 */


	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Float getSalary() {
		return salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}
}
