package org.example.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProductImageDto implements Serializable {
    private Long id;
    private String name;
    private int priority;
    private LocalDateTime dateCreated;
    private Long productId;
}
