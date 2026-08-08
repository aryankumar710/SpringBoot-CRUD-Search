package com.example.ecom_proj.model;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
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

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Date getReleasedDate() {
		return releasedDate;
	}

	public void setReleasedDate(Date releasedDate) {
		this.releasedDate = releasedDate;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public String getImageType() {
		return imageType;
	}

	public void setImageType(String imageType) {
		this.imageType = imageType;
	}

	public byte[] getImageData() {
		return imageData;
	}
	
    public Product() {
    }

	public Product(int id, String name, String brand, String description, BigDecimal price, String category,
			Date releasedDate, boolean available, int quantity, String imageName, String imageType, byte[] imageData) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.description = description;
		this.price = price;
		this.category = category;
		this.releasedDate = releasedDate;
		this.available = available;
		this.quantity = quantity;
		this.imageName = imageName;
		this.imageType = imageType;
		this.imageData = imageData;
	}



	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", brand=" + brand + ", description=" + description + ", price="
				+ price + ", category=" + category + ", releasedDate=" + releasedDate + ", available=" + available
				+ ", quantity=" + quantity + ", imageName=" + imageName + ", imageType=" + imageType + ", imageData="
				+ Arrays.toString(imageData) + ", getId()=" + getId() + ", getName()=" + getName() + ", getBrand()="
				+ getBrand() + ", getPrice()=" + getPrice() + ", getCategory()=" + getCategory()
				+ ", getReleasedDate()=" + getReleasedDate() + ", isAvailable()=" + isAvailable() + ", getQuantity()="
				+ getQuantity() + ", getImageName()=" + getImageName() + ", getImageType()=" + getImageType()
				+ ", getImageData()=" + Arrays.toString(getImageData()) + ", getDescriptionString()="
				+ getDescriptionString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}



	public void setImageData(byte[] imageData) {
		this.imageData = imageData;
	}

	private String name;
	private String brand;
	private String description;
	private BigDecimal price;
	public String getDescriptionString() {
		return description;
	}

	public void setDescriptionString(String descriptionString) {
		this.description= descriptionString;
	}

	private String category;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private Date releasedDate;
	private boolean available;
	private int quantity;
	
	private String imageName;
	private String imageType;
	
	@Lob
	private byte[] imageData;
}
