package com.ohgiraffers.section4.scanner;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {
        
        /*수업목표. Scanner의 nextLine()과 next()에 대해 구분하여 사용할수있다*/
        /*필기.
        * nextLine() : 공백을 포함한 한줄을 입력을 위한 개행문자 전까지 읽어서 문자열로 반환한다.(공백문자 포함)
        * next() : 공백문자나 개행문자 전까지를 읽어서 문자열로 반환한다.(공백문자 포함하지 않음)
        * */
        
        
        Scanner sc = new Scanner(System.in);
        
        /*nextLine()*/
        System.out.print("인사말을 입력해 주세요 : ");
        String greeting1 = sc.nextLine();

        System.out.println("greeting1 = " + greeting1);
        
        /*next()*/
        System.out.print("인사말을 입력해 주세요 : ");
        String greeding2 = sc.next();
        System.out.println("greeding2 = " + greeding2);     //공백 기준으로 자름
        
        
        
        
    }
}
