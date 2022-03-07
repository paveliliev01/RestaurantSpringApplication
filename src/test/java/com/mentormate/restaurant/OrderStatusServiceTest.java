package com.mentormate.restaurant;

import com.mentormate.restaurant.model.repository.OrderStatusRepository;
import com.mentormate.restaurant.model.service.converters.OrderStatusConverter;
import com.mentormate.restaurant.model.service.services.OrderStatusService;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class OrderStatusServiceTest {
    @InjectMocks
    OrderStatusService orderStatusService;
    @Mock
    OrderStatusRepository orderStatusRepository;
    @Mock
    OrderStatusConverter orderStatusConverter;
}
