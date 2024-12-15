package com.ambulive.data.dtos.Profile;

import com.ambulive.data.enums.ProfileRoleEnum;
import com.ambulive.data.enums.ProfileStatusEnum;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class ProfileUpdateDTO {
    
    @NotBlank(message = "Name is mandatory.")
    @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "Name must contain only letters and spaces.")
    @Size(min = 3, max = 255, message = "Name must be between 3 and 255 characters.")
    private String name;

    @NotBlank(message = "Email is mandatory.")
    @Email(message = "Email should be valid.")
    @Size(min = 3, max = 255, message = "Email must be between 3 and 255 characters.")
    private String email;

    @NotBlank(message = "Phone is mandatory.")
    @Pattern(regexp = "\\d{11}", message = "Phone must have exactly 11 digits.")
    private String phone;

    @NotNull(message = "Role is mandatory.")
    private ProfileRoleEnum role;

    @NotNull(message = "Status is mandatory.")
    private ProfileStatusEnum status;

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
} 