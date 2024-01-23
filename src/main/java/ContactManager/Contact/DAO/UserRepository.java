package ContactManager.Contact.DAO;

import org.springframework.data.repository.CrudRepository;

import ContactManager.Contact.Entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
