package d1prob;

import java.util.Scanner;

public class D1Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//
        //
        System.out.println("Q1. 사용자에게 입력을 받고, 동일한 내용을 세 번 출력하는 코드를 작성하시오.");
        String text = scanner.nextLine();
        for(int i = 1; i <= 3; i++) {
            System.out.println(text);
        }

        //
        System.out.println("Q2. 두개의 숫자를 입력받고, 순서를 바꿔서 출력하시오.");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(num2);
        System.out.println(num1);

        //
        System.out.println("Q3. *을 하트를 출력하는 코드를 만들어 보시오.");
        String star = "*";
        for(int i = 1; i < 4; i++){
            System.out.println( star);
        }
//
        //
        System.out.println("Q4. 시간과 오전 오후를 입력받고, 오전 XX시의 형식으로 출력하는 코드를 작성하시오.");
        String timeLine = scanner.next();
        int time = scanner.nextInt();
        String timeTemplate = "%s %d시";
        System.out.println(String.format(timeTemplate, timeLine, time));

        //
        System.out.println("Q5. 3개의 0.0 ~ 4.5 사이의 실수를 입력하시오.");
        double scores1 = scanner.nextDouble(), scores2 = scanner.nextDouble(), scores3 = scanner.nextDouble();
        System.out.println("Q5. 3개의 이름을 입력하시오.");
        String names1 = scanner.next(), names2 = scanner.next(), names3 = scanner.next();
        System.out.println("Q5. 이름 - <이름>, 학점 - <실수> 의 형태로 3줄을 출력하는 프로그램을 작성하시오.");
        System.out.println(String.format("이름 - <%s>, 학점 - <%.1f>", names1, scores1));
        System.out.println(String.format("이름 - <%s>, 학점 - <%.1f>", names2, scores2));
        System.out.println(String.format("이름 - <%s>, 학점 - <%.1f>", names3, scores3));

    }
}
