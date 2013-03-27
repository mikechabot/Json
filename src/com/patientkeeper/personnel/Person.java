package com.patientkeeper.personnel;

import java.util.Arrays;
import java.util.Map;

public class Person {
	
	private String firstName;
	private String lastName;
	private String[] phoneNumber;
	private Map<String, String> phoneNumberMap;
	private Map<String, Map<String,String>> personnelContact;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Map<String, Map<String, String>> getPersonnelContact() {
		return personnelContact;
	}
	public void setPersonnelContact(Map<String, Map<String, String>> personnelContact) {
		this.personnelContact = personnelContact;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String[] getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String[] phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public Map<String, String> getPhoneNumberMap() {
		return phoneNumberMap;
	}
	public void setPhoneNumberMap(Map<String, String> phoneNumberMap) {
		this.phoneNumberMap = phoneNumberMap;
	}
	
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName
				+ ", phoneNumber=" + Arrays.toString(phoneNumber) + "]";
	}
	
}
