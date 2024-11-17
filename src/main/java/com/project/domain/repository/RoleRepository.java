package com.project.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.domain.models.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
