package application;

import java.util.Scanner;

import model.dao.DAOFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentDao = DAOFactory.createDepartmentDao();
		Department dep;
		
		System.out.println("====TEST 4: Insert====");
		dep = new Department(8,"Drinks");
		departmentDao.insert(dep);
		System.out.println("Inserted, new department: "+dep.getId());
		System.out.println();
		
		
		sc.close();
	}
}
