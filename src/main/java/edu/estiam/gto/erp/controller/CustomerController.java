package edu.estiam.gto.erp.controller;

import com.fasterxml.jackson.annotation.JsonView;
import edu.estiam.gto.erp.model.Customer;
import edu.estiam.gto.erp.repository.CustomerRepository;
import edu.estiam.gto.erp.view.CustomerView;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    private final CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping
    @JsonView({ CustomerView.class })
    public ResponseEntity<List<Customer>> getAllCustomers() {
        List<Customer> customers = customerRepository.findAll();
        return ResponseEntity.ok(customers);
    }

    @GetMapping("/{id}")
    @JsonView({ CustomerView.class })
    public ResponseEntity<Customer> getCustomerById(Long id) {
        return customerRepository.findById(id)
                .map(customer -> ResponseEntity.ok(customer))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
