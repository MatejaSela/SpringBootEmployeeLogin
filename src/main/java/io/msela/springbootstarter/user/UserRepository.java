package io.msela.springbootstarter.user;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String>{

	User findOne(Long id); // NOT SURE IF THIS WILL WORK!?

	void delete(Long id);

}
