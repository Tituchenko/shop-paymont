package ru.gb.shoppaymont.models;

import lombok.Data;

@Data
public class CustomerPay {
    Long fromId;
    Long toId;
    double sum;
}
