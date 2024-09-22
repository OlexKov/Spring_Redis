package org.example.models;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PaginationResponse<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    private Iterable<T> itemsList;
    private long totalElements ;
}
