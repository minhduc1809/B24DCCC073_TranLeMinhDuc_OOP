import java.util.*;
class TaiKhoan {
    private String soTK;
    private String tenChuTK;
    private double soDu;
    private static double laiSuatNam = 0.05; // 5%

    public TaiKhoan(String soTK, String tenChuTK, double soDu) {
        this.soTK = soTK;
        this.tenChuTK = tenChuTK;
        this.soDu = soDu;
    }

    public void napTien(double soTien) {
        if (soTien > 0) {
            soDu += soTien;
            System.out.println("Nạp " + soTien + " thành công!");
        }
    }

    public void rutTien(double soTien) {
        if (soTien > 0 && soTien <= soDu) {
            soDu -= soTien;
            System.out.println("Rút " + soTien + " thành công!");
        } else {
            System.out.println("Số dư không đủ hoặc số tiền không hợp lệ.");
        }
    }

    public void tinhLaiMotThang() {
        double lai = soDu * (laiSuatNam / 12);
        soDu += lai;
    }

    public void hienThiThongTin() {
        System.out.println("Số TK: " + soTK + " | Chủ TK: " + tenChuTK + " | Số dư: " + soDu);
    }

    public static void thayDoiLaiSuat(double ls) {
        laiSuatNam = ls;
    }

    public static void hienThiLaiSuat() {
        System.out.println("Lãi suất hiện tại: " + (laiSuatNam * 100) + "%/năm");
    }

    public String getSoTK() {
        return soTK;
    }

    public double getSoDu() {
        return soDu;
    }
}
public class Taikhoan {
    public static void main(String[] args) {
        List<TaiKhoan> danhSachTK = new ArrayList<>();
        danhSachTK.add(new TaiKhoan("001", "Nguyen Van A", 5000));
        danhSachTK.add(new TaiKhoan("002", "Tran Thi B", 10000));
        danhSachTK.add(new TaiKhoan("003", "Le Van C", 7000));
        danhSachTK.get(0).napTien(2000);
        danhSachTK.get(1).rutTien(3000);
        for (TaiKhoan tk : danhSachTK) {
            tk.tinhLaiMotThang();
        }
        for (TaiKhoan tk : danhSachTK) {
            tk.hienThiThongTin();
        }
        TaiKhoan.thayDoiLaiSuat(0.07);
        TaiKhoan.hienThiLaiSuat();
        String timTK = "002";
        for (TaiKhoan tk : danhSachTK) {
            if (tk.getSoTK().equals(timTK)) {
                System.out.println("Tìm thấy tài khoản:");
                tk.hienThiThongTin();
            }
        }
        danhSachTK.sort((a, b) -> Double.compare(b.getSoDu(), a.getSoDu()));

        System.out.println("Danh sách sau khi sắp xếp theo số dư giảm dần:");
        for (TaiKhoan tk : danhSachTK) {
            tk.hienThiThongTin();
        }
    }
}
