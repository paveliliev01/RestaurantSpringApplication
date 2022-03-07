package com.mentormate.restaurant.model.dto.orderDTO;

import com.mentormate.restaurant.model.pojos.OrderStatus;
import com.mentormate.restaurant.model.pojos.Table;
import com.mentormate.restaurant.model.pojos.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
public class OrderDTO {

    private Integer orderId;
    private Table table;
    private User waiter;
    private OrderStatus orderStatus;
    private Date orderDate;

}
