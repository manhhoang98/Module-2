package Quanliphuongtien;

public class Car extends Transports{
    private String KieuDongCo;
    private int SoChoNoi;


    public Car(String kieuDongCo, int soChoNoi) {
        KieuDongCo = kieuDongCo;
        SoChoNoi = soChoNoi;
    }

    public Car(int id, String manufacturer, String yearSx, String price, String color, String kieuDongCo, int soChoNoi) {
        super(id, manufacturer, yearSx, price, color);
        KieuDongCo = kieuDongCo;
        SoChoNoi = soChoNoi;
    }

    public String getKieuDongCo() {
        return KieuDongCo;
    }

    public void setKieuDongCo(String kieuDongCo) {
        KieuDongCo = kieuDongCo;
    }

    public int getSoChoNoi() {
        return SoChoNoi;
    }

    public void setSoChoNoi(int soChoNoi) {
        SoChoNoi = soChoNoi;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Id=" +
                ", Manufacturer='" +  + '\'' +
                "KieuDongCo='" + KieuDongCo + '\'' +
                ", SoChoNoi=" + SoChoNoi +
                '}';
    }
}
