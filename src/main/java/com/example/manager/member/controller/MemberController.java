package com.example.manager.member.controller;

import com.example.manager.member.entity.Member;
import com.example.manager.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemberController {
    @Autowired
    private MemberService memberService;

    @GetMapping("/memberList")
    public List<Member> memberList() {
        List<Member> memberList = memberService.getMemberList();
        System.out.println("memberList = " + memberList);
        return memberList;
    }

}
