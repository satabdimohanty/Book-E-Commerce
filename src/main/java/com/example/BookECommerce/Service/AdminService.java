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
    //post the data
    public Admin getAdmin(Admin admin)
    {
        return adminRepository.save(admin);
    }
    //get the data
    public List<Admin>getAll()
    {
        return adminRepository.findAll();
    }
    //get specify data
    public Admin getAdminBy(int id)
    {
        return adminRepository.findById(id).get();

    }
    //delete the data
    public void deleteAdminBy(int id)
    {
         adminRepository.deleteById(id);

    }
    //edit the data
    public Admin editAdmin(Admin admin,int id)
    {
        Admin admin1=adminRepository.findById(id).get();
        admin1.setAdminName(admin.getAdminName());
        admin1.setAdminEmail(admin.getAdminEmail());
        admin1.setAdminNumber(admin.getAdminNumber());
        admin1.setAdminPassword(admin.getAdminPassword());
        return adminRepository.save(admin1);

    }
}
