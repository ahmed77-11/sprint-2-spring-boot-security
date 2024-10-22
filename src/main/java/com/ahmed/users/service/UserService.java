package com.ahmed.users.service;

import com.ahmed.users.entities.Role;
import com.ahmed.users.entities.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    User findByUsername(String username);
    Role addRole(Role role);
    User addRoleToUser(String username, String roleName);
    List<User> findAllUsers();
}
