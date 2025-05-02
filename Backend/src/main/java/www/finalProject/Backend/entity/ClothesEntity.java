package www.finalProject.Backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clothes")
public class ClothesEntity {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
Long id;
String brand;
String type;
String category;
String description;
Double price;
int rating;
String imgUrl;
Long ownerId;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public String getDescription() {
	return description;
}
public ClothesEntity(Long id, String brand, String type, String category, String description, Double price, int rating,
		String imgUrl, Long ownerId) {
	this.id = id;
	this.brand = brand;
	this.type = type;
	this.category = category;
	this.description = description;
	this.price = price;
	this.rating = rating;
	this.imgUrl = imgUrl;
	this.ownerId = ownerId;
}
public void setDescription(String description) {
	this.description = description;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
public int getRating() {
	return rating;
}
public void setRating(int rating) {
	this.rating = rating;
}
public String getImgUrl() {
	return imgUrl;
}
public void setImgUrl(String imgUrl) {
	this.imgUrl = imgUrl;
}
public Long getownerId() {
	return ownerId;
}
public void setOwnerId(Long ownerId) {
	this.ownerId = ownerId;
}
public ClothesEntity() {
	
}
}
