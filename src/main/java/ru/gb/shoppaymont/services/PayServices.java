package ru.gb.shoppaymont.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gb.shoppaymont.models.Customer;
import ru.gb.shoppaymont.models.CustomerPay;
import ru.gb.shoppaymont.repo.CustomerRepo;

@Service
@AllArgsConstructor
public class PayServices {
    CustomerRepo customerRepo;
    public void pay(CustomerPay customerPay){
        Customer customerFrom=customerRepo.findById(customerPay.getFromId()).get();
        Customer customerTo=customerRepo.findById(customerPay.getToId()).get();

        customerFrom.setBalance(customerFrom.getBalance()-customerPay.getSum());
        customerTo.setBalance(customerTo.getBalance()+customerPay.getSum());

        customerRepo.save(customerFrom);
        customerRepo.save(customerTo);

    }
}
