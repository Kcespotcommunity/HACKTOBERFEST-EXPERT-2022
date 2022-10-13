package com.example.gymbackend.service;

import com.example.gymbackend.dto.AdminDTO;
import com.example.gymbackend.entity.Admin;

import java.util.List;

public interface AdminService {

    public AdminDTO insertAdmin(AdminDTO adminDTO);

    public String updateAdmin(AdminDTO adminDTO);

    public List<Admin> getAllAdmins();

    public String deleteAdmin(AdminDTO adminDTO);

}
