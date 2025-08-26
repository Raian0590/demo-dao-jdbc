package br.com.raian.application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDeparmentDao();

        System.out.println("==== TEST 1: Department findById ====");
        Department department = departmentDao.findById(1);
        System.out.println(department);

        System.out.println("\n==== TEST 2: Department findAll ====");
        List<Department> list = departmentDao.findAll();

        for (Department dep : list) {
            System.out.println(dep);
        }

        System.out.println("\n==== TEST 3: Department insert ====");
        Department department1 = new Department(null,"Music");
        departmentDao.insert(department1);
        System.out.println("Inserted! New id: " + department1.getId());

        System.out.println("\n==== TEST 4: Department update ====");
        department = departmentDao.findById(1);
        department.setName("Foods");
        departmentDao.update(department);
        System.out.println("Update completed!");

        System.out.println("\n==== TEST 5: Department delete ====");
        System.out.print("Enter id for delete test: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed");
    }
}
