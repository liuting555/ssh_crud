package com.lt.action;

import java.util.List;


import org.aspectj.weaver.Dump.INode;

import com.lt.po.Employee;
import com.lt.service.EmployeeService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 哎呦喂
 * @author Administrator
 *2017.09.14
 */
public class EmployeeAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	
	private EmployeeService employeeService;
	private List<Employee> employees;
    private Employee employee;
    private long id;
    private long ids[];
    private String name;
    private String phone;
    
    //添加一个员工
     public String add(){
       if(this.employeeService.getEmployee(employee.getName(), employee.getPhone()) != null){
    	   return INPUT;
       }else{	 
    	    this.employeeService.addEmployee(employee);
		   return SUCCESS;
       }
     }
     
     //查询出多员工
     public String list(){
    	 this.employees=this.employeeService.listEmployee();
    	 if(this.employees.size()>0){
    		 return SUCCESS;
    	 }else{
    		 return INPUT;
    	 }
     }
    
     //根据id删除单个员工，或进行批量删除
     public String delete(){
      String var=id+"";
     if ("".equals(var)) {
    	   this.employeeService.deleteEmployee(this.id);
    	  } else {
    	   if (ids.length > 0) {
    	    for (Long id : ids) {
    	     this.employeeService.deleteEmployee(id);
    	    }
    	   }
    	  }
    	  if (this.employeeService.listEmployee().size() > 0) {
    	   return SUCCESS;
    	  } else {
    	   return INPUT;
    	  }

    	 }
    
     //
     public String saveOrUpdate(){
    	 
		this.employeeService.saveOrUpdate(employee);
		return SUCCESS;
     }
     
     //
     public String edit(){
    	 this.employee=this.employeeService.getEmployee(id);
		return SUCCESS;
    	 
     }
    	 
     //
     public String save(){

    	 long id=this.employee.getId();
    	employee = this.employeeService.getEmployee(id);
		return SUCCESS;
     }
    
     //
     public String update() {
    	  Long id = this.employee.getId();
    	  this.employeeService.saveOrUpdate(employee);
    	  return SUCCESS;
    	 }
     
     //
     public String login(){
    	 Employee emo = employeeService.getEmployee(name, phone);
    	 List<Employee> list=employeeService.listEmployee();
    	 if(emo!=null){  //验证是否为合法用户
    		 return SUCCESS;
    	 }else{
    		 if(list.size()>0){  //验证数据库里面是否有数据
    			 return INPUT;
    		 }else {
				return ERROR;
			}
		}
    	 
     }
     
     
	public EmployeeService getEmployeeService() {
		return employeeService;
	}
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long[] getIds() {
		return ids;
	}
	public void setIds(long[] ids) {
		this.ids = ids;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
