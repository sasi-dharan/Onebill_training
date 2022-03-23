
package com.onebill.encapsulation;

public class Employee {
private String name;
private int age;



public void setName(String name) {
	if(name.length()>3) {
		this.name=name;
		System.out.println(name);
    }else {
    	System.out.println("Enter a valid name");
    }
}	
public String getName() {
	return name;
	}

public void setAge(int age) {
	if (age>0) {
		this.age = age;	
		System.out.println(age);
		
	}else {
		System.out.println("Enter a valid age");
	}
}
public int getAge() {
	return age;
}


}
