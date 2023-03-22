package NewellGennie.BlogFullStack.repository;

import NewellGennie.BlogFullStack.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


//Controller object inherits methods and props from JPA Repo
public interface UserRepository extends JpaRepository<User,Long> {
}
