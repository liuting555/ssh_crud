package com.lt.action;

import java.util.List;

import com.lt.page.PageBean;
import com.lt.po.Employee;
import com.lt.service.EmployeeService;
import com.opensymphony.xwork2.ActionSupport;

public class PageAction extends ActionSupport{
	
	private static final long serialVersionUID = 1L;
	
	private EmployeeService service;//通过Spring创建业务层对象  使用set方法依赖注入    
	private PageBean pageBean; //封装了分页信息和数据内容的pageBean    
	private List<Employee> listEmployee;//用于储存pageBean当中被封装的Employee信息    
	private int page = 1; //表示从网页中返回的当前页的值  默认为1 表示默认显示第一页内容    
	
	
	public String execute()throws Exception{    
		
			this.pageBean = service.queryForPage(4, page);//获取封装了分页信息和数据的pageBean    
			this.listEmployee = this.pageBean.getList(); //获取数据    
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