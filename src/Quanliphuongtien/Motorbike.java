package Quanliphuongtien;

public class Motorbike extends Transports {
    private int W;

    public Motorbike(int w) {
        W = w;
    }

    public Motorbike(int id, String manufacturer, String yearSx, String price, String color, int w) {
        super(id, manufacturer, yearSx, price, color);
        W = w;
    }

    public int getW() {
        return W;
    }

    public void setW(int w) {
        W = w;
    }

    @Override
    public String toString() {
        return "Motorbike{" +
                "W=" + W +
                '}';
    }
}
