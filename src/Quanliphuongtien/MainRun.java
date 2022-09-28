package Quanliphuongtien;

import java.util.Scanner;

public class MainRun {
    static QuanLiPhuongTien pt = new QuanLiPhuongTien();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("-----Quản Lí Sản Phẩm-----");
            System.out.println("1. Xem danh sách ");
            System.out.println("2. Thêm mới ");
            System.out.println("3. Cập nhật ");
            System.out.println("4. Xóa ");
            System.out.println("5. Sắp xếp ");
            System.out.println("6. Tìm sản phẩm có giá cao nhất ");
            System.out.println("7. Thoát ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    pt.show();
                    break;
                case 2:
                    pt.add();
                    break;
                case 3:
                    pt.edit();
                    break;
                case 4:
                    pt.delete();
                    break;
                case 5:
                    pt.sapxep();
                    break;
                case 6:
                    pt.timkiem();
                    break;
                case 7:

                    return;
            }
        }
    }
}
