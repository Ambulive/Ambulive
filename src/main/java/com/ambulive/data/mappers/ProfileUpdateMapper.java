package com.ambulive.data.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.ambulive.data.dtos.Profile.ProfileUpdateDTO;
import com.ambulive.data.models.Profile;

@Mapper
public interface ProfileUpdateMapper {
    ProfileUpdateMapper INSTANCE = Mappers.getMapper(ProfileUpdateMapper.class);

    @Mapping(target = "id", ignore = true)
    Profile toEntity(ProfileUpdateDTO profileDTO);
}