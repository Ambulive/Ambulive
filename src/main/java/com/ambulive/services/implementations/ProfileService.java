package com.ambulive.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ambulive.data.dtos.Profile.ProfileCreateDTO;
import com.ambulive.data.dtos.Profile.ProfileResponseDTO;
import com.ambulive.data.dtos.Profile.ProfileUpdateDTO;
import com.ambulive.data.mappers.ProfileMapper;
import com.ambulive.data.models.Profile;
import com.ambulive.repositories.ProfileRepository;
import com.ambulive.interfaces.IProfileInterface;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ProfileService implements IProfileInterface {

    @Autowired
    private ProfileRepository profileRepository;

    @Override
    public ProfileResponseDTO createProfile(ProfileCreateDTO profileDTO) {
        Profile profile = ProfileMapper.INSTANCE.toEntity(profileDTO);
        Profile createdProfile = profileRepository.save(profile);

        return ProfileMapper.INSTANCE.toResponseDTO(createdProfile);
    }

    @Override
    public ProfileResponseDTO findProfileById(long id) {
        Profile profile = profileRepository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("Profile não encontrado"));
            
        return ProfileMapper.INSTANCE.toResponseDTO(profile);
    }

    @Override
    public void deleteProfileById(long id) {
        profileRepository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("Profile não encontrado"));
            
        profileRepository.deleteById(id);
    }

    @Override
    public ProfileResponseDTO updateProfileById(long id, ProfileUpdateDTO profileDTO) {
        Profile profile = profileRepository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("Profile não encontrado"));
        
        profile.setName(profileDTO.getName() != null ? profileDTO.getName() : profile.getName());
        profile.setEmail(profileDTO.getEmail() != null ? profileDTO.getEmail() : profile.getEmail());
        
        return ProfileMapper.INSTANCE.toResponseDTO(profileRepository.save(profile));
    }

    @Override
    public List<ProfileResponseDTO> findAll() {
        List<Profile> profiles = profileRepository.findAll();

        return ProfileMapper.INSTANCE.toResponseDTOList(profiles);
    }
}
