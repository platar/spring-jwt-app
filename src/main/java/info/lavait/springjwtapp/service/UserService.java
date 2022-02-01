package info.lavait.springjwtapp.service;

import info.lavait.springjwtapp.domain.Role;
import info.lavait.springjwtapp.domain.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}
