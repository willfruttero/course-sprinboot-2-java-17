package cursojavacompleto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import cursojavacompleto.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	

}
