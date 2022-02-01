package info.lavait.springjwtapp.repository;

import info.lavait.springjwtapp.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
