package com.example.todoAppbackend.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String todo_description;
    private String todo_responsible;
    private String todo_priority;
    private boolean todo_completed;

    public Todo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTodo_description() {
        return todo_description;
    }

    public void setTodo_description(String todo_description) {
        this.todo_description = todo_description;
    }

    public String getTodo_responsible() {
        return todo_responsible;
    }

    public void setTodo_responsible(String todo_responsible) {
        this.todo_responsible = todo_responsible;
    }

    public String getTodo_priority() {
        return todo_priority;
    }

    public void setTodo_priority(String todo_priority) {
        this.todo_priority = todo_priority;
    }

    public boolean isTodo_completed() {
        return todo_completed;
    }

    public void setTodo_completed(boolean todo_completed) {
        this.todo_completed = todo_completed;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", todo_description='" + todo_description + '\'' +
                ", todo_responsible='" + todo_responsible + '\'' +
                ", todo_priority='" + todo_priority + '\'' +
                ", todo_completed=" + todo_completed +
                '}';
    }
}
