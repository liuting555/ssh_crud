package com.lt.dao;

import java.util.List;

import com.lt.po.Employee;

public interface EmployeeDao {
	
	public void add(Employee employee);
	
	public Employee getEmployee(long id);
	
	public List<Employee> getEmployees();
	
	public void delete(long id);
	
	public void saveOrUpdate(Employee employee);
	
	//判断是否为非法用户（雇员）
	public List<Employee> getEmployees(String name,String phone);

	
	//实现分页功能
	/**   
	 * 分页查询   
	 * @param hql  查询条件   
	 * @param offset  开始记录   
	 * @param length  一次查询几条记录   
	 * @return 查询的记录集合   
	 */    
	public List<Employee> queryForPage(final String hql,final int offset,final int length);    
	/**   
	 * 查询所有的记录数   
	 * @param hql 查询条件   
	 * @return 总记录数   
	 */    
	public int getAllRowCount(String hql);    

}
