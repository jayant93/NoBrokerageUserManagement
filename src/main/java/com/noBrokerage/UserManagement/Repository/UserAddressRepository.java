package com.noBrokerage.UserManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.noBrokerage.UserManagement.Entity.UserAddress;

@Repository
public interface UserAddressRepository extends JpaRepository<UserAddress,Integer>{

}
