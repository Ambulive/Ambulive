package com.ambulive.data.dtos.Profile;

import com.ambulive.data.enums.ProfileRoleEnum;
import com.ambulive.data.enums.ProfileStatusEnum;

public class ProfileResponseDTO {
    
    private int id;

    private String name;

    private String email;

    private String phone;

    private ProfileRoleEnum role;

    private ProfileStatusEnum status;

    private String createdAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ProfileRoleEnum getRole() {
        return role;
    }

    public void setRole(ProfileRoleEnum role) {
        this.role = role;
    }

    public ProfileStatusEnum getStatus() {
        return status;
    }

    public void setStatus(ProfileStatusEnum status) {
        this.status = status;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}