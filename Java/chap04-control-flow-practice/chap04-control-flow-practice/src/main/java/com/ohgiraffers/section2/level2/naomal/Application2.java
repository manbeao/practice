package com.ohgiraffers.section2.level2.naomal;

public class Application2 {

    /* 반복문을 이용하여 알파벳 소문자 'a'부터 'z'까지를 개행 없이 차례로 출력하세요
     *
     * -- 출력 예시 --
     * abcdefghijklmnopqrstuvwxyz
     * */

    public void test2(){
        for (char i = 'a'; i <= 'z'; i++){
            System.out.print(i);;
        }
        System.out.println();
    }
}
