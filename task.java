/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.addy.taskmanagement.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 *
 * @author admin
 */
@Entity

public class task {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String taskname;
    private String description;
    private int time;
    public task() {
    }
    public task(Long id, String taskname, String description, int time) {
    
        this.id = id;
        this.taskname = taskname;
        this.description = description;
        this.time = time;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String gettaskname() {
        return taskname;
    }
    public void settaskname(String studentname) {
        this.taskname = studentname;
    }
    public String getdescription() {
        return description;
    }
    public void setdescription(String description) {
        this.description = description;
    }
    public int gettime() {
        return time;
    }
    public void settime (int time) {
        this.time = time;
    }
}
       

