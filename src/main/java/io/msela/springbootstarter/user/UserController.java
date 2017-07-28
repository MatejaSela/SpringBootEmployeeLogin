package io.msela.springbootstarter.user;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.msela.springbootstarter.user.User;
import io.msela.springbootstarter.employee.Employee;

@RestController()
public class UserController {

	@Autowired
	private UserService userService;
	
	//GET
	@RequestMapping("/users")
	public List<User> getAllusers(){
		return userService.getAllUsers();
	}
	
	//GET
	@RequestMapping("/employees/{employeeId}/users/{id}") 
    public User getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }
	//POST
	@RequestMapping(method = RequestMethod.POST, value = "/employees/{employeeId}/users")
	public void addUser(@RequestBody User user, @PathVariable String employeeId) { 
		user.setEmployee(new Employee(employeeId, "", "", 0));
		userService.addUser(user);
	}
	
	//PUT
	@RequestMapping(method = RequestMethod.PUT, value = "/employees/{employeeId}/users/{id}")
	public void updateUser(@RequestBody User user,  @PathVariable Long id,  @PathVariable String employeeId) { 
		user.setEmployee(new Employee(employeeId, "", "", 0));
		userService.updateUser(id, user);
		
	}
	//DELETE
	@RequestMapping(method = RequestMethod.DELETE, value = "/employees/{employeeId}/users/{id}")
		public void deleteuser(@PathVariable Long id, @PathVariable String employeeId) {
			userService.deleteUser(id);
			
	}
}
