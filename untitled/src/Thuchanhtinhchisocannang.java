import java.util.Scanner;

public class Thuchanhtinhchisocannang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhập cân nặng :");
        double cannang = sc.nextDouble();

        System.out.println("nhập chiều cao :");
        double chieucao = sc.nextDouble();

        double bmi = cannang/(chieucao*chieucao);

        if (bmi<0)
            System.out.println("nhập lại");
        else if (bmi<18)
            System.out.println("gầy");
        else if (bmi<25)
            System.out.println("bình thường");
        else if (bmi<30)
            System.out.println("thừa cân");
        else
            System.out.println("béo phì");
    }
}
