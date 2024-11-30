package com.example.todo_back.service;

import com.example.todo_back.domain.Tarea;
import com.example.todo_back.repository.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TareaService {

    @Autowired
    private TareaRepository tareaRepository;

    // Crear una nueva tarea
    public Tarea crearTarea(Tarea tarea) {
        return tareaRepository.save(tarea);
    }

    // Obtener todas las tareas
    public List<Tarea> obtenerTodasLasTareas() {
        return tareaRepository.findAll();
    }

    // Obtener una tarea por ID
    public Optional<Tarea> obtenerTareaPorId(Long id) {
        return tareaRepository.findById(id);
    }

    // Actualizar una tarea
    public Tarea actualizarTarea(Long id, Tarea tarea) {
        return tareaRepository.findById(id)
                .map(t -> {
                    t.setDescripcion(tarea.getDescripcion());
                    t.setFechaLimite(tarea.getFechaLimite());
                    t.setEstado(tarea.getEstado());
                    t.setPrioridad(tarea.getPrioridad());
                    return tareaRepository.save(t);
                }).orElseThrow(() -> new IllegalArgumentException("Tarea no encontrada"));
    }

    // Eliminar una tarea
    public void eliminarTarea(Long id) {
        tareaRepository.deleteById(id);
    }
}