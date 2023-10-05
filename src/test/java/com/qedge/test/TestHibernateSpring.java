package com.qedge.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qedge.dao.EmployeeDao;
import com.qedge.model.Employee;

public class TestHibernateSpring {

	public static void main(String[] args) {
	
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeDao dao = ctx.getBean("dao",EmployeeDao.class);
		Employee emp = new Employee("Hari",6000,"Ammerpet");
		dao.saveEmployee(emp);
		
		
	}

}
