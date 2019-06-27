package karn.springsecurity.dao;

import java.util.List;

import karn.springsecurity.pojos.EmployeeVO;

public interface EmployeeDAO {

	public List<EmployeeVO> getAllEmployees();
}
