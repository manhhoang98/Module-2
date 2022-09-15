import java.util.Scanner;
public class Thuchanhgiaiphuongtrinhbacnhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("b: ");
        double b = scanner.nextDouble();

        System.out.print("c: ");
        double c = scanner.nextDouble();

        if(a!=0){
            double  ketqua = (c-b)/a;
            System.out.println("kết quả là :"+ ketqua );
        }else {
            if (b == c){
                System.out.println("Nghiệm đúng với mọi giá trị của x");
            }
            else {
                System.out.println("phương trình sai");
            }
        }
    }
}
