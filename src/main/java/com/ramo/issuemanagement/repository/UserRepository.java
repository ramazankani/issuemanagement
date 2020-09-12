package com.ramo.issuemanagement.repository;

import com.ramo.issuemanagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Ramazan Kani on 07.09.2020
 */

public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsername(String username);
}
