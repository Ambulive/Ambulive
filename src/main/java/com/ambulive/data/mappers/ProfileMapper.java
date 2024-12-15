package com.ambulive.data.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.ambulive.data.dtos.Profile.ProfileCreateDTO;
import com.ambulive.data.dtos.Profile.ProfileUpdateDTO;
import com.ambulive.data.dtos.Profile.ProfileResponseDTO;
import com.ambulive.data.models.Profile;

@Mapper
public interface ProfileMapper {
    ProfileMapper INSTANCE = Mappers.getMapper(ProfileMapper.class);

    // Mapping to Response
    ProfileResponseDTO toResponseDTO(Profile profile);
    List<ProfileResponseDTO> toResponseDTOList(List<Profile> profiles);

    // Mapping to Create
    Profile toEntity(ProfileCreateDTO profileCreateDTO);

    // Mapping to Update
    @Mapping(target = "id", ignore = true)
    Profile toEntity(ProfileUpdateDTO profileUpdateDTO);
}