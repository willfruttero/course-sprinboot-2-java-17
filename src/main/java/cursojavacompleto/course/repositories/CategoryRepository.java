package cursojavacompleto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import cursojavacompleto.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	

}
