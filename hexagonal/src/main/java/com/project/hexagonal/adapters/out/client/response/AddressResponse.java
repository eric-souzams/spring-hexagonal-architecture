package com.project.hexagonal.adapters.out.client.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AddressResponse {

    private String street;

    private String city;

    private String state;

    private String zipCode;

}
