package com.example.BookECommerce.Controller;

import com.example.BookECommerce.Entity.Admin;
import com.example.BookECommerce.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;
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
        return "redirect:/services";
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
        return "redirect:/services";
    }
}
