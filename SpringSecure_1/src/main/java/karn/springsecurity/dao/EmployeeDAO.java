package karn.springsecurity.dao;

import java.util.List;

import karn.springsecurity.pojos.EmployeeVO;

/**
 * @author Ashish Karn
 * 
 * Interface to access database objects
 * 
 * */
public interface EmployeeDAO {

	public List<EmployeeVO> getAllEmployees();
}
