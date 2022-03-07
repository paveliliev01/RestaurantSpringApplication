package com.mentormate.restaurant.model.service.services;

import com.mentormate.restaurant.model.dto.tableDTO.TableDTO;
import com.mentormate.restaurant.model.pojos.Table;
import com.mentormate.restaurant.model.repository.TableRepository;
import com.mentormate.restaurant.model.service.converters.TableConverter;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TableService {


    private final TableRepository tableRepository;
    private final TableConverter tableConverter;

    public TableService(TableRepository tableRepository, TableConverter tableConverter) {
        this.tableRepository = tableRepository;
        this.tableConverter = tableConverter;
    }

    public List<TableDTO> getAllTables() {
        List<Table> tableList = tableRepository.findAll();
        List<TableDTO> tableDTOStream = tableList.stream().map(tableConverter::toDto).collect(Collectors.toList());
        return tableDTOStream;
    }

    public TableDTO getByNumber(int tableNumber) {
        return tableConverter.toDto(tableRepository.findByTableNumber(tableNumber).get());
    }

    public TableDTO getById(int tableId) {
        return tableConverter.toDto(tableRepository.findById(tableId).get());
    }
}
