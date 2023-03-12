package sinhvien;

public class sinhvienIT extends sinhvienpoly {
    private double diemjava;
    private double diemhtml;
    private double diemcss;

    public sinhvienIT(String hoten,String nganh,double diemjava,double diemhtml,double diemcss){
        super(hoten, nganh);
        this.diemjava = diemjava;
        this.diemhtml = diemhtml;
        this.diemcss = diemcss;
    }
    @Override
    public double getDiem(){
        return ( 2 * diemjava + diemhtml + diemcss) / 4;
    }
}
