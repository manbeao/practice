package com.ohgiraffers.section4.scanner;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        /*수업목표. java.util.Scanner를 이용한 다양한 자료형 값 입력 받기*/

        /*목차1. Scanner 객체 생성*/

        /*목차1-1. 원래 이렇게 Scanner 객체를 만들어야한다*/
//        java.util.Scanner sc= new java.util.Scanner(java.lang.System.in);

        /*목차 1-2. 하지만 java.lang은 패키지 이름 생략 가능하다*/
//        java.util.Scanner sc = new java.util.Scanner(System.in);

        /*목차 1-3. 다른 패키지에 있는 클래스 사용시 패키지명을 생략하기 위해 사용하는 구문 사용 (import)*/
        Scanner sc = new Scanner(System.in);

        /*목차 2. 자료형별 값 입력받기*/

        /*목차 2-1. 문자열 입력받기*/
        /*필기 : nextLine() : 입력받은 값을 문자열로 반환해줌*/
        System.out.print("이름을 입력하세요 : ");   //println은 줄바꿈
        String name = sc.nextLine();
        System.out.println("입력하신 이름은 " + name+ "입니다");

        /*목차 2-2. 정수형 입력받기*/
        /*필기 : nextInt() : 입력받은 값을 int형으로 바꿔줌*/
        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();
        System.out.println("입력하신 나이는 " + age+"입니다");


        /*필기.
        * nextLong() : 입력받은 값을 long형으로 반환한다
        * nextInt와 Exception이 발생하는 이유는 동일하다
        * */
        System.out.print("금액을 입력해 주세요 : ");
        long money = sc.nextLong();
        System.out.println("입력하신 금액은 " + money+"원 입니다");


        /*목차 2-3. 실수형 값 입력받기*/

        /*필기. nextFloat() : 입력받은 값을 float 형으로 반환한다*/
        System.out.print("키를 입력해 주세요 : ");
        float height = sc.nextFloat();
        System.out.println("입력하신 키는 " + height +"입니다");


        /*필기. nextDouble() : 입력받은 값을 double 형으로 반환한다*/
        System.out.print("원하는 실수를 입력해 주세요 : ");
        double number = sc.nextDouble();
        System.out.println("입력하신 키는 " + number +"입니다");


        /*목차 2-4. 논리형 값 입력받기*/
        /*필기 . nextBoolean() : 입력받은 값을 boolean 형으로 반환한다*/
        System.out.print("참과 거짓중에 함가지를 true or false로 입력해 주세요 : ");
        boolean isTrue = sc.nextBoolean();
        System.out.println("입력하신 논리 값은 " + isTrue + "입니다");


        /*목차 2-5. 문자형 값 입력받기*/
        sc.nextLine();
        System.out.print("아무 문자나 입력해 주세요 : ");
        char ch =sc.nextLine().charAt(0);   //입력한 문자의 0번째 인덱스
        System.out.println("입력하신 문자는 " + ch + "입니다");









    }


}
