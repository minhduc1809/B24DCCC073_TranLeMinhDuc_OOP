class SinhVien {
    private String maSV;
    private String hoTen;
    private int tuoi;
    private static int soLuongSV = 0;

    public SinhVien(String maSV, String hoTen, int tuoi) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        soLuongSV++;
    }

    public void hienThiThongTin() {
        System.out.println("Mã SV: " + maSV);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("----------------------");
    }

    public static void hienThiTongSV() {
        System.out.println("Tổng số sinh viên: " + soLuongSV);
    }
}

public class Sinhvien {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien("SV001", "Nguyen Van A", 20);
        SinhVien sv2 = new SinhVien("SV002", "Tran Thi B", 21);
        SinhVien sv3 = new SinhVien("SV003", "Le Van C", 22);

        sv1.hienThiThongTin();
        sv2.hienThiThongTin();
        sv3.hienThiThongTin();

        SinhVien.hienThiTongSV();
    }
}
