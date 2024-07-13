package com.jaeProject.toDoService.model;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder(builderClassName = "BuilderMe")
public class NoteDTO {


    private UUID id;
    private String content;
}
