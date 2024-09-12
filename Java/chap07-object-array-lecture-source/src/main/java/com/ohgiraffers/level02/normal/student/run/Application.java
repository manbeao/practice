package com.ohgiraffers.level02.normal.student.run;

import com.ohgiraffers.level02.normal.student.model.dto.StudentDto;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        //스캐너로 학생 정보를 모두 입력 받아 모든 필드를 초기화하는 생성자로 인스턴스 생성 후
        //모든 필드 정보를 출력하는 printInformation() 메소드 호출하여 출력

        StudentDto studentDto= new StudentDto();
        Scanner sc= new Scanner(System.in);
        System.out.print("학년을 입력하세요 : ");
        int num1= sc.nextInt();
        studentDto.setGrade(num1);

        System.out.print("몇반인지 입력하세요 : ");
        int num2 = sc.nextInt();
        studentDto.setClassroom(num2);

        System.out.print("이름을 입력하세요 : ");
        String num3 = sc.next();
        studentDto.setName(num3);

        System.out.print("키를 입력하세요 : ");
        double num4 = sc.nextDouble();
        studentDto.setHeight(num4);

        System.out.print("성별을 입력하세요 : ");
        char num5 = sc.next().charAt(0);
        studentDto.setGender(num5);


        System.out.println();

        studentDto.printInformation();


    }
}
