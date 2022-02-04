package cursojavacompleto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import cursojavacompleto.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

}
