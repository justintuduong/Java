package com.codingdojo.authentication.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User {

// ------------------------------------------------------------------------------------
// users Table
// ------------------------------------------------------------------------------------
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Size(min=1, message="Email cannot be empty")
	@Email(message="Email must be valid")
	private String email;
	
	@Size(min=5, message="Password must be greater than 5 characters")
	private String password;
	

	@Transient
	private String passwordConfirmation;
	
	@Column(updatable = false)
	private Date createdAt;
	
	private Date updatedAt;

// ------------------------------------------------------------------------------------
// PrePersist & PreUpdate
// ------------------------------------------------------------------------------------

	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}

	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}

// ------------------------------------------------------------------------------------
// Constructors
// ------------------------------------------------------------------------------------

	public User() {
	}

	public User(Long id, String email, String password, String passwordConfirmation, Date createdAt, Date updatedAt) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.passwordConfirmation = passwordConfirmation;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

// ------------------------------------------------------------------------------------
// Getters and Setters
// ------------------------------------------------------------------------------------

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordConfirmation() {
		return passwordConfirmation;
	}

	public void setPasswordConfirmation(String passwordConfirmation) {
		this.passwordConfirmation = passwordConfirmation;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

}
