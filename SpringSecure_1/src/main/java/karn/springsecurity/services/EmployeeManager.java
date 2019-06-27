package karn.springsecurity.services;

import java.util.List;

import karn.springsecurity.pojos.EmployeeVO;

public interface EmployeeManager {

	public List<EmployeeVO> getAllEmployees();
	
}
