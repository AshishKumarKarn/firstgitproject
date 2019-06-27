package karn.springsecurity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import karn.springsecurity.dao.EmployeeDAO;
import karn.springsecurity.pojos.EmployeeVO;

@Service
public class EmployeeManagerImpl implements EmployeeManager {

	@Autowired
	EmployeeDAO dao;

	public List<EmployeeVO> getAllEmployees() {
		return dao.getAllEmployees();
	}

}
