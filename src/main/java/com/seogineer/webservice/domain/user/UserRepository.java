package com.seogineer.webservice.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Users,Long> {
    Optional<Users> findByEmail(String email); // 이미 email을 통해 생성된 사용자인지 체크
}
