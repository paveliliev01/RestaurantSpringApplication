package com.mentormate.restaurant.model.service.converters;

import com.mentormate.restaurant.model.dto.tableDTO.TableDTO;
import com.mentormate.restaurant.model.pojos.Table;
import org.springframework.stereotype.Component;

@Component
public class TableConverter {

    public TableDTO toDto(Table entity) {
        TableDTO dto = new TableDTO();
        dto.setTableId(entity.getTableId());
        dto.setTableNumber(entity.getTableNumber());

        return dto;
    }

    public Table toEntity(TableDTO dto) {
        Table entity = new Table();
        entity.setTableId(dto.getTableId());
        entity.setTableNumber(dto.getTableNumber());

        return entity;
    }
}
