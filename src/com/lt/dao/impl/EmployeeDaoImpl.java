package com.lt.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.lt.dao.EmployeeDao;
import com.lt.po.Employee;

public class EmployeeDaoImpl extends HibernateDaoSupport implements EmployeeDao{

	
	@Override
	public void add(Employee employee) { 
		
           this.getHibernateTemplate().save(employee);
	}

	@Override
	public Employee getEmployee(long id) {
		
		return this.getHibernateTemplate().get(Employee.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getEmployees() {
		
		return this.getHibernateTemplate().find("from Employee order by id");
	}

	@Override
	public void delete(long id) {

		  this.getHibernateTemplate().delete(this.getEmployee(id));
	}

	@Override
	public void saveOrUpdate(Employee employee) {

		  this.getHibernateTemplate().saveOrUpdate(employee);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getEmployees(String name, String phone) {
 
		 Object values[] = {name,phone};
         System.out.println("查询结果是:"+name+" ,"+phone);		 
		return this.getHibernateTemplate().find("from Employee e where e.name=? and e.phone=?", values);
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> queryForPage(String hql, int offset, int length) {
		Session session = this.getSession();
		Query query = session.createQuery(hql);
	//query.setFirstResult(0),query.setMaxResults(4);相当于MySQL中的limit 0, 4;
		query.setFirstResult(offset);
		query.setMaxResults(length);
		List<Employee> list = query.list();
		System.out.println(list.size());
		return list;
	}

	@Override
	public int getAllRowCount(String hql) {
		
		return this.getHibernateTemplate().find(hql).size();
	}

	
	
}
