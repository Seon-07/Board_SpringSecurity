package com.seon.board1.auth.domain;

import com.seon.board1.common.enums.Role;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

/**
 * @author seonjihwan
 * @version 1.0
 * @since 2025-02-23
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    /** 사용자 게정의 기본키 */
    @Id
    private String id = UUID.randomUUID().toString();;

    /** 사용자 계정 아이디 */
    @Column(name = "USERNAME", nullable = false, length = 20)
    private String username;

    /** 사용자 계정의 비밀번호 */
    @Column(name = "PASSWORD", nullable = false, length = 20)
    private String password;

    /** 사용자 계정의 권한 */
    @Column(name = "ROLE", nullable = false, length = 20)
    private String role = "USER";
}
