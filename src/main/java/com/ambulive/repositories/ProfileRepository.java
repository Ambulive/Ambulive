package com.ambulive.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ambulive.data.models.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long> {
    
}