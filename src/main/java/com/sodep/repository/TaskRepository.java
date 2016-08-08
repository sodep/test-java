/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sodep.repository;

import com.sodep.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author rodrigo
 */
public interface TaskRepository extends JpaRepository<Task, Long> {
    
}
