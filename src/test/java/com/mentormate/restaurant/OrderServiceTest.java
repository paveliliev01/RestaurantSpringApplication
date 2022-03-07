package com.mentormate.restaurant;

import com.mentormate.restaurant.model.dto.orderDTO.OrderDTO;
import com.mentormate.restaurant.model.pojos.OrderStatus;
import com.mentormate.restaurant.model.pojos.Table;
import com.mentormate.restaurant.model.pojos.User;
import com.mentormate.restaurant.model.repository.OrderRepository;
import com.mentormate.restaurant.model.service.converters.OrderConverter;
import com.mentormate.restaurant.model.service.services.OrderService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class OrderServiceTest {
    @InjectMocks
    OrderService orderService;

    @Mock
    OrderRepository orderRepository;

    @Mock
    OrderConverter userConverter;

    @Test
    public void test() {
        User user = new User();
        user.setUserId(1);
        user.setUserName("Waiter");
        user.setPassword("Waiter");
        user.setUserEmail("WaiterEmail");

        Table table = new Table();
        table.setTableNumber(1);
        table.setTableId(1);
        OrderStatus orderStatus = new OrderStatus();
        orderStatus.setStatus("active");
        orderStatus.setStatusId(1);

        OrderDTO orderDTO = orderService.createOrder(user, table, orderStatus);


    }
}
