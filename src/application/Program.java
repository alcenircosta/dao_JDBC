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
		Seller seller = sellerDao.findByID(3);
		System.out.println(seller);

	}
}
