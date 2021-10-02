package application;

import java.util.Date;
import java.util.Locale;

import model.entities.Department;
import model.entities.Seller;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Department obj = new Department(1, "Boooks");
		Seller seller = new Seller(1,"João","joao@gmail.com",new Date(),1250.00,obj);
		
		System.out.println(obj);
		System.out.println(seller);
		
		
	}
}
