package com.ohgiraffers.level03.hard.emp.run;

import com.ohgiraffers.level03.hard.emp.model.dto.EmployeeDto;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        //스캐너를 이용해서 모든 직원 정보를 입력 받아
        //기본 생성자로 인스턴스 생성 후 setter를 이용하여 필드 값 변경 후
        //getter를 이용하여 모든 필드 값 출력

        EmployeeDto employeeDto= new EmployeeDto();

        Scanner sc= new Scanner(System.in);
        System.out.print("직원 번호를 입력하세요 : ");
        int num1 = sc.nextInt();
        System.out.print("직원 이름을 입력하세요 : ");
        String name = sc.next();
        System.out.print("부처를 입력하세요 : ");
        String dept = sc.next();
        System.out.print("직책을 입력하세요 : ");
        String job = sc.next();
        System.out.print("나이를 입력하세요 : ");
        int num2 = sc.nextInt();
        System.out.print("성별을 입력하세요 : ");
        char num3 = sc.next().charAt(0);
        System.out.print("월급을 입력하세요 : ");
        int num4 = sc.nextInt();
        System.out.print("보너스를 입력하세요 : ");
        double num5 = sc.nextDouble();
        System.out.print("핸드폰 번호를 입력하세요 : ");
        String phone = sc.next();
        String num6 = sc.nextLine();
        System.out.print("주소를 입력하세요 : ");
        String adress = sc.nextLine();

        employeeDto.setNumber(num1);
        employeeDto.setName(name);
        employeeDto.setDept(dept);
        employeeDto.setJob(job);
        employeeDto.setAge(num2);
        employeeDto.setGender(num3);
        employeeDto.setSalary(num4);
        employeeDto.setBounsPoint(num5);
        employeeDto.setPhone(phone);
        employeeDto.setAdress(adress);


        System.out.println();

        System.out.println(employeeDto.getNumber());
        System.out.println(employeeDto.getName());
        System.out.println(employeeDto.getDept());
        System.out.println(employeeDto.getJob());
        System.out.println(employeeDto.getAge());
        System.out.println(employeeDto.getGender());
        System.out.println(employeeDto.getSalary());
        System.out.println(employeeDto.getBounsPoint());
        System.out.println(employeeDto.getPhone());
        System.out.println(employeeDto.getAdress());

    }
}
