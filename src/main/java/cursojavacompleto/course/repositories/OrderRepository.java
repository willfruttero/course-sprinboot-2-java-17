package cursojavacompleto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import cursojavacompleto.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	

}
