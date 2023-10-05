package com.qedge.dao;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import org.springframework.transaction.annotation.Transactional;

import com.qedge.model.Employee;

public class EmployeeDaoImpl extends HibernateDaoSupport implements EmployeeDao{

	@Override
	@Transactional(noRollbackForClassName = {"java.lang.Exception"})
	public void saveEmployee(Employee emp) {
		getHibernateTemplate().save(emp);
	}

	@Override
	@Transactional(noRollbackForClassName = {"java.lang.Exception"})
	public void updateEmployee(Employee emp) {
		getHibernateTemplate().update(emp);
	}

	@Override
	@Transactional(noRollbackForClassName = {"java.lang.Exception"})
	public void deleteEmployee(Integer empId) {
		Employee emp = getEmployee(empId);
		getHibernateTemplate().delete(emp);
	}

	@Override
	public Employee getEmployee(Integer empId) {
		Employee emp = getHibernateTemplate().get(Employee.class, empId);
		return emp;
	}
	
}
