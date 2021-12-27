package com.example.todoAppbackend.service;

import com.example.todoAppbackend.dto.Todo;
import com.example.todoAppbackend.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public void createTodo(Todo todo){
        todoRepository.save(todo);
    }

    public Iterable<Todo> getAllTodos(){
        return todoRepository.findAll();
    }
    public Optional<Todo> getTodo(int id){
        return todoRepository.findById(id);
    }

    public void editTodo(Todo todo, int id){
        //todoRepository.findById(id).get();
        todoRepository.save(todo);
    }

    public void deleteTodo(Todo todo,int id){
        todoRepository.delete(todo);
    }
}
