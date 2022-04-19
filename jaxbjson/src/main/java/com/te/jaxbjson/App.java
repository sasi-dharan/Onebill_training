package com.te.jaxbjson;

import java.io.FileWriter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App 
{
    public static void main( String[] args )
    {
       Employe employe = new Employe();
       employe.setDesignation("trainee");
       employe.setLocality("mumbai");
       employe.setName("nesamani");
       
       
       Company company = new Company();
       company.setCname("onebill");
       company.setCtype("bussiness");
       
       employe.setCompany(company);
       try {
    	   ObjectMapper objectMapper = new ObjectMapper();
		//String writeValueAsString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(employe);
		//System.out.println(writeValueAsString);
    	   objectMapper.writerWithDefaultPrettyPrinter().writeValue(new FileWriter("src/main/java/emp.json"), employe);
    	   
	} catch (Exception e) {
		e.printStackTrace();
	}
    }
}
