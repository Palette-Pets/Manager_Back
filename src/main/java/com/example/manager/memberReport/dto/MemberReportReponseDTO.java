package com.example.manager.memberReport.dto;

import com.example.manager.memberReport.entity.MemberReport;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class MemberReportReponseDTO {
    private String reporterEmail;
    private String reportedEmail;
    private String reportReason;
    private String reportContent;
    private int reportCount;
    private Date reportDate;
}


