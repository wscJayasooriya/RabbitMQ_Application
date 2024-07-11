package jaye.spring.rabbitmq.rabbitmq_application.consumer;

import jaye.spring.rabbitmq.rabbitmq_application.config.MessagingConfig;
import jaye.spring.rabbitmq.rabbitmq_application.dto.OrderStatus;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class User {

    /**
     * This method is a RabbitMQ listener that consumes messages from the specified queue.
     * It listens for messages of type {@link OrderStatus} and prints the received message to the console.
     *
     * @param orderStatus The {@link OrderStatus} object containing the message to be consumed.
     */

    @RabbitListener(queues = MessagingConfig.QUEUE)
    public void consumeMessageFromQueue(OrderStatus orderStatus) {
        System.out.println("Message Received from Queue : " + orderStatus);
    }
}
