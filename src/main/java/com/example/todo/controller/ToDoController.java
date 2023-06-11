package com.example.todo.controller;

import com.example.todo.data.ToDo;
import com.example.todo.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/todo")
public class ToDoController {
    @Autowired
    ToDoService toDoService;

    @GetMapping
    public List<ToDo> findAll(){

        return toDoService.findAll();
    }

    @GetMapping("/{id}")
    public ToDo findById(@PathVariable String id){
        return toDoService.findById(id);
    }

    @PostMapping
    public ToDo create (@RequestBody ToDo todo){
        return toDoService.save(todo);
    }

    @PutMapping("/{id}")
    public ToDo update (@RequestBody ToDo todo){
        return toDoService.save(todo);
    }

    @DeleteMapping("/{id}")
    public void delete (@PathVariable String id){
        toDoService.deleteById(id);
    }

}
