/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sodep.services;

import com.sodep.entities.Task;
import java.util.List;

/**
 *
 * @author rodrigo
 */
public interface TaskService {

    public List<Task> findAll();
    
}
