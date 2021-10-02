package application;

import java.util.Scanner;

import model.dao.DAOFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentDao = DAOFactory.createDepartmentDao();
		Department dep;
		
		System.out.println("====TEST 1: Insert====");
		dep = new Department(12,"Drinks");
		departmentDao.insert(dep);
		System.out.println("Inserted, new department: "+dep.getId());
		System.out.println();
		
		System.out.println("====TEST 2: Update====");
		dep = new Department(8,"Drinks");
		dep.setName("Potatoes");
		departmentDao.update(dep);
		System.out.println("Inserted, new department: "+dep.getId());
		System.out.println();
		
		System.out.println("====TEST 3: Delete====");
		System.out.println("Enter id for delete test: ");
		departmentDao.deleteById(sc.nextInt());
		System.out.println("Delete complete");
		System.out.println();
		
		System.out.println("====TEST 4: Department find by id====");
		dep = departmentDao.findByID(3);
		System.out.println(dep);
		System.out.println();
		
		sc.close();
	}
}
