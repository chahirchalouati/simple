package crcl.simple.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashSet;
import java.util.Set;

@Document
@Data
public class Product {

    @Id
    private String id;
    private String name;
    private String description;
    private Double price;
    private Set<Media> images = new HashSet<>();
    @DBRef
    private Category category;

}
