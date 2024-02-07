package ru.gb.shoppaymont.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gb.shoppaymont.models.Customer;

public interface CustomerRepo extends JpaRepository<Customer,Long> {
}
