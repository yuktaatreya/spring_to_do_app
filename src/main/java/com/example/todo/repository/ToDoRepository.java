package com.example.todo.repository;

import com.example.todo.data.ToDo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ToDoRepository extends MongoRepository<ToDo,String> {

}
