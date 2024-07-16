package com.ling.MyWebForum.service;

import com.ling.MyWebForum.models.user.User;
import com.ling.MyWebForum.models.user.UserDTO;
import com.ling.MyWebForum.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User findUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User createUser(UserDTO user) {
        return userRepository.save(user);
    }

    public User updateUser(Long id, UserDTO user) {
        User existingUser = userRepository.findById(id).orElse(null);
        if (existingUser != null) {
            existingUser.setName(user.name());
            existingUser.setDateOfCreating(user.dateOfCreating());
            return userRepository.save(existingUser);
        } else {
            return null;
        }
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
