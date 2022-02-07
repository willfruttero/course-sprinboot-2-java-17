package cursojavacompleto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import cursojavacompleto.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	

}
