package com.lt.service.impl;

import java.util.List;

import javax.management.loading.PrivateClassLoader;

import org.aspectj.weaver.AjAttribute.PrivilegedAttribute;

import com.lt.dao.EmployeeDao;
import com.lt.page.PageBean;
import com.lt.po.Employee;
import com.lt.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService{
	
	private EmployeeDao employeeDao;
	
	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	
	@Override
	public void addEmployee(Employee employee) {
		this.employeeDao.add(employee);
		
	}

	@Override
	public List<Employee> listEmployee() {
		
		return this.employeeDao.getEmployees();
	}

	@Override
	public void deleteEmployee(Long id) {

		this.employeeDao.delete(id);
	}

	@Override
	public void saveOrUpdate(Employee employee) {
     
		 this.employeeDao.saveOrUpdate(employee);
	}

	@Override
	public Employee getEmployee(Long id) {
		
		return employeeDao.getEmployee(id);
	}

	@Override
	public Employee getEmployee(String name, String phone) {
                
		List<Employee> lists = this.employeeDao.getEmployees(name, phone);
		if(lists!=null&&lists.size()>0){
			return lists.get(0);
		}
		return null;
	}
    
    //��ҳ��ѯ
	@Override
	public PageBean queryForPage(int pageSize, int page) {

		final String hql = "from Employee employee order by employee.id"; //��ѯ���    
		int allRow = employeeDao.getAllRowCount(hql);  //�ܼ�¼��    
		int totalPage = PageBean.countTatalPage(pageSize, allRow); //��ҳ��    
		final int offset = PageBean.countOffset(pageSize, page); //��ǰҳ��ʼ��¼    
		final int length = pageSize; // ÿҳ��¼��    
		final int currentPage = PageBean.countCurrentPage(page); // ��ǰҳ    
		List<Employee> list = employeeDao.queryForPage(hql, offset, length); //    
		//�ѷ�ҳ��Ϣ���浽Bean����    
		PageBean pageBean  = new PageBean();    
		pageBean.setPageSize(pageSize);    
		pageBean.setCurrentPage(currentPage);    
		pageBean.setAllRow(allRow);    
		pageBean.setTotalPage(totalPage);    
		pageBean.setList(list);    
		pageBean.init();    
		return pageBean;      
		
	}

}
