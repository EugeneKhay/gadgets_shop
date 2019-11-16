package com.eugkhay.gadgets_shop.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
public class ClientAddress {

    @Id
    public ObjectId _id;
    private String country;
    private String city;
    private String postCode;
    private String house;
    private String flat;
}
