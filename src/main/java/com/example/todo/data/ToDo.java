package com.example.todo.data;

import org.springframework.data.annotation.Id;

public class ToDo {
    @Id
    private String id;
    private String title;
    private Boolean completed;

    public ToDo(String title, Boolean completed){
        this.title=title;
        this.completed=completed;
    }

    public String getId(){
        return id;
    }
    public boolean isCompleted(){
        return completed;
    }

    public String getTitle(){
        return title;
    }
}
