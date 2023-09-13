package com.geekster.UserManagementSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    List<User> userlist;
    @PostMapping("addUser")
    public String addUser(@RequestBody User myuser) {
        userlist.add(myuser);
        return "User added";
    }
    @GetMapping("getUser/{userid}")
    public Integer getUser(@PathVariable Integer userid) {
        return userid;
    }
    @GetMapping("getAllUser")
    public List<User> AllUser() {
        return userlist;
    }
    @PutMapping("UpdateUserInfo")
    public String UpdateUserbyId(@RequestParam Integer id, @RequestParam String username, @RequestParam Long number, @RequestParam String address) {
        for (User user : userlist) {
            if (user.getUserId().equals(id)) {
                user.setUserAddress(username);
                user.setUserPhoneNumber(number);
                user.setUserAddress(address);
                return "user:" + id + "updated to" + username + number + address;
            }
        }
        return "Invalid Id";
    }
    @DeleteMapping("DeleteUser")
    public String DeleteUserbyId(@RequestParam Integer id) {
        for (User user : userlist) {
            if (user.getUserId().equals(id)) {
                userlist.remove(user);
                return "userlist:" + id + "deleted";
            }
        }
        return "Invalid Id";
    }
}







