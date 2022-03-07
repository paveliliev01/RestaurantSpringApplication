package com.mentormate.restaurant;

import com.mentormate.restaurant.model.repository.TableRepository;
import com.mentormate.restaurant.model.service.converters.TableConverter;
import com.mentormate.restaurant.model.service.services.TableService;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TableServiceTest {
    @InjectMocks
    TableService tableService;

    @Mock
    TableRepository tableRepository;

    @Mock
    TableConverter tableConverter;
}
