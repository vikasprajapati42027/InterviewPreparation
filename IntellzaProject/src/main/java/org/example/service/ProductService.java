package org.example.service;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    // Constructor injection or @Autowired

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product addProduct(Product product) {
        // Implement logic to add product
        return productRepository.save(product);
    }
    // Other methods
}