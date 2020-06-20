package com.practice.app;

import com.practice.bean.Employee;
import com.practice.bean.Product;

public class TesterApp_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Newly craeted program");
		// Adding Employee and Product objects
		Employee krishna =  new Employee(103, "Krishna", 503);
		Product refrigerator = new Product(1001,"LG Refrigerator", 12, 18365.25f);
		System.out.println(krishna);
		System.out.println(refrigerator);
	}

}
