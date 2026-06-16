package com.example.service;

import com.example.entity.Address;
import com.example.entity.User;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.example.repository.UserRepository;
import java.util.List;

@Service
@Transactional
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {this.userRepository = userRepository;}

    public void save(User user) {
        if (user.getAddress() != null) {
            Address address = user.getAddress();
            address.setUser(user);
            if (user.getId() != 0) {
                userRepository.findById(user.getId())
                        .ifPresent(existing -> {
                            if (existing.getAddress() != null) {
                                address.setId(existing.getAddress().getId());
                            }
                        });
            }
        }
        userRepository.save(user);
    }

    public void deleteUser(int id){
        userRepository.deleteById(id);
    }

    public void updateUser(int id, String name, String lastName, Integer age){
        userRepository.findById(id).ifPresent(user -> {
            user.setName(name);
            user.setLastName(lastName);
            user.setAge(age);
        });
    }

    public User findById(int id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found: " + id));
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }
}
