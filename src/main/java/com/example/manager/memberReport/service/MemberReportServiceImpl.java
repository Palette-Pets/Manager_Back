package com.example.manager.memberReport.service;

import com.example.manager.memberReport.dto.MemberReportReponseDTO;
import com.example.manager.memberReport.entity.MemberReport;
import com.example.manager.memberReport.repository.MemberReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
public class MemberReportServiceImpl implements MemberReportService {
    @Autowired
    private MemberReportRepository memberReportRepository;

    @Override
    public List<MemberReportReponseDTO> getMemberReportList() {
        List<MemberReport> memberReportList = memberReportRepository.findAll();
        return memberReportList.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private MemberReportReponseDTO convertToDTO(MemberReport memberReport) {
        return MemberReportReponseDTO.builder()
                .reporterEmail(memberReport.getMemberId().getEmail())
                .reportedEmail(memberReport.getReportedMemberId().getEmail())
                .reportReason(memberReport.getReportReason())
                .reportContent(memberReport.getReportContent())
                .reportCount(memberReport.getReportCount())
                .reportDate(memberReport.getReportDate())
                .build();
    }
}
