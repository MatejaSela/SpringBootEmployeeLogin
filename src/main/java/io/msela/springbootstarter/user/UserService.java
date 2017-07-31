package io.msela.springbootstarter.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	// GET-ALL
	public List<User> getAllUsers() {
		List<User> empls = new ArrayList<>();
		userRepository.findAll().forEach(empls::add);
		return empls;
	}

	// GET
	public User getUser(Long id) {
		return userRepository.findOne(Long.toString(id));
	}

	// POST
	public void addUser(User user) {
		userRepository.save(user);
	}

	// PUT
	public void updateUser(Long id, User user) {
		userRepository.save(user);
	}

	// DELETE
	public void deleteUser(Long id) {
		User user = userRepository.findOne(Long.toString(id));
		userRepository.delete(user);
	}

}
