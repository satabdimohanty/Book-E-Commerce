package com.example.BookECommerce.Service;

import com.example.BookECommerce.Entity.Admin;
import com.example.BookECommerce.Repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    @Autowired
    private AdminRepository adminRepository;

    public Admin getAdmin(Admin admin)
    {
        return adminRepository.save(admin);
    }
    public List<Admin>getAll()
    {
        return adminRepository.findAll();
    }
    public Admin getAdminBy(int id)
    {
        return adminRepository.findById(id).get();

    }
    public void deleteAdminBy(int id)
    {
         adminRepository.deleteById(id);

    }
}
