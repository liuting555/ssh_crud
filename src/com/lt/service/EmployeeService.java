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
	  * 分页查询     
	  * @param pageSize  每页显示多少记录   
	  * @param currentPage 当前页   
	  * @return 封装了分页信息的bean   
	  */    
	 public PageBean queryForPage(int pageSize,int page); 
}
