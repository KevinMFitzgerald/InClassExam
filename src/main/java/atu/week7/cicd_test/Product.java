package atu.week7.cicd_test;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    //@Pattern(regexp = "PROD-", message = "has to follow the produce code PROD-XXXX")
    public String ProductCode;
    @Size(min=0,max = 100,message = "product name is too long")
    private String ProductName;
    private String category;
    @PositiveOrZero(message = "quainty has to be above a non negative int")
    private int quanityInStock;
    @Positive(message = "price must be above 0")
    private double price;

}
