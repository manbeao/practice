package com.ohgiraffers.section03.math;

import java.util.Random;

public class Application3 {

    public static void main(String[] args) {
        
        /*수업목표. java.util.Random 클래스를 활용하여 사용자 지정범위의 난수를 발생시킬수있다*/
        /*필기.
        * java,util.Random 클래스의 nextInt() 메소드를 이용한 난수발생
        * nextInt(int bound) : 0개부터 매개변수로 전달받은 정수의 범위 까지 의 난수를 발생시켜서 정수형태로 변환
        * */
        
        /*원하는 범위의 난수를 구하는 공식
        * random.nextInt(구하려는 난수의 갯수) + 구하려는 난수의 최소갑
        * */

        Random random = new Random();
        /*목차 1. 0부터 9까지의 난수 발생*/
        int random1 = random.nextInt(10);
        System.out.println("rendom1 = " + random1);
        
        /*목차 2. 1부터 10까지의 난수 발생*/
        int random2 = random.nextInt(10)+1;
        System.out.println("randum2 = " + random2);
        
        /*목차 3. 20부터 45까지의 난수 발생*/
        int random3 = random.nextInt(26)+20;
        System.out.println("random3 = " + random3);
        
        
        /*목차 4. -128부터 127까지의 난수 발생*/
//        int random4 = random.nextInt(256) -128;
        int random4 = new Random().nextInt(256)-128;    //객체를 생성하자마자 메소드를 호출하는 경우
        System.out.println("random4 = " + random4);



    }
}
