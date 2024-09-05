package com.ohgiraffers.section01.conditional.level03.hard;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        /* 과일 이름("apple", "banana", "melon", "grape") 중 한 가지를 문자열로 입력하면
         * 해당하는 가격에 맞게 상품명과 가격이 출력되게 하세요.
         * 단, 목록에 없는 과일을 입력 시 "준비된 상품이 없습니다." 출력 후 프로그램 종료
         *
         * -- 상품 가격 --
         * apple :  1000원
         * banana : 3000원
         * melon : 2000원
         * grape : 5000원
         *
         * -- 입력 예시 --
         * 과일 이름을 입력하세요 : banana
         *
         * -- 출력 예시 --
         * banana의 가격은 3000원 입니다.
         * */
        Application2 f = new Application2();
        f.pratice6();

    }

    public void pratice6(){
        Scanner sc = new Scanner(System.in);
        System.out.println("================과일 품목================");
        System.out.println("    apple    banana    melon    grape   ");
        System.out.println("========================================");
        System.out.print("원하시는 과일을 한개 입력해 주세요. : ");
        String fruit = sc.nextLine();

        String order = "";
        int price = 0;

        if(fruit.equals("apple")){
            order = "apple";
            price = 1000;
        } else if (fruit.equals("banana")) {
            order = " banana";
            price = 3000;
        } else if (fruit.equals("melon")) {
            order = "melon";
            price=2000;
        } else if (fruit.equals("grape")) {
            order = "grape";
            price = 5000;
        }else {
            System.out.println("준비된 상품이 없습니다");
        }

        if(fruit.equals("apple")||fruit.equals("banana")||fruit.equals("melon")||fruit.equals("grape")){
            System.out.println(order + " 의 가격은 " + price + "원 입니다");
        }


    }
}