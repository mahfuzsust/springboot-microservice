package info.mahfuz.userservice.controller;

import info.mahfuz.userservice.model.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private List<User> users;

    public UserController() {
        users = new ArrayList<>();
        users.add(new User(1, "Test 1"));
        users.add(new User(2, "Test 2"));
        users.add(new User(3, "Test 3"));
    }

    @RequestMapping("/get/{id}")
    public User getUser(@PathVariable("id") int id) {
        return users.stream().filter(user -> user.getId() == id).findAny().orElse(null);
    }
}
