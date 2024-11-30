package com.example.todo_back.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RestController
public class StatusController {

    @Autowired
    private DataSource dataSource;

    @GetMapping("/status")
    public String checkStatus() {
        try (Connection connection = dataSource.getConnection()) {
            if (connection.isValid(1)) {
                return "La aplicación está conectada a la base de datos correctamente.";
            }
        } catch (SQLException e) {
            return "Error de conexión: " + e.getMessage();
        }
        return "La conexión a la base de datos falló.";
    }
}