
package com.example.Carservicecompany.model;
 
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
 
@Embeddable

public class Address {
    @NotNull
    private int houseNo;
    @NotBlank
    private String street;
    @NotBlank
    private String landmark;
    @NotBlank
    private String city;
    @NotBlank
    private String state;

	public Address() {
       super();

	}

	public Address(@NotNull int houseNo, @NotBlank String street, @NotBlank String landmark, @NotBlank String city,
			@NotBlank String state) {
		super();
		this.houseNo = houseNo;
		this.street = street;
		this.landmark = landmark;
		this.city = city;
		this.state = state;
	}

	public int getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
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

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", street=" + street + ", landmark=" + landmark + ", city=" + city
				+ ", state=" + state + "]";
	}
 
}