/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.addy.taskmanagement.service;

import com.addy.taskmanagement.domain.task;
import com.addy.taskmanagement.repository.taskrepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */
@Service

public class taskservice {
    
    @Autowired
    private taskrepository repo;
    
    public List<task> listAll() {
        return repo.findAll();
    }
     
    public void save(task description) {
        repo.save(description);
    }
     
    public task get(long id) {
        return repo.findById(id).get();
    }
     
    public void delete(long id) {
        repo.deleteById(id);
    }

    public void save(Object description) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
