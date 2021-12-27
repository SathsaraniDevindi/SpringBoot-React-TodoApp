package com.example.todoAppbackend.repository;

import com.example.todoAppbackend.dto.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo,Integer> {
}
