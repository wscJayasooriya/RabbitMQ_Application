package jaye.spring.rabbitmq.rabbitmq_application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OrderStatus {

    private Order order;
    private String status;
    private String message;
}
