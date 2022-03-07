package com.mentormate.restaurant.model.pojos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "order_status")
public class OrderStatus {

    @Id
    @Column(name = "status_id", nullable = false)
    private Integer statusId;

    @Column(name = "status", nullable = false)
    private String status;

}