package com.mentormate.restaurant.model.pojos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@Entity
@javax.persistence.Table(name = "restaurant_tables")
public class Table {

    @Id
    @Column(name = "table_id", nullable = false)
    private Integer tableId;

    @Column(name = "table_number", nullable = false)
    private int tableNumber;


}
