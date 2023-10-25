package org.example.hw_2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Order {
    private Buyer buyer;
    private Product product;
    private int quantity;

}
