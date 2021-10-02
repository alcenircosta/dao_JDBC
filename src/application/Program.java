package application;

import java.util.Date;
import java.util.List;

import model.dao.DAOFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	public static void main(String[] args) {
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
	}
}
