package sinhvien;

public abstract class sinhvienpoly{
    private String hoten;
    private String nganh;

    public sinhvienpoly(String hoten , String nganh){
        this.hoten = hoten;
        this.nganh = nganh;
    }
    public String getHoten(){
        return hoten;
    }
    public String getNganh(){
        return nganh;
    }
    public abstract double getDiem();
        public String getHocluc(){
            double diem = getDiem();
            if( diem < 5){
                return "yeu";
            }else if(diem < 6.5){
                return "trung binh";
            }else if(diem < 7.5){
                return "kha";
            }else if(diem < 9){
                return " gioi";
            }else{
                return "xuat xac";
            }
        }
        public void xuat(){
            System.out.println(" ho ten: "+hoten);
            System.out.println(" nganh: "+nganh);
            System.out.println(" diem: "+getDiem());
            System.out.println(" hoc luc: "+getHocluc());
        }
    }

