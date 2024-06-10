package com.example.manager.member.service;

import com.example.manager.member.dto.Role;
import com.example.manager.member.repository.MemberRepository;
import com.example.manager.member.entity.Member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;
import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    private MemberRepository memberRepository;


    @Override
    @Transactional
    public List<Member> getMemberList() {
        return memberRepository.findByRole(Role.USER);
    }

}
