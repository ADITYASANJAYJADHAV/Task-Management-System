/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.addy.taskmanagement.repository;

import com.addy.taskmanagement.domain.task;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Repository;

/**
 *
 * @author admin
 */
@Repository


public interface taskrepository extends JpaRepository<Task, Long> {

    /**
     *
     * @return
     */
    @Override
    public List<task> findAll();

    public void save(task description);

    public Object findById(long id);

    public void deleteById(long id);
    
}
