package application;

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
		System.out.println("====TEST 1: Seller find by id====");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj : list) {
			System.out.println(obj);
		}
	}
}
