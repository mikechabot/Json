package com.patientkeeper.utils;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.*;
import org.apache.log4j.Logger;

import com.patientkeeper.personnel.Person;

public class JavaToJson {

	private static Logger log = Logger.getLogger(JavaToJson.class);
	
	public static void main(String[] args) {

		Map<String,Map<String,String>> personnelContact = new HashMap<String,Map<String,String>>();	
		
		Person person = new Person();		
		String[] phonesArray = {"774-266-0686","781-373-6439"};
		
		Map<String, String> namesMap = new HashMap<String,String>();
		Map<String, String> phonesMap = new HashMap<String,String>();
						
		phonesMap.put("Mobile", "774-266-0686");
		phonesMap.put("Work", "781-373-6439");
		
		personnelContact.put("Names",namesMap);
		personnelContact.put("Phones",phonesMap);
		
		person.setPhoneNumber(phonesArray);
		person.setPhoneNumberMap(phonesMap);
		person.setFirstName("Mike");
		person.setLastName("Chabot");	
		person.setPersonnelContact(personnelContact);
			
		Gson gson = new Gson();	
		log.info(gson.toJson(person));
	}
}
