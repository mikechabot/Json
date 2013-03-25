package com.patientkeeper.utils;

import com.google.gson.*;
import org.apache.log4j.Logger;

import com.patientkeeper.personnel.Person;

public class JavaToJson {

	private static Logger log = Logger.getLogger(JavaToJson.class);
	
	public static void main(String[] args) {

		Person person = new Person();
		person.setFirstName("Mike");
		person.setLastName("Chabot");		
		
		String[] phones = {"1800373822","1800373822"};
		person.setPhoneNumber(phones);
		
		Gson gson = new Gson();	
		log.info(gson.toJson(person));
	}
}
