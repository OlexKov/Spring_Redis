package org.example.dtos;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class ProductDto implements Serializable {
    private Long id;
    private String name;
    private String description;
    private LocalDateTime creationTime;
    private double price;
    private double discount;
    private List<ProductImageDto> images;
    private Long categoryId;
    private String categoryName;
    private List<Long> favoriteInUsers;
}
