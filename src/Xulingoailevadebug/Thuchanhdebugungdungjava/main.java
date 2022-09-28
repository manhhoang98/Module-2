package Xulingoailevadebug.Thuchanhdebugungdungjava;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");

        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("b: ");
        double b = scanner.nextDouble();

        if (a != 0) {
            double solution = -b / a;
            System.out.printf("Kết quả là : %f!", solution);
        } else {
            if (b == 0) {
                System.out.print("Mọi giá trị đều thỏa mãn x");
            } else {
                System.out.print("Vô nghiệm");
            }
        }
    }
}
