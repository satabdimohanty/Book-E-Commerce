package com.example.BookECommerce.Service;

import com.example.BookECommerce.Entity.Admin;
import com.example.BookECommerce.Entity.User;
import com.example.BookECommerce.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public User postUser( User user)
    {
        return userRepository.save(user);

    }
    public List<User>getUser()
    {
        return userRepository.findAll();
    }
    public User userBy(int id)
    {
        return userRepository.findById(id).get();

    }
    public  void deleteBy(int id)
    {
         userRepository.deleteById(id);
    }
    public User editUser(User user, int id)
    {
        User user1=userRepository.findById(id).get();
        user1.setUserName(user.getUserName());
        user1.setUserEmail(user.getUserEmail());
        user1.setUserNumber(user.getUserNumber());
        user1.setUserPassword(user.getUserPassword());
        return userRepository.save(user1);

    }


}
