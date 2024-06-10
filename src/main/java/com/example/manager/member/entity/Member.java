package com.example.manager.member.entity;

import com.example.manager.member.dto.Role;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;

@Getter
@Entity
@Builder
@Table(name = "member")
@NoArgsConstructor
@Data
@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class Member {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long memberId;
    @Email
    private String email;
    @Column(name = "member_name")
    private String memberName;
    @Column(name = "member_nickname")
    private String memberNickName;
    @Column(name = "member_address")
    private String memberAddress;
    @Column (name = "member_birth")
    private String memberBirth;
    @Column (name = "member_phone")
    private String memberPhone;
    @Enumerated(EnumType.STRING)
    private Role role;

}