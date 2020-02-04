package com.mycompany.myapp.order;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrderConfiguration {

    @Bean
    OrderComponent orderComponent(OrderRepository orderListRepository) {
        return new OrderComponentImpl(orderListRepository);
    }

    @Bean
    OrderRepository orderMapRepository() {
        return new OrderMapRepository();
    }

    @Bean
    OrderRepository orderListRepository() {
        return new OrderListRepository();
    }
}
