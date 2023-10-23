package com.example.sportsbatingproject.repository.member;

import com.example.sportsbatingproject.repository.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member,Long> {
    Optional<Member> findByUserId(final String userId);

    Optional<Member> findByEmail(final String email);

}
