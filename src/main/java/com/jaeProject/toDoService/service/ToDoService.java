package com.jaeProject.toDoService.service;

import com.jaeProject.toDoService.model.Note;
import com.jaeProject.toDoService.model.NoteDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ToDoService {

    @Autowired
    final private ToDoRepository toDoRepository;

    public ToDoService(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    public void runService(){
        System.out.println("the runService method is ran");
    }

    public void addToDo(NoteDTO noteDTO){

        Note note = Note.builder()
                .id(noteDTO.getId())
                .content(noteDTO.getContent())
                .build();

        toDoRepository.save(note);
    }

    public List<NoteDTO> getAllToDo(){
        Iterable<Note> notes = toDoRepository.findAll();
        List<NoteDTO> notesDTO = new ArrayList<>();

        notes.forEach( note -> {
            notesDTO.add(NoteDTO.builder()
                .id(note.getId())
                .content(note.getContent())
                .build()
            );
        });

        return notesDTO;
    }
}
