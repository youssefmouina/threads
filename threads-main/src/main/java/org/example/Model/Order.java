package org.example.Model;

import lombok.Data;

@Data
public class Order {
    int idOrder;
    String dateOrder;
    float amount;
    int customerId;

}
