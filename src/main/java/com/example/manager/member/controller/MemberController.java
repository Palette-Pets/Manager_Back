package com.example.manager.member.controller;

import com.example.manager.member.entity.Member;
import com.example.manager.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @GetMapping("/memberList")
    public List<Member> memberList() {
        List<Member> memberList = memberService.getMemberList();
        System.out.println("memberList = " + memberList);
        return memberList;
    }

//    @PostMapping("/emailList")
//    public List<Member> emailList(@RequestBody String memberId) {
//        System.out.println("memberId = " + memberId);
//        List<Member> emailList = memberService.getEmailList(Long.valueOf(memberId));
//        System.out.println("emailList = " + emailList);
//        return emailList;
//    }

    @PutMapping("/stopMember/{memberId}")
    public void stopMember(@PathVariable Long memberId) {
        System.out.println("memberId = " + memberId);
        memberService.stopMember(memberId);
    }

}
