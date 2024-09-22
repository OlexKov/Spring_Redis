package org.example.dtos;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
public class CategoryDto implements Serializable{
    private Long id;
    private String name;
    private String image;
    private String description;
    private LocalDateTime creationTime;
}
