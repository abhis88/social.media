package com.social.media.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="Users")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="first_name", nullable=false, length=255)
	private String firstName;
	
	@Column(name="last_name", nullable=false, length=255)
	private String lastName;
	
	@Column(name="date_of_birth", nullable=false)
	private LocalDate dateOfBirth;
	
	@Column(name="country", nullable=false)
	private String country;
	
	@Column(name="bio_message", nullable=true)
	private String profileBioMessage;
	
	@Column(name="user_joined_on", nullable=true)
	private LocalDate memberSinceDate;
	
	public User() {
		
	}
	
	
	public User(String firstName, String lastName, LocalDate dateOfBirth, String country) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.country = country;
		this.memberSinceDate = LocalDate.now();
	}

	
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth + ", country="
				+ country + ", profileBioMessage=" + profileBioMessage + ", memberSinceDate=" + memberSinceDate + "]";
	}


	public User(String firstName, String lastName, LocalDate dateOfBirth, String country, String profileBioMessage,
			LocalDate memberSinceDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.country = country;
		this.profileBioMessage = profileBioMessage;
		this.memberSinceDate = memberSinceDate;
	}

}