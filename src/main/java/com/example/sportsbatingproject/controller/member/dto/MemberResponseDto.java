package com.example.sportsbatingproject.controller.member.dto;

import com.example.sportsbatingproject.repository.member.entity.Member;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MemberResponseDto {

    private Long idx;
    private String email;
    private String name;
    private String password;
    private String phoneNumber;
    private String role;

    public MemberResponseDto(Member member){
        this.idx=member.getIdx();
        this.name=member.getName();
        this.role = member.getRole().name();
    }
}
