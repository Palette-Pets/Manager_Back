package com.example.manager.member.service;

import com.example.manager.member.entity.Member;

import java.util.List;


public interface MemberService {

    List<Member> getMemberList();

    void stopMember(Long memberId);

//    List<Member> getEmailList(Long memberId);
}
