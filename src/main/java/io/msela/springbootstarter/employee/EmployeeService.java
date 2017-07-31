package io.msela.springbootstarter.employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	// GET-ALL
	public List<Employee> getAllEmployees() {
		List<Employee> topics = new ArrayList<>();
		employeeRepository.findAll().forEach(topics::add);
		return topics;
	}

	// GET
	public Employee getEmployee(String id) {

		return employeeRepository.findOne(id);
	}

	// POST
	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	// PUT
	public void updateEmployee(String id, Employee employee) {
		employeeRepository.save(employee);
	}

	// DELETE
	public void deleteEmployee(String id) {
		employeeRepository.delete(id);
	}

}
