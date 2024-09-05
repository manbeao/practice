package com.ohgiraffers.section03.math;

public class Application1 {

    public static void main(String[] args) {

        /*수업목표. Math 클래스에서 제공하는 static 메소드를 호출할수있다*/
        /*필기.
        * API 란?
        * Application Programming Interface는 응용 프로그램에서 사용할수있도록
        * 운영체체나 프로그래밍 언어가 제공하는 기능을 제어할 수 있도록 만든 인터페이스를 뜻한다.
        * 쉽게 말해 우리가 구현할수없거나 구현하기 번거로운 기능들을 JDK를 설치하면 사용할수있도록 제공해 놓은 소스코드9클래스나 인터페이스)들을 의미한다
        * 더 쉽게 말해 누가 작성해 놓은 소스코드 이거나 가져다 스는 방법을 본다는 말이다
        * 모든 코드를 우리가 다 외울수없으니 API문서를 별도로 재공해주고 있다
        * */


        /*필기.
        * java.lang.Math
        * Math 클래스는 수학에서 자주 사용하는 상수들과 함수들을 미리 구현해 놓은 클래스이다
        * 모든 메소드는 static 메소드로 작성되어있다.
        * (객체의 상태를 관리하지 않고 기능만 제공하는 경우 메모리를 효율적으로 사용학 위해 자주 사용되는 기법이다
        * */

        /*목차 1. 절대값 출력*/
        /*목차 1-1. 클래스의 full-name을 다 적은 후*/
        System.out.println("-7의 절대값 " + java.lang.Math.abs(-7));

        /*목차 1-2. import를 해서 사용*/
        System.out.println("-1.25의 절대값 : " + (Math.abs(-1.25)));

        /*목차 2. 최대값, 최솟값 사용*/
        System.out.println("10과 20 중에 더 작은 것은 : " + (Math.min(10,20)));
        System.out.println("20과 30 중에 더 큰 것은 : " + (Math.max(20,30)));

        System.out.println("원주율 : " + Math.PI);

        /*목차 3. 난수 출력*/
        System.out.println("난수 발생 : " + Math.random());  //0부터 1까지 실수형태로 출력



    }
}
