package com.te.springrest.service;

import java.util.List;

import com.te.springrest.beans.EmployeeInfoBean;

public interface EmployeeService {


	public EmployeeInfoBean getEmployeeData(int id);

	public boolean deleteEmpData(int id);
	
	public boolean addEmployee(EmployeeInfoBean employeeInfoBean);
	
	public boolean updateRecord(EmployeeInfoBean employeeInfoBean);
	
	public List<EmployeeInfoBean> getAllEmployees();
}
