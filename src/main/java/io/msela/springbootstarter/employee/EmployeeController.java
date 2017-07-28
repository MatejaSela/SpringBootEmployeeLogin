package io.msela.springbootstarter.employee;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	//GET
	@RequestMapping("/employees")
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	//GET
	@RequestMapping("/employees/{id}")
    public Employee getemployee(@PathVariable String id) {
        return employeeService.getEmployee(id);
    }
	
	//POST
	@RequestMapping(method = RequestMethod.POST, value = "/employees")
	public void addemployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
		
	}
	
	//PUT
	@RequestMapping(method = RequestMethod.PUT, value = "/employees/{id}")
	public void updateemployee(@RequestBody Employee employee, @PathVariable String id) {
		employeeService.updateEmployee(id, employee);
		
	}
	//PUT
	@RequestMapping(method = RequestMethod.DELETE, value = "/employees/{id}")
	public void deleteemployee(@PathVariable String id) {
		employeeService.deleteEmployee(id);
		
	}
}
