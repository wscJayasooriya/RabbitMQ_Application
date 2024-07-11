package jaye.spring.rabbitmq.rabbitmq_application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Order {

    private String orderId = UUID.randomUUID().toString();
    private String customerName;
    private double totalAmount;
    private int quantity;
}
