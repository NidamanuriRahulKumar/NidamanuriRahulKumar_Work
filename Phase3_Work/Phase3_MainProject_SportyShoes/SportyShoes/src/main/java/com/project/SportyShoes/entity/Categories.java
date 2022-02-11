package com.project.SportyShoes.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="categories")
public class Categories {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String categoryName;
	

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Categories() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Categories(long id, String categoryName) {
		super();
		this.id = id;
		this.categoryName = categoryName;
	}
	@Override
	public String toString() {
		return "Categories [id=" + id + ", categoryName=" + categoryName + "]";
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	/*public String women;
	public String men;
	public String kids;
	public Categories() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Categories(long id, String women, String men, String kids) {
		super();
		this.id = id;
		this.women = women;
		this.men = men;
		this.kids = kids;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getWomen() {
		return women;
	}
	public void setWomen(String women) {
		this.women = women;
	}
	public String getMen() {
		return men;
	}
	public void setMen(String men) {
		this.men = men;
	}
	public String getKids() {
		return kids;
	}
	public void setKids(String kids) {
		this.kids = kids;
	}
	@Override
	public String toString() {
		return "Categories [id=" + id + ", women=" + women + ", men=" + men + ", kids=" + kids + "]";
	}*/

}
