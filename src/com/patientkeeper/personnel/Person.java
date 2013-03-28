package com.patientkeeper.personnel;

import java.util.Arrays;
import java.util.Map;

public class Person {
	
	private String firstName;
	private String lastName;
	private Object[] phoneNumber;
	private Map<String, Object[]> phoneNumberMap;
	private Map<String, Map<String,Object[]>> personnelContact;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Map<String, Map<String, Object[]>> getPersonnelContact() {
		return personnelContact;
	}
	public void setPersonnelContact(Map<String, Map<String, Object[]>> personnelContact) {
		this.personnelContact = personnelContact;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Object[] getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Object[] phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public Map<String, Object[]> getPhoneNumberMap() {
		return phoneNumberMap;
	}
	public void setPhoneNumberMap(Map<String, Object[]> phoneNumberMap) {
		this.phoneNumberMap = phoneNumberMap;
	}
	
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName
				+ ", phoneNumber=" + Arrays.toString(phoneNumber) + "]";
	}
	
}
