package springsecurity69.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import springsecurity69.demo.model.user;
import springsecurity69.demo.repository.userrepo;

@Service
public class userService {

    @Autowired
    private userrepo userRepository;

    // Register a new user
    public user registerUser(user user) {
        // user.setPassword(passwordEncoder.encode(user.getPassword())); // Hash the
        // password
        return userRepository.save(user);
    }

    // Find user by username
    public Optional<user> findUserByUsername(String username) {
        return userRepository.findById(username);
    }

    // Get all users
    public List<user> getAllUsers() {
        return userRepository.findAll();
    }

    // Update user details
    public user updateUser(user user) {
        return userRepository.save(user);
    }

    // Delete user by username
    public void deleteUser(String username) {
        userRepository.deleteById(username);
    }

    // Check if a username exists
    public boolean usernameExists(String username) {
        return userRepository.existsById(username);
    }

}
