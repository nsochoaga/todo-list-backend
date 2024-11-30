package com.example.todo_back.controller;

import com.example.todo_back.domain.Tarea;
import com.example.todo_back.service.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tareas")
public class TareaController {

    @Autowired
    private TareaService tareaService;

    @PostMapping // Create
    public Tarea crearTarea(@RequestBody Tarea tarea) {
        return tareaService.crearTarea(tarea);
    }

    @GetMapping // Read All
    public List<Tarea> obtenerTodasLasTareas() {
        return tareaService.obtenerTodasLasTareas();
    }

    @GetMapping("/{id}") // Read by ID
    public Optional<Tarea> obtenerTareaPorId(@PathVariable Long id) {
        return tareaService.obtenerTareaPorId(id);
    }

    @PutMapping("/{id}") // Update
    public Tarea actualizarTarea(@PathVariable Long id, @RequestBody Tarea tarea) {
        return tareaService.actualizarTarea(id, tarea);
    }

    @DeleteMapping("/{id}") // Delete
    public void eliminarTarea(@PathVariable Long id) {
        tareaService.eliminarTarea(id);
    }
}