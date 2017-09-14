package com.lt.dao;

import java.util.List;

import com.lt.po.Employee;

public interface EmployeeDao {
	
	public void add(Employee employee);
	
	public Employee getEmployee(long id);
	
	public List<Employee> getEmployees();
	
	public void delete(long id);
	
	public void saveOrUpdate(Employee employee);
	
	//�ж��Ƿ�Ϊ�Ƿ��û�����Ա��
	public List<Employee> getEmployees(String name,String phone);

	
	//ʵ�ַ�ҳ����
	/**   
	 * ��ҳ��ѯ   
	 * @param hql  ��ѯ����   
	 * @param offset  ��ʼ��¼   
	 * @param length  һ�β�ѯ������¼   
	 * @return ��ѯ�ļ�¼����   
	 */    
	public List<Employee> queryForPage(final String hql,final int offset,final int length);    
	/**   
	 * ��ѯ���еļ�¼��   
	 * @param hql ��ѯ����   
	 * @return �ܼ�¼��   
	 */    
	public int getAllRowCount(String hql);    

}
