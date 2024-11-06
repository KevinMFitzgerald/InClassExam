package atu.week7.cicd_test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private String ProductCode;

    private String ProductName;
    private String category;
    private int quanityInStock;
    private double price;

}
