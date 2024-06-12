package com.example.manager.memberReport.controller;

import com.example.manager.memberReport.dto.MemberReportReponseDTO;
import com.example.manager.memberReport.service.MemberReportService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequiredArgsConstructor
public class MemberReportController {
    private final MemberReportService memberReportService;

    @GetMapping("/memberReportList")
    public List<MemberReportReponseDTO> memberReportList(){
        List<MemberReportReponseDTO> memberReportList = memberReportService.getMemberReportList();
        System.out.println("memberReportList = " + memberReportList);
        return memberReportList;
    }
}
