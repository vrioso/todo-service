package com.jaeProject.toDoService.service;

import com.jaeProject.toDoService.model.Note;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.UUID;

@Repository 
public interface ToDoRepository extends CrudRepository<Note, UUID> {

}
