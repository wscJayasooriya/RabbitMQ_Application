package jaye.spring.rabbitmq.rabbitmq_application.publisher;

import jaye.spring.rabbitmq.rabbitmq_application.config.MessagingConfig;
import jaye.spring.rabbitmq.rabbitmq_application.dto.Order;
import jaye.spring.rabbitmq.rabbitmq_application.dto.OrderStatus;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderPublisher {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @PostMapping("/place/{restaurantName}")
    public String placeOrder(@RequestBody Order order, @PathVariable String restaurantName) {
        OrderStatus orderStatus = new OrderStatus(order, "PROCESS", "Order placed successfully in : " + restaurantName);
        rabbitTemplate.convertAndSend(MessagingConfig.EXCHANGE, MessagingConfig.ROUTING_KEY, orderStatus);
        return "Success";
    }
}
