package org.example.module;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private LocalDate dob;
    private String mobile;
    private String userType; // Seller/Buyer
    private double balance;

    // Getters and setters
}

