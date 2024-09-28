package com.ohgiraffers.section01.method;

public class Application9 {

    public static void main(String[] args) {

        /*수업 목표. 다른 클래스에 작성한 메서드를 호출할 수 있다*/
        /*필기. 다른 클래스에 작성한 메서드 호출*/

        /*최대값 최솟값을 비교할 두 정수를 변수로 선언*/
        int first = 100;
        int second = 50;

        /*목차 1. non-static 메소드의 경우*/
        /*필기.
        * 클래스가 다르더라도 사용하는 방법은 동일하다
        * 클래스명 사용할 이름 = new 클래스명();
        * 사용할 이름.메소드명();
        * */

        Calculater clac = new Calculater();
        int min = clac.minNumberOf(first,second);
        System.out.println("두 수 중 최솟값은? : "+ min);

        /*목차 2. static 메소드인 경우*/
        /*필기.
        * 다른 클래스에 작성한 static 메소드의 경우 호출할ㄸ 클래스명을 반드시 써야한다
        * 클래스명.메소드명();
        * */

//        int max = maxnumberOf(first,second);    //클래스명을 생략하면 에러가 발생한다
        int max = Calculater.maxnumberOf(first,second);
        System.out.println("두 수 중 최대값은? : " + max);


        /*주의사항
        * static 메소드도 non-static 메소드 처럼 호출은 가능하다
        * 하지만 권장하지 않는다.
        * 이미 메모리에 로딩 되어있는 static 메소드는 여러객체가 공유하게 된다
        * 그때 객체로 접근하게 되면 인스턴스가 가진 값으로 공유된 값에 에상치 못하는 동작을 유발할수있기 때문에
        * 사용을 제한해 달라는 경고 이다. 시스템아 복잡해질수록 객체의 상태를 추적하기 어려워 유지보수에 악영향을 준다
        * */

//        int max2 = clac.maxnumberOf(first,second);




    }
}
