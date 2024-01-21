package com.shopping.ecommerce.entity;

import java.math.BigDecimal;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "product")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	Long id;

	@ManyToOne()
	@JoinColumn(name = "category_id", nullable = false)
	ProductCategory category;

	@Column(name = "sku")
	String sku;

	@Column(name = "name")
	String name;

	@Column(name = "description")
	String description;

	@Column(name = "unit_price")
	BigDecimal unit_price;

	@Column(name = "image_url")
	String imageUrl;

	@Column(name = "active")
	boolean active;

	@Column(name = "units_in_stock")
	int unitsInStock;

	@Column(name = "date_created")
	@CreationTimestamp
	private Date dateCreated;

	@Column(name = "last_updated")
	@UpdateTimestamp
	private Date lastUpdated;

}
