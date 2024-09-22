package com.project.hexagonal.adapters.out.repository.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "addresses")
public class AddressEntity {

    private String street;

    private String city;

    private String state;

    private String zipCode;

}
