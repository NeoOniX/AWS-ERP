package edu.estiam.gto.erp.controller;

import com.fasterxml.jackson.annotation.JsonView;
import edu.estiam.gto.erp.model.Order;
import edu.estiam.gto.erp.repository.OrderRepository;
import edu.estiam.gto.erp.view.OrderView;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    private final OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @GetMapping
    @JsonView({OrderView.class})
    public ResponseEntity<List<Order>> getAllOrders() {
        List<Order> orders = orderRepository.findAll();
        return ResponseEntity.ok(orders);
    }

    @GetMapping("/{id}")
    @JsonView({OrderView.class})
    public ResponseEntity<Order> getOrderById(@PathVariable Long id) {
        return orderRepository.findById(id)
                .map(order -> ResponseEntity.ok(order))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
