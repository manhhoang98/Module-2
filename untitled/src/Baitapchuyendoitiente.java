import java.util.Scanner;
public class Baitapchuyendoitiente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số tiền đô cần đổi : ");
        double tienViet = 0;
        double tienDo = scanner.nextDouble();
        int rate = 23000;
        tienViet=tienDo*rate ;
        System.out.println(tienViet);
    }
}































//            Scanner scanner = new Scanner(System.in);
//            do {
//                System.out.println("=========================");
//                System.out.println("1: Doi tien viet sang do");
//                System.out.println("2: Doi tien do sang viet");
//                System.out.println("0: Thoat ");
//                System.out.println("=========================");
//                System.out.println("Lua chon:  ");
//
//                choice = scanner.nextInt();
//                scanner.nextLine();
//                switch (choice) {
//                    case 1:
//                        System.out.println("1: Doi tien viet sang do-->");
//                        System.out.println("Nhap so tien viet muon doi: ");
//                        tienViet = scanner.nextDouble();
//                        scanner.nextLine();
//                        tienDo = tienViet / rate;
//                        System.out.println( tienViet +" vnd " + " = " + tienDo +" $");
//                        break;
//                    case 2:
//                        System.out.println("1: Doi tien viet sang do--> ");
//                        System.out.println("Nhap so tien do muon doi: ");
//                        tienDo = scanner.nextDouble();
//                        scanner.nextLine();
//                        tienViet = tienDo * rate;
//                        System.out.println( tienDo +" $" + " = " + tienViet +" vnd" );
//                        break;
//                    case 0:
//                        System.out.println("cam on da lua chon");
//                        break;
//                    default:
//                        System.out.println("Moi ban chon lai......");
//                        break;
//                }
//            } while (choice != 0);
//        }
//    }
