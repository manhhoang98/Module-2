package Quanliphuongtien;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLiPhuongTien {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Transports> Transport= new ArrayList<>();

    public Transports createTransport(){

        System.out.println("Nhập ID");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập hãng sx");
        String Manufacturer= scanner.nextLine();
        System.out.println("Nhập năm sx");
        String NamSx= scanner.nextLine();
        System.out.println("Nhập giá bán");
        String Gia= scanner.nextLine();
        System.out.println("Nhập màu xe");
        String Color= scanner.nextLine();
        System.out.println("Nhập loại phương tiện");
        System.out.println("1.Ô tô 2.Xe máy 3.Xe tải");
        int loai = Integer.parseInt(scanner.nextLine());
        Transports transports = new Transports();
        if(loai == 1){
            System.out.println("Nhập kiểu động cơ");
            String kieudongco = scanner.nextLine();
            System.out.println("Nhập số chỗ ngồi");
            int sochongoi= Integer.parseInt(scanner.nextLine());
            transports = new Car(id,Manufacturer,NamSx,Gia,Color,kieudongco,sochongoi);
        } else if (loai==2) {
            System.out.println("Nhập W");
            int w= Integer.parseInt(scanner.nextLine());
            transports= new Motorbike(id,Manufacturer,NamSx,Gia,Color,w);
        } else if (loai==3) {
            System.out.println("Nhập tải trọng");
            int taitrong= Integer.parseInt(scanner.nextLine());
            transports= new Truck(id,Manufacturer,NamSx,Gia,Color,taitrong);
        }
        return transports;

    }

    public void show(){
        for (int i = 0; i < Transport.size(); i++) {
            String hienthi = Transport.toString();
            System.out.println(hienthi);
        }
    }
    public void add(){
        Transports PhuongTien= createTransport();
        Transport.add(PhuongTien);
    }
    public void edit(){

    }
    public void delete(){

    }
    public void sapxep(){
        for (int i = 0; i <Transport.size() ; i++) {


        }
    }
    public void timkiem(){

    }

}
