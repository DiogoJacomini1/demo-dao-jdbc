package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("==== TEST 1: Department findById====");
		Department department = departmentDao.findById(4);
		System.out.println(department);
		
		System.out.println("\n==== TEST 2: Department findAll====");
		List<Department> list = departmentDao.findAll();
		for(Department obj: list) {
			System.out.println(obj);
		}
		
		System.out.println("\n==== TEST 3: Department insert====");
		Department newDepartment = new Department(null, "Music");
		departmentDao.insert(newDepartment);
		System.out.println("Insert! New Id:" + newDepartment.getId());
		
		System.out.println("\n==== TEST 4: department delete====");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");
		
		System.out.println("\n==== TEST 5: department update====");
		department = departmentDao.findById(6);
		department.setName("Sports");
		departmentDao.update(department);
		System.out.println("Update completed");
		

	}

}
