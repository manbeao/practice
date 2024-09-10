import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        teacher learn = new teacher();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("========== 풀스택 학원 강의 하기 ==========");
            System.out.println("1. 강의 시작하기");
            System.out.println("2. 설명 하기");
            System.out.println("3. 이해시키기");
            System.out.println("4. 강의 끝내기 ");
            System.out.println("9. 프로그램 종료");
            System.out.print("숫자 선택 : ");
            int pick = sc.nextInt();

            switch (pick){
                case 1 : learn.StartClass(); break;
                case 2 : learn.explain();break;
                case 3 : learn.understanding();break;
                case 4: learn.EndClass(); break;
                case 9:
                    System.out.println("프로그램을 종료합니다"); break;
                default:
                    System.out.println("잘못된 번호를 선택 하셨습니다.");
            }
        if (pick ==9){
            break;
        }
    }

    }
}
