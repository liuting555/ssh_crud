package com.lt.action;

import java.util.List;

import com.lt.page.PageBean;
import com.lt.po.Employee;
import com.lt.service.EmployeeService;
import com.opensymphony.xwork2.ActionSupport;

public class PageAction extends ActionSupport{
	
	private static final long serialVersionUID = 1L;
	
	private EmployeeService service;//ͨ��Spring����ҵ������  ʹ��set��������ע��    
	private PageBean pageBean; //��װ�˷�ҳ��Ϣ���������ݵ�pageBean    
	private List<Employee> listEmployee;//���ڴ���pageBean���б���װ��Employee��Ϣ    
	private int page = 1; //��ʾ����ҳ�з��صĵ�ǰҳ��ֵ  Ĭ��Ϊ1 ��ʾĬ����ʾ��һҳ����    
	
	
	public String execute()throws Exception{    
		
			this.pageBean = service.queryForPage(4, page);//��ȡ��װ�˷�ҳ��Ϣ�����ݵ�pageBean    
			this.listEmployee = this.pageBean.getList(); //��ȡ����    
			//this.listEmployee=this.service.listEmployee();
			// if(this.listEmployee.size()>0){
	    		 return SUCCESS;
	    	// }else{
	    	//	 return INPUT;
	    //	 }
		 
	}    
	
	public int getPage() {    
	return page;    
	}    
	public void setPage(int page) {    
	this.page = page;    
	}    
	
	public List<Employee> getListEmployee() {
		return listEmployee;
	}

	public void setListEmployee(List<Employee> listEmployee) {
		this.listEmployee = listEmployee;
	}

	public PageBean getPageBean() {    
	return pageBean;    
	}    
	public void setPageBean(PageBean pageBean) {    
	this.pageBean = pageBean;    
	}    
	public void setService(EmployeeService service) {    
	this.service = service;    
	}    
	
}    