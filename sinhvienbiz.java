package sinhvien;

public class sinhvienbiz extends sinhvienpoly {
    private double diemMarketing;
    private double diemSales;

    public sinhvienbiz(String hoten,String nganh,double diemMarketing,double diemSales){
        super(hoten,nganh);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }
    @Override
    public double getDiem(){
        return (2 * diemMarketing + diemSales) / 3;
    }
}
