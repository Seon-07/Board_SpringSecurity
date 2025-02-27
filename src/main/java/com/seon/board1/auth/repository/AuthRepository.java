package com.seon.board1.auth.repository;

import com.seon.board1.auth.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author seonjihwan
 * @version 1.0
 * @since 2025-02-23
 */
@Repository
public interface AuthRepository extends JpaRepository<User, String> {
    Optional<User> findByUsername(String username);
}
