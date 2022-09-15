import java.util.Scanner;
public class Thuchanhkiemtranamnhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nam;
        System.out.print("Nhập năm cần kiểm tra:");
        nam = sc.nextInt();
        boolean check = false;
        boolean kiemtranamchiahetcho4=nam % 4 == 0;

        if (kiemtranamchiahetcho4) {
            boolean kiemtranamchiahetcho100 = nam % 100 == 0;
            if (kiemtranamchiahetcho100) {
                boolean kiemtranamchiahetcho400 = nam % 400 == 0;
                if (kiemtranamchiahetcho400) {
                    check = true;
                }
            } else {
                check = true;
            }
        }
        if(check){
            System.out.printf("%d là năm nhuận " , nam);
        }else {
            System.out.printf("%d không phải là năm nhuận", nam);
        }
    }
}
