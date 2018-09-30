package org.sainsburys.retail.sprinbootstarter.model;

public class Product {
	String title;
	long kcal_per_100g;
	double unit_price;
	String description;
	
	public Product() {
		
	}

	public Product(String title, long kcal_per_100g, double unit_price, String description) {
		super();
		this.title = title;
		this.kcal_per_100g = kcal_per_100g;
		this.unit_price = unit_price;
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public long getKcal_per_100g() {
		return kcal_per_100g;
	}

	public void setKcal_per_100g(long kcal_per_100g) {
		this.kcal_per_100g = kcal_per_100g;
	}

	public double getUnit_price() {
		return unit_price;
	}

	public void setUnit_price(double d) {
		this.unit_price = d;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
