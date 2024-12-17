package com.ambulive.interfaces;

import java.util.List;

import com.ambulive.data.dtos.Profile.ProfileCreateDTO;
import com.ambulive.data.dtos.Profile.ProfileResponseDTO;
import com.ambulive.data.dtos.Profile.ProfileUpdateDTO;

public interface IProfileInterface {
    public ProfileResponseDTO createProfile(ProfileCreateDTO profile);
    public ProfileResponseDTO findProfileById(long id);
    public void deleteProfileById(long id);
    public ProfileResponseDTO updateProfileById(long id, ProfileUpdateDTO profile);
    public List<ProfileResponseDTO> findAll();
}
