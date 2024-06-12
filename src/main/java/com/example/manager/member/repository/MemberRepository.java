package com.example.manager.member.repository;

import com.example.manager.member.dto.Role;
import com.example.manager.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface MemberRepository extends JpaRepository<Member, Long> {
    List<Member> findByRole(Role role);

//    List<Member> findAllByMemberId(Long memberId);
}
