package com.jaeProject.toDoService.controller;

import com.jaeProject.toDoService.model.Note;
import com.jaeProject.toDoService.model.NoteDTO;
import com.jaeProject.toDoService.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GreetingsController {

    @Autowired
    public ToDoService toDoService;

    @RequestMapping("/")
    public String getGreeting(){
        return "hello worldddd";
    }

    @PostMapping("/add")
    public ResponseEntity<NoteDTO> postGreeting(@RequestBody NoteDTO noteDTO){
        System.out.println(noteDTO.getContent());
        toDoService.addToDo(noteDTO);
        return new ResponseEntity<>(noteDTO, HttpStatus.CREATED);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<NoteDTO>> getAllToDo(){

        List<NoteDTO> notesDTO = toDoService.getAllToDo();
        return new ResponseEntity<>(notesDTO, HttpStatus.OK);
    }
}
