package com.patientkeeper.utils;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.*;
import org.apache.log4j.Logger;

import com.patientkeeper.personnel.Person;

public class JavaToJson {

	private static Logger log = Logger.getLogger(JavaToJson.class);
	
	public static void main(String[] args) {

		Map<String,Map<String,Object[]>> personnelContact = new HashMap<String,Map<String,Object[]>>();	
		Map<String, Object[]> namesMap = new HashMap<String,Object[]>(); 	// will be null, meant to be null
		Map<String, Object[]> phonesMap = new HashMap<String,Object[]>();
		
		Object[] phonesArray = {"Mobile",7742660686L,"Work",7813736439L};
		
		phonesMap.put("Phone Numbers", phonesArray);
	
		personnelContact.put("Names",namesMap);
		personnelContact.put("Phones",phonesMap);
		
		Person person = new Person();
		person.setPhoneNumber(phonesArray);
		person.setPhoneNumberMap(phonesMap);
		person.setFirstName("Mike");
		person.setLastName("Chabot");	
		person.setPersonnelContact(personnelContact);
			
		Gson gson = new Gson();	
		log.info(gson.toJson(person));
	}
}
