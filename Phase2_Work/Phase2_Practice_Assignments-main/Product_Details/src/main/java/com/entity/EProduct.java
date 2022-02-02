package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="eproduct")
public class EProduct {

	@Id
	@GeneratedValue
	@Column(name="eproduct_id")
	private int id;
	
	@Column(name="eproduct_name")
	private String name;
	
	@Column(name="eproduct_price")
	private Double price;

	
	//ALt + S + R
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
}
