package com.eugkhay.gadgets_shop.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import java.time.LocalDate;
import java.util.Set;

/**
 * Represents the user of the application
 */
@Data
@NoArgsConstructor
public class Client {

    @Id
    public ObjectId _id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String email;
    private String phone;
    private String password;
    private Set<ClientAddress> addressList;
    private Set<Order> orders;
}
