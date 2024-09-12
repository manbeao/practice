package com.ohgiraffers.level01.basic.member.run;

import com.ohgiraffers.level01.basic.member.model.dto.MemberDto;

public class Application {
    public static void main(String[] args) {
        MemberDto memberDto = new MemberDto();
        System.out.println("id : " + memberDto.getId());
        System.out.println("pwd : " + memberDto.getPwd());
        System.out.println("name : " + memberDto.getName());
        System.out.println("age : " + memberDto.getAge());
        System.out.println("gender : " + memberDto.getGender());
        System.out.println("phone : " + memberDto.getPhone());
        System.out.println("email : " + memberDto.getEmail());


        memberDto.setId("user01");
        memberDto.setPwd("pass01");
        memberDto.setName("홍길동");
        memberDto.setAge(20);
        memberDto.setGender('M');
        memberDto.setPhone("010-1234-5678");
        memberDto.setEmail("hong123@ohgiraffers.com");



        System.out.println("변경 후 id : " + memberDto.getId());
        System.out.println("변경 후 pwd : " + memberDto.getPwd());
        System.out.println("변경 후 name : " + memberDto.getName());
        System.out.println("변경 후 age : " + memberDto.getAge());
        System.out.println("변경 후 gender : " + memberDto.getGender());
        System.out.println("변경 후 phone : " + memberDto.getPhone());
        System.out.println("변경 후 email : " + memberDto.getEmail());

    }
}
