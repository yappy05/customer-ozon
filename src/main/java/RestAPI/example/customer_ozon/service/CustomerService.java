package RestAPI.example.customer_ozon.service;

import RestAPI.example.customer_ozon.repo.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;
}
