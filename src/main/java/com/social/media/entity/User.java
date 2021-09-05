package com.social.media.entity;

import java.time.LocalDate;
import com.social.media.enums.Country;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
	
	private Integer id;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private Country country;
	private String profileBioMessage;
	private LocalDate memberSinceDate;
	
	public User() {
		
	}
	
	public User(String firstName, String lastName, LocalDate dateOfBirth, Country country) {
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

}

