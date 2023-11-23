import java.util.Scanner;

public class HelloJava {
    public static void main(String[] args){
        System.out.println("Hello, World");


        System.out.println("만나서 반갑습니다!");
        System.out.println("열심히 할게요");
        System.out.println(1024);
        System.out.println(3.14592);

        // 사용자 입력도 받아봅시다.
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.nextLine());

        //System.out.println이 없을경우 출력을 하지않는다.
        scanner.nextLine();


        System.out.println(scanner.nextLine());
    }
}
