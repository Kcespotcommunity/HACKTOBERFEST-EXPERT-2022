package com.example.gymbackend.serviceimpl;

import com.example.gymbackend.dto.AdminDTO;
import com.example.gymbackend.entity.Admin;
import com.example.gymbackend.repository.AdminRepo;
import com.example.gymbackend.service.AdminService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Objects;

public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminRepo adminRepo;

    @Autowired
    ModelMapper modelMapper;

    public AdminDTO insertAdmin(AdminDTO adminDTO) {
        Admin admin = modelMapper.map(adminDTO, Admin.class);
        return Objects.isNull(admin) ? null : modelMapper.map(adminRepo.save(admin), AdminDTO.class);
    }

    public String updateAdmin(AdminDTO adminDTO) {
        Admin admin = modelMapper.map(adminDTO, Admin.class);
        if (Objects.isNull(admin))
            return "Update Failed";
        adminRepo.save(admin);
        return "Updated";
    }

    public List<Admin> getAllAdmins() {
        return CollectionUtils.isEmpty(adminRepo.findAll()) ? null : adminRepo.findAll();
    }


}
