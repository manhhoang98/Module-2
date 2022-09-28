package Quanliphuongtien;

public class Transports {
    private int Id;
    private String Manufacturer;
    private String YearSx;
    private String Price;
    private String Color;

    public Transports() {
    }

    public Transports(int id, String manufacturer, String yearSx, String price, String color) {

        Id = id;
        Manufacturer = manufacturer;
        YearSx = yearSx;
        Price = price;
        Color = color;
    }

    public  int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    public String getYearSx() {
        return YearSx;
    }

    public void setYearSx(String yearSx) {
        YearSx = yearSx;
    }

    public String isPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    @Override
    public String toString() {
        return "Transports{" +
                "Id=" + Id +
                ", Manufacturer='" + Manufacturer + '\'' +
                ", YearSx='" + YearSx + '\'' +
                ", Price=" + Price +
                ", Color='" + Color + '\'' +
                '}';
    }
}
