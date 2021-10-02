package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DAOFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SellerDao sellerDao = DAOFactory.createSellerDao();
		System.out.println("====TEST 1: Seller find by id====");
		Seller seller = sellerDao.findByID(3);
		System.out.println(seller);
		System.out.println();

		System.out.println("====TEST 2: Seller find by department====");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		System.out.println();

		System.out.println("====TEST 3: Seller find all====");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		System.out.println();

		System.out.println("====TEST 4: Insert====");
		seller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 1259.00, department);
		sellerDao.insert(seller);
		System.out.println("Inserted, new seller: "+seller.getId());
		System.out.println();
		
		System.out.println("====TEST 5: Update====");
		seller = sellerDao.findByID(1);
		seller.setName("Maria Black");
		sellerDao.update(seller);
		System.out.println("Update complete.");
		System.out.println();
		
		
		System.out.println("====TEST 6: Delete====");
		System.out.println("Enter id for delete test:");
		sellerDao.deleteById(sc.nextInt());
		System.out.println("Delete complete.");
		
		
		sc.close();
	}
}
