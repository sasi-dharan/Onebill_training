package com.te.jaxb;

import java.io.FileReader;
import java.io.FileWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class App 
{
    public static void main( String[] args )
    {
       Employe employe = new Employe();
       employe.setId(1);
       employe.setDesignation("trainee");
       employe.setName("sd");
       employe.setSalary(40000);
       employe.setPassword("xyz");
       
       
       
       Address address = new Address();
       address.setArea("ramar street");
       address.setCountry("nepal");
       address.setLocality("katmandu");
       address.setPincode(000001);
       
       employe.setAdd(address);
       try {
    	   
    	   //marshling
//		JAXBContext context = JAXBContext.newInstance(Employe.class);
//		Marshaller marshaller = context.createMarshaller();
//		FileWriter filewriter = new FileWriter("src/main/java/emp.xml");
//		
//		marshaller.setProperty(marshaller.JAXB_FORMATTED_OUTPUT,true);
//		marshaller.marshal(employe, System.out);
//		marshaller.marshal(employe,filewriter);
    	   
    	   
    	   //unmarshling
    	   JAXBContext context = JAXBContext.newInstance(Employe.class);
    	   Unmarshaller unmarshaller = context.createUnmarshaller();
    	   FileReader fileReader = new FileReader("src/main/java/emp.xml");
    	   Object object = unmarshaller.unmarshal(fileReader);
    	   System.out.println(object);
    	   Employe e= (Employe) object;
    	   System.out.println(e.getSalary());
		 
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
    }
}
