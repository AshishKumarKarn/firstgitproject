package karn.springsecurity.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import karn.springsecurity.pojos.EmployeeVO;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	public List<EmployeeVO> getAllEmployees() {
		// TODO Auto-generated method stub
		List<EmployeeVO> employees=new ArrayList<EmployeeVO>();
		
		EmployeeVO employee1=new EmployeeVO();
		EmployeeVO employee2=new EmployeeVO();
		EmployeeVO employee3=new EmployeeVO();
		
		employee1.setId(1);
		employee1.setFirstName("Ashish");
		employee1.setLastName("Karn");
		employee2.setId(2);
		employee2.setFirstName("Alok");
		employee2.setLastName("Singh");
		employee3.setId(3);
		employee3.setFirstName("Neeraj");
		employee3.setLastName("Nayan");
		
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		
		
		return employees;
	}

}
