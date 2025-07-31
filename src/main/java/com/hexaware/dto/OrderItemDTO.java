package com.hexaware.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * DTO for transferring individual order item details
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OrderItemDTO {

    private int orderItemId;

    private MenuDTO menu;

    private int quantity;

    private BigDecimal price;
}
