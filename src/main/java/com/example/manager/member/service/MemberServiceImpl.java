package com.example.manager.member.service;

import com.example.manager.member.dto.Role;
import com.example.manager.member.repository.MemberRepository;
import com.example.manager.member.entity.Member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin
@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    private MemberRepository memberRepository;


    @Override
    @Transactional
    public List<Member> getMemberList() {
        return memberRepository.findByRole(Role.USER);
    }

    @Override
    public void stopMember(Long memberId) {
        Member member = memberRepository.findById(memberId).orElseThrow(() -> new RuntimeException("Member not found"));
        member.setIsDeleted();
        memberRepository.save(member);
    }

}
