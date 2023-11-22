package d1prob;

import java.util.Scanner;

public class D1VarAndTypes {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(a+b);

        int c = 100;
        System.out.println(c);
    // b라는 이름의 상자에 "Hello Variables!"라는 데이터를 넣어준다.
        String d = "Hello Variables!";
    // b에 들어있는게 뭔지 확인한다.
        System.out.println(d);

        a = 40;
        System.out.println(a);

        int americano = 1500;
        int cappuccino = 2500;
        int caffeLatte = 3000;
        int caffeMocha = 4000;
        // 아메리카노 5잔 출력
        // 카푸치노 3잔 + 카페라데 2잔 출력
        // 카페모카 1잔 + 아메리카노 3잔 출력

        System.out.println(americano * 5);
        System.out.println(cappuccino * 3 + caffeLatte * 2);
        System.out.println(caffeMocha + americano * 3);


        int hotTea = 1000, iceTea = 1500;

//자료형들
        //정수형 자료형
        //정수(-2147483648 - 2147483647)
        int integer = 10;
        //정수보다 큰 범위
        long longInteger = 10000000000000L;
        //작은 자료형
        short smallInteger = 10000;
        byte reallySmallInteger = 127;
        // 실수형 자료형(유효숫자와 자릿수를 기준으로 한다/float=7자리에서 반올림, double=16자리에서 반올림)
        float floatPoint = 2.718F;
        // 거의 double 만 쓴다.
        double doublePoint = 3.14159265359;
        // 진짜 긴 소수는?
        double longPi = 3.14159265358979323846;
        // 문자와 문자열
        char character = 'a';
        char alphabet = 'a';
        char digit = '1';
        // char isString = "1";  // 한글자고 해도 큰따옴표는 문자가 아닌 문자열
        String word = "Hello";
        String sentence = "this is a String Variable";
        // 불린형 자료형 (참 또는 거짓)
        boolean success = false;
        boolean willSuccess = true;
        success = true;
        System.out.println(success);
        //
        String string = "this is string";

        // Scanner로 입력받기
//        Scanner scanner = new Scanner(System.in);
//        // nextline은 사용자가 입력한 내용의 한줄을 가져오는 것
//        String scannedLine = scanner.nextLine();
//        System.out.println(scannedLine);
//
//        int scannedInt = scanner.nextInt();
//        long scannedLong = scanner.nextLong();
//        System.out.println(scannedInt);
//        System.out.println(scannedLong);
//
//        float scannedFloat = scanner.nextFloat();
//        double scannedDouble = scanner.nextDouble();
//        System.out.println(scannedFloat);
//        System.out.println(scannedDouble);
//
//        boolean scannedBool = scanner.nextBoolean();
//        System.out.println(scannedBool);

// nextLine() 유의점
//        scanner.nextInt();
//        scannedLine = scanner.nextLine();
//        System.out.println(scannedLine);

        //"내일 봐" 라고 말하였다, 이스케이프 캐릭터 = \
        String quote = "\"내일 봐\" 하고 말하였다.";
        System.out.println(quote);

        char quotation = '\'';
        System.out.println(quotation);

        String doubleBack = "\\ is backslash";
        System.out.println(doubleBack);

        // 엔터키(개행문자), 백스페이스, 탭키
        System.out.println("개행문자: \n이 다음은 다음 줄에 표현됩니다.");
        System.out.println("name\tscore");
        System.out.println("Alex\t3.5");
        System.out.println("Thomas\t4.0");

        //문자열 포맷팅 = String Formatting
        int dust = 10;
        String status = "좋음";
        //%d는 정수 %s는 문자열, %c는 문자, %f는 부동소수
        String msgTemplate = "미세먼지 농도 : %d (%s)";
        System.out.println(String.format(msgTemplate, dust, status));

        //배열
        int[] scores = {85, 75, 90};
        scores[1] = 80;

        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);

        int studentCount = 10;
        String[] names = new String[studentCount];
        scores = new int[studentCount];
        //점수입력
        Scanner scanner = new Scanner(System.in);
        scores[0] = scanner.nextInt();
        scores[1] = scanner.nextInt();
        scores[2] = scanner.nextInt();

        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);

        //



    }
}
