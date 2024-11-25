package com.leek.demo3_springsec.Repository;


import com.leek.demo3_springsec.Entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    @Query("SELECT r FROM Role r WHERE r.roleName = :roleName")
    public Role getRoleByRoleName(@Param("name") String roleName);
    Optional<Role> findByRoleName(String roleName);

}
