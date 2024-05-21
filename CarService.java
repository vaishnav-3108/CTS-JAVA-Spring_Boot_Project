
package com.example.Carservicecompany.model;
 
import java.time.LocalDate;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
 
@Entity
@Table(name="CarService")
 
public class CarService {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

	@NotBlank(message="Please enter the carmaker name")
    private String carmake;


	@NotBlank(message="Please enter the modelname")
    private String modelname;


	@NotBlank(message="please enter the registration number")
    private String registrationNumber;


	@NotNull(message="please enter the chassisnumber")
    private int chassisNumber;


	@NotBlank(message="please enter the issue of the car")
    private String knownissues;

	@NotNull(message="please enter the cost")
    private int cost;


	private LocalDate givendate;
  
	private LocalDate expecteddeliverydate;

	private LocalDate createddatetime;

	private LocalDate updateddatetime;

	@NotBlank
    private String  phonenumber;

	@Valid
    @Embedded
    Address adr;
 
	

	public CarService() {	

		super();

	}
 
 
	public CarService(int id, @NotBlank String carmake,@NotBlank String modelname,
			@NotBlank(message="please enter the registration number")String registrationNumber,
			@NotNull int chassisNumber,@NotBlank(message="please enter the registration number")String knownissues,
            @NotNull int cost, LocalDate givendate, LocalDate expecteddeliverydate,
            LocalDate createddatetime, LocalDate updateddatetime,@NotBlank String phonenumber,@Valid Address adr) {

		super();

		this.id = id;

		this.carmake = carmake;

		this.modelname = modelname;

		this.registrationNumber = registrationNumber;

		this.chassisNumber = chassisNumber;

		this.knownissues = knownissues;

		this.cost = cost;

		this.givendate = givendate;

		this.expecteddeliverydate = expecteddeliverydate;

		this.createddatetime = createddatetime;

		this.updateddatetime = updateddatetime;

		this.phonenumber = phonenumber;

		this.adr = adr;

	}
 
 
	public int getId() {

		return id;

	}
 
 
	public void setId(int id) {

		this.id = id;

	}
 
 
	public String getCarmake() {

		return carmake;

	}
 
 
	public void setCarmake(String carmake) {

		this.carmake = carmake;

	}
 
 
	public String getModelname() {

		return modelname;

	}
 
 
	public void setModelname(String modelname) {

		this.modelname = modelname;

	}
 
 
	public String getRegistrationNumber() {

		return registrationNumber;

	}
 
 
	public void setRegistrationNumber(String registrationNumber) {

		this.registrationNumber = registrationNumber;

	}
 
 
	public int getChassisNumber() {

		return chassisNumber;

	}
 
 
	public void setChassisNumber(int chassisNumber) {

		this.chassisNumber = chassisNumber;

	}
 
 
	public String getKnownissues() {

		return knownissues;

	}
 
 
	public void setKnownissues(String knownissues) {

		this.knownissues = knownissues;

	}
 
 
	public int getCost() {

		return cost;

	}
 
 
	public void setCost(int cost) {

		this.cost = cost;

	}
 
 
	public LocalDate getGivendate() {

		return givendate;

	}
 
 
	public void setGivendate(LocalDate givendate) {

		this.givendate = givendate;

	}
 
 
	public LocalDate getExpecteddeliverydate() {

		return expecteddeliverydate;

	}
 
 
	public void setExpecteddeliverydate(LocalDate expecteddeliverydate) {

		this.expecteddeliverydate = expecteddeliverydate;

	}
 
 
	public LocalDate getCreateddatetime() {

		return createddatetime;

	}
 
 
	public void setCreateddatetime(LocalDate createddatetime) {

		this.createddatetime = createddatetime;

	}
 
 
	public LocalDate getUpdateddatetime() {

		return updateddatetime;

	}
 
 
	public void setUpdateddatetime(LocalDate updateddatetime) {

		this.updateddatetime = updateddatetime;

	}
 
 
	public String getPhonenumber() {

		return phonenumber;

	}
 
 
	public void setPhonenumber(String phonenumber) {

		this.phonenumber = phonenumber;

	}
 
 
	public Address getAdr() {

		return adr;

	}
 
 
	public void setAdr(Address adr) {

		this.adr = adr;

	}
 
 
	@Override

	public String toString() {

		return "CarService [id=" + id + ", carmake=" + carmake + ", modelname=" + modelname + ", registrationNumber="

				+ registrationNumber + ", chassisNumber=" + chassisNumber + ", knownissues=" + knownissues + ", cost="

				+ cost + ", givendate=" + givendate + ", expecteddeliverydate=" + expecteddeliverydate

				+ ", createddatetime=" + createddatetime + ", updateddatetime=" + updateddatetime + ", phonenumber="

				+ phonenumber + ", adr=" + adr + "]";

	}
 
 
			
 
}
