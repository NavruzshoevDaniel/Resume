package ru.nsu.g.dnavruzshoev.resume.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.nsu.g.dnavruzshoev.resume.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
