package edu.estiam.gto.erp.model;

import com.fasterxml.jackson.annotation.JsonView;
import edu.estiam.gto.erp.view.CustomerView;
import edu.estiam.gto.erp.view.OrderView;
import edu.estiam.gto.erp.view.ProductView;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonView({OrderView.class, CustomerView.class})
    private Long id;

    @JsonView({OrderView.class, CustomerView.class})
    private LocalDateTime orderDate;

    @JsonView({OrderView.class, CustomerView.class})
    private LocalDateTime deliveryDate;

    @JsonView({OrderView.class, CustomerView.class})
    private String status;

    @JsonView({OrderView.class, CustomerView.class})
    private Double quantity;

    @JsonView({OrderView.class, CustomerView.class})
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    @JsonView({OrderView.class})
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    @JsonView({OrderView.class, CustomerView.class})
    private Product product;
}
