package com.example.todoAppbackend.controller;


import com.example.todoAppbackend.dto.Todo;
import com.example.todoAppbackend.service.TodoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = { "http://localhost:3000" })
@RestController
public class TodoController {

    @Autowired
    private TodoService todoService;

    Logger log = LoggerFactory.getLogger("Todo application");
    @RequestMapping(method = RequestMethod.POST ,value="/todos/add")
    public void createTodo(@RequestBody Todo todo){
        todoService.createTodo(todo);
        log.info("todo created");
    }

    @RequestMapping(value="/todos/")
    public Iterable<Todo> getAllTodos(){
        return todoService.getAllTodos();
    }

    @RequestMapping(method = RequestMethod.POST,value="/todos/update/{id}")
    public void updateTodo(@RequestBody Todo todo,@PathVariable int id){
        todoService.editTodo(todo,id);
        log.info("updated todo" + todo);
    }

    @RequestMapping(method = RequestMethod.DELETE,value="/todos/{id}")
    public void deleteTodo(@RequestBody Todo todo,@PathVariable int id){
        todoService.deleteTodo(todo,id);
    }

}
