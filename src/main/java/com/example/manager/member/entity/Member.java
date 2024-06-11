package com.example.manager.member.entity;

import com.example.manager.member.dto.Role;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Entity
@Builder
@Table(name = "member")
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class Member {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long memberId;
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
    @Column(name = "is_deleted")
    private boolean isDeleted;

    public void setIsDeleted() {
        this.isDeleted = !this.isDeleted;
    }
}
