package com.te.springrest.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.springrest.beans.EmployeeInfoBean;
import com.te.springrest.dao.EmployeeDAO;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDAO dao;

	

	@Override
	public EmployeeInfoBean getEmployeeData(int id) {
		if (id <= 0) {
			return null;
		}
		return dao.getEmployeeData(id);
	}

	@Override
	public boolean deleteEmpData(int id) {

		return dao.deleteEmpData(id);
	}

	@Override
	public boolean addEmployee(EmployeeInfoBean employeeInfoBean) {

		return dao.addEmployee(employeeInfoBean);
	}

	@Override
	public boolean updateRecord(EmployeeInfoBean employeeInfoBean) {
		// TODO Auto-generated method stub
		return dao.updateRecord(employeeInfoBean);
	}

	@Override
	public List<EmployeeInfoBean> getAllEmployees() {
		// TODO Auto-generated method stub
		return dao.getAllEmployees();
	}

}
