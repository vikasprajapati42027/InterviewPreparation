package org.example.Repository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
    // Other custom queries if needed
}

