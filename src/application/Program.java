package application;

import java.util.Date;
import java.util.Locale;

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
	}
}
