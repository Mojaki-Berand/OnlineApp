package com.mojaki.onlineapi.model;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@NotNull(message="First Name is required")
	@Column(name = "first_name")
	private String firstName;
	@NotNull(message="Last Name is required")
	@Column(name = "last_name")
	private String lastName;
	@NotNull(message="Phone Number is required")
	@Size(min=10, message="Phone number must be 10 digits long")
	@Column(name = "phone_number")
	private String phoneNumber;
	
	public User() {
		super();
	}
	
	public User(String firstName, String lastName, String phoneNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
