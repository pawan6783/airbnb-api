package com.example.airbnbClone.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Table(name = "house")
@Entity
public class House {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "house_number")
	private int houseNumber;
	
	@Column(name = "img")
	private String img;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "area")
	private String area;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "zipcode")
	private int zipcode;
	
	@Column(name = "bedrooms")
	private int bedrooms;
	
	@Column(name = "bathrooms")
	private int bathrooms;

	@Column(name = "price")
	private int price;
	
	@Column(name = "rating")
	@Size(min = 1, max = 5)
	private int rating;
	
	@Column(name = "guests")
	private int guests;
	
	@Column(name = "host_id")
	private int hostId;
	
	@Column(name = "host_first_name")
	private String hostFirstName;
	
	@Column(name = "host_last_name")
	private String hostLastName;
	
	@Column(name = "host_email")
	private String hostEmail;
	
	@Column(name = "host_location")
	private String hostLocation;
	
	public House() {
		super();
		// TODO Auto-generated constructor stub
	}

	public House(int id, int houseNumber, String img, String name, String description, String area, String city,
			String state, String country, int zipcode, int bedrooms, int bathrooms, int price,
			@Size(min = 1, max = 5) int rating, int guests, int hostId, String hostFirstName, String hostLastName,
			String hostEmail, String hostLocation) {
		super();
		this.id = id;
		this.houseNumber = houseNumber;
		this.img = img;
		this.name = name;
		this.description = description;
		this.area = area;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipcode = zipcode;
		this.bedrooms = bedrooms;
		this.bathrooms = bathrooms;
		this.price = price;
		this.rating = rating;
		this.guests = guests;
		this.hostId = hostId;
		this.hostFirstName = hostFirstName;
		this.hostLastName = hostLastName;
		this.hostEmail = hostEmail;
		this.hostLocation = hostLocation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public int getBedrooms() {
		return bedrooms;
	}

	public void setBedrooms(int bedrooms) {
		this.bedrooms = bedrooms;
	}

	public int getBathrooms() {
		return bathrooms;
	}

	public void setBathrooms(int bathrooms) {
		this.bathrooms = bathrooms;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getGuests() {
		return guests;
	}

	public void setGuests(int guests) {
		this.guests = guests;
	}

	public int getHostId() {
		return hostId;
	}

	public void setHostId(int hostId) {
		this.hostId = hostId;
	}

	public String getHostFirstName() {
		return hostFirstName;
	}

	public void setHostFirstName(String hostFirstName) {
		this.hostFirstName = hostFirstName;
	}

	public String getHostLastName() {
		return hostLastName;
	}

	public void setHostLastName(String hostLastName) {
		this.hostLastName = hostLastName;
	}

	public String getHostEmail() {
		return hostEmail;
	}

	public void setHostEmail(String hostEmail) {
		this.hostEmail = hostEmail;
	}

	public String getHostLocation() {
		return hostLocation;
	}

	public void setHostLocation(String hostLocation) {
		this.hostLocation = hostLocation;
	}

	@Override
	public String toString() {
		return "House [id=" + id + ", houseNumber=" + houseNumber + ", img=" + img + ", name=" + name + ", description="
				+ description + ", area=" + area + ", city=" + city + ", state=" + state + ", country=" + country
				+ ", zipcode=" + zipcode + ", bedrooms=" + bedrooms + ", bathrooms=" + bathrooms + ", price=" + price
				+ ", rating=" + rating + ", guests=" + guests + ", hostId=" + hostId + ", hostFirstName="
				+ hostFirstName + ", hostLastName=" + hostLastName + ", hostEmail=" + hostEmail + ", hostLocation="
				+ hostLocation + "]";
	}
	
	
}
