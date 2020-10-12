package com.noBrokerage.UserManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.noBrokerage.UserManagement.Entity.UserRoles;

@Repository
public interface UserRolesRepository extends JpaRepository<UserRoles,Integer>{

}
