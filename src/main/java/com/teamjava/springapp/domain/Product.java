package com.teamjava.springapp.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Product {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	@NotNull
	@NotEmpty
	private String productName;
	
	@NotNull
	@NotEmpty
	private String productDescription;
	
	@NotNull
	private BigDecimal price;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Product(Long id, @NotNull @NotEmpty String productName, @NotNull @NotEmpty String productDescription,
			@NotNull BigDecimal price) {
		super();
		this.id = id;
		this.productName = productName;
		this.productDescription = productDescription;
		this.price = price;
	}
	
	public Product() {}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", productDescription=" + productDescription
				+ ", price=" + price + "]";
	}
}
