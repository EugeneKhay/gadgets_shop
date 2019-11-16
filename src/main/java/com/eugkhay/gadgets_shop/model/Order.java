package com.eugkhay.gadgets_shop.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
@NoArgsConstructor
public class Order {

    @Id
    public ObjectId _id;
    private Client client;
    private PaymentType paymentType;
    private DeliveryType deliveryType;
    private List products;
    private PaymentStatus paymentStatus;
    private DeliveryStatus deliveryStatus;
}
