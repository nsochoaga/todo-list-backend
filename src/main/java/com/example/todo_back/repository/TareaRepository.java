package com.example.todo_back.repository;

import com.example.todo_back.domain.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TareaRepository extends JpaRepository<Tarea, Long> {
}
