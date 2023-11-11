package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("\n==== TEST 1: Department insert====");
		Department newDepartment = new Department(null, "Music");
		departmentDao.insert(newDepartment);
		System.out.println("Insert! New Id:" + newDepartment.getId());
	}

}
