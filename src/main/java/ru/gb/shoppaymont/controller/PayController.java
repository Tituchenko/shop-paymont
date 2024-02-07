package ru.gb.shoppaymont.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.gb.shoppaymont.models.CustomerPay;
import ru.gb.shoppaymont.services.PayServices;

@RestController
@AllArgsConstructor
@RequestMapping("")
public class PayController {
    PayServices payServices;

    @PostMapping("/pay")
    public void pay(@RequestBody CustomerPay customerPay){
        payServices.pay(customerPay);
    }
}
