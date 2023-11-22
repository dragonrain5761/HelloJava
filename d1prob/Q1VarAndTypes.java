package d1prob;

import java.util.Scanner;

public class Q1VarAndTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Q1. 사용자에게 입력을 받고, 동일한 내용을 세 번 출력하는 코드를 작성하시오.");
        String text = scanner.nextLine();
        for(int i = 1; i <= 3; i++) {
            System.out.println(text);
        }
    }
}
