import java.util.Scanner;

public class untitled {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhập vào số a:");
//        Double radius = sc.nextDouble();
//        double PI = 3.14;
//        double area = 0;
//        if (radius >= 0) {
//            area = radius * radius * PI;
//            System.out.println("diện tích hình tròn có bán kính " +
//                    radius + " là : " + area);
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập num :");
        int num = sc.nextInt();
        System.out.println((num % 2 == 0) ? "num is even" : "num is odd");

    }
}
