package com.example.manager.member.controller;

import com.example.manager.member.entity.Member;
import com.example.manager.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class MemberController {
    @Autowired
    private MemberService memberService;

    @GetMapping(path = "/memberList")
    public List<Member> memberList() {
        List<Member> memberList = memberService.getMemberList();
        System.out.println("memberList = " + memberList);
        return memberList;
    }

}
