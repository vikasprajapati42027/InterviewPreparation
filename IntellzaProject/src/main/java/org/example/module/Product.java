package org.example.module;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productName;
    private String description;
    private String image;
    private double sellPrice;
    private double costPrice;
    private int stockUnit;

    // Getters and setters
}

