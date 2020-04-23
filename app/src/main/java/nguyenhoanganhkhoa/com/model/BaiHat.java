package nguyenhoanganhkhoa.com.model;

public class BaiHat {
    public String ma;
    public String ten;
    public String casi;
    public int thich;

    public BaiHat(String ma, String ten, String casi, int thich) {
        this.ma = ma;
        this.ten = ten;
        this.casi = casi;
        this.thich = thich;
    }

    public BaiHat() {
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getCasi() {
        return casi;
    }

    public void setCasi(String casi) {
        this.casi = casi;
    }

    public int getThich() {
        return thich;
    }

    public void setThich(int thich) {
        this.thich = thich;
    }
}
