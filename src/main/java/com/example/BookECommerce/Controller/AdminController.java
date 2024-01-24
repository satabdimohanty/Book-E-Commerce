package com.example.BookECommerce.Controller;

import com.example.BookECommerce.Entity.Admin;
import com.example.BookECommerce.Entity.User;
import com.example.BookECommerce.Service.AdminService;
import com.example.BookECommerce.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;
    @Autowired
    private UserService userService;
    public String returnback()
    {
        List<Admin>admins=adminService.getAll();
        List<User>users=userService.getUser();
        return "here we are in admin page";
    }

    //post the data
    @PostMapping("/post")
    public String addAdmin(@RequestBody Admin admin)
    {
         adminService.getAdmin(admin);
        return "redirect:/services";

    }
    //get all the data
    @GetMapping("/get")
    public String getAdmin()
    {
         return "redirect:/services";
    }
    //get specify data
    @GetMapping("/getAdmin/{id}")
    public  String getAdminBy(@RequestBody Admin admin, @PathVariable int id)
    {
        adminService.getAdminBy(id);
        return "found the data";
    }
    //edit the data

    @PostMapping("/updateAdmin/{id}")
   public ResponseEntity<?>updatedata(@RequestBody Admin admin,@PathVariable int id)
    {
       return new ResponseEntity<>(adminService.editAdmin(admin, id), HttpStatus.CREATED) ;


    }
  //delete the data
    @GetMapping("/deleteAdmin/{id}")
    public  String deleteAdmin(@RequestBody Admin admin,@PathVariable int id)
    {
        adminService.deleteAdminBy(id);
        return "deleted successfully";
    }

    //USER DATA
   @PostMapping("/postUser")
    public String postUser(@RequestBody User user,@PathVariable int id)
    {
        userService.getUser();
        return  "redirect:/services";
    }
    @GetMapping("/getUser")
    public String getUser()
    {
        return "user_page";
    }
    @GetMapping("/getUserBy/{id}")
    public String getUserBy(@RequestBody User user,@PathVariable int id)
    {
        userService.userBy(id);
        return  "found the data";
    }
    @GetMapping("/deleteUser/{id}")
    public String deleteUser(@RequestBody User user,@PathVariable int id)
    {
        userService.deleteBy(id);
        return "deleted successfully";
    }
    @PostMapping("/editUser/{id}")
    public ResponseEntity<?>edituser(@RequestBody User user,@PathVariable int id)
    {
        return  new ResponseEntity<>(userService.editUser(user,id),HttpStatus.CREATED);

    }
}
