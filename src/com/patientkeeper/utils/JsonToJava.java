package com.patientkeeper.utils;

import org.apache.log4j.Logger;

import com.google.gson.*;
import com.patientkeeper.http.HttpException;
import com.patientkeeper.http.HttpHelper;
import com.patientkeeper.personnel.Person;

public class JsonToJava {

	private static Logger log = Logger.getLogger(JsonToJava.class);

	public static void main(String[] args) {

		String queryURL = "http://localhost:8080/person.json";

		HttpHelper httpHelper = new HttpHelper();
		String json = null;

		try {
			json = httpHelper.get(queryURL);
		} catch (HttpException e) {
			log.error("Error accessing the server for some reason", e);
		}

		Person person = new Gson().fromJson(json, Person.class);		
		if(person != null) log.info(person.toString());

	}

}
