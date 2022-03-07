package com.mentormate.restaurant.controller;

import com.mentormate.restaurant.model.dto.tableDTO.TableDTO;
import com.mentormate.restaurant.model.service.services.TableService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class TableController {

    private final TableService tableService;


    public TableController(TableService tableService) {
        this.tableService = tableService;
    }

    @GetMapping("api/v1/getAllTables")
    public List<TableDTO> getAllTables() {
        return tableService.getAllTables();
    }

    @GetMapping("api/v1/getTableByNumber")
    public TableDTO getByNumber(@RequestParam final int tableNumber) {
        return tableService.getByNumber(tableNumber);
    }

    @GetMapping("api/v1/getTableById")
    public TableDTO getById(@RequestParam final int tableId) {
        return tableService.getById(tableId);
    }


}
