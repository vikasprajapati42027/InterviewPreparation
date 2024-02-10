package org.example.service;

import org.example.Repository.UserRepository;
import org.example.module.User;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Constructor injection or @Autowired

    public User registerUser(User user) {
        // Implement validation logic

        // Save user to database
        return userRepository.save(user);
    }

    public User login(String email, String password) {
        // Implement login logic
        // Validate credentials and return user
        return userRepository.findByEmail(email);
    }
    // Other methods
}

