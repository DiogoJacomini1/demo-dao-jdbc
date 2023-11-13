package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("==== TEST 1: Department findById====");
		Department department = departmentDao.findById(4);
		System.out.println(department);
		
		System.out.println("\n==== TEST 2: Department insert====");
		Department newDepartment = new Department(null, "Music");
		departmentDao.insert(newDepartment);
		System.out.println("Insert! New Id:" + newDepartment.getId());
		
	

	}

}
