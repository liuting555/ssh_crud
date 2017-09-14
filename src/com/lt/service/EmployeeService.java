package com.lt.service;

import java.util.List;

import com.lt.page.PageBean;
import com.lt.po.Employee;

public interface EmployeeService {
	
	 public void addEmployee(Employee employee) ;
	 public List< Employee> listEmployee() ;
	 public void deleteEmployee(Long id) ;
	 public void saveOrUpdate(Employee employee) ;
	 public Employee getEmployee(Long id) ;
	 public Employee getEmployee(String name, String phone) ;

	 /**   
	  * ��ҳ��ѯ     
	  * @param pageSize  ÿҳ��ʾ���ټ�¼   
	  * @param currentPage ��ǰҳ   
	  * @return ��װ�˷�ҳ��Ϣ��bean   
	  */    
	 public PageBean queryForPage(int pageSize,int page); 
}
