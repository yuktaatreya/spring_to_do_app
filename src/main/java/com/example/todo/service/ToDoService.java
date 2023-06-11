package com.example.todo.service;

import com.example.todo.data.ToDo;
import com.example.todo.exception.EntityNotFoundException;
import com.example.todo.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService {
    @Autowired
    ToDoRepository toDoRepository;

    public List<ToDo> findAll(){

        return toDoRepository.findAll();
    }

    public ToDo findById(String id){
        return toDoRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public ToDo save(ToDo todo){
       return toDoRepository.save(todo);
    }

    public void deleteById(String id){
        toDoRepository.deleteById(id);
    }
}
