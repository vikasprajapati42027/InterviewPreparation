package org.example.controller;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    // Constructor injection or @Autowired

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return userService.registerUser(user);
    }

    @PostMapping("/login")
    public User login(@RequestParam String email, @RequestParam String password) {
        return userService.login(email, password);
    }
    // Other endpoints for user operations
}
