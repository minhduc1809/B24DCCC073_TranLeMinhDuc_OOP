public class Hinhchunhat {
    public static void main(String[] args) {
        try {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            Rectangle rect = new Rectangle(x, y);
            System.out.println("Chu vi hình chữ nhật: " + rect.perimeter());
            System.out.println("Diện tích hình chữ nhật: " + rect.area());

        } catch (NumberFormatException e) {
            System.out.println("Lỗi: x và y phải là số nguyên.");
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}
class Rectangle {
    private int x;
    private int y;
    public Rectangle(int x, int y) {
        if (x <= 0 || y <= 0) {
            throw new IllegalArgumentException("Chiều dài và chiều rộng phải là số nguyên dương.");
        }
        this.x = x;
        this.y = y;
    }
    public int perimeter() {
        return 2 * (x + y);
    }
    public int area() {
        return x * y;
    }
}
