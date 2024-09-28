package com.ohgiraffers.section02.package_and_import;

import com.ohgiraffers.section01.method.Calculater;

import static com.ohgiraffers.section01.method.Calculater.maxnumberOf;

public class Appliaction2 {

    public static void main(String[] args) {
        
        /*수업 목표. 임포트에 대해 이해할수있다*/
        /*필기.
        * 임포트란?
        * 서로 다른 패키지에 존재하는 클래스를 사용하는 경우 패키지명을 포함한 풀 클래스 이름을 사용해야한다.
        * 하지만 매번 다른 클래스의 패키지명까지 기술하기에는 번거롭다.
        * 그래서 패키지명을 생략하고 사용할수있도록 한 구문이 import 구문이다
        * import는 package 선언문과 class 선언문 사이에 작성하며
        * 어떠한 패키지 내에 잇는 클래스를 사용 할것인지에 대해 미리 선언하는 효과를 가진다.
        * */
        
        /*목차 1. non-static 메소드인 경우*/
        Calculater clac =new Calculater();
        int min = clac.minNumberOf(50,60);
        System.out.println("min = " + min);
        
        /*목차 2. static 메소드인 경우*/
        int max = Calculater.maxnumberOf(30,60);
        System.out.println("max = " + max);
        
        /*목차 3. static 메소드를 호출할때 클래스명도 생략하고 사용(import static)*/
        int max2= maxnumberOf(30,20);
        System.out.println("max2 = " + max2);
        

    }
}
