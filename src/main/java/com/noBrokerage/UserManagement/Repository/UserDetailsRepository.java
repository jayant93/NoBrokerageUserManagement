package com.noBrokerage.UserManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.noBrokerage.UserManagement.Entity.UserDetails;

@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails,Integer>{

}
