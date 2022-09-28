package Quanliphuongtien;

public class Truck extends Transports {
    private int TaiTrong;


    public Truck(int taiTrong) {
        TaiTrong = taiTrong;
    }

    public Truck(int id, String manufacturer, String yearSx, String price, String color, int taiTrong) {
        super(id, manufacturer, yearSx, price, color);
        TaiTrong = taiTrong;
    }

    public int getTaiTrong() {
        return TaiTrong;
    }

    public void setTaiTrong(int taiTrong) {
        TaiTrong = taiTrong;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "TaiTrong=" + TaiTrong +
                '}';
    }
}
