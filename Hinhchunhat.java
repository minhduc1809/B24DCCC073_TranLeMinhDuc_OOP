public class HinhCN {
    static class Rectangle {
        private int width;
        private int height;

        public Rectangle(int width, int height) {
            Set(width,height);
        }
        public int calculatePerimeter() {
            return 2 * (width + height);
        }

        public int calculateArea() {
            return width * height;
        }
        public void Set(int width, int height){
            if (width <= 0 || height <= 0) {
                throw new IllegalArgumentException("Chiều dài và chiều rộng phải là số nguyên dương.");
            }
            this.width = width;
            this.height = height;
        }
    }
    public static void main(String[] args) {
        try {
            if (args.length < 2) {
                System.out.println("Vui lòng nhập đủ 2 tham số: chiều dài và chiều rộng.");
                return;
            }
            int width = Integer.parseInt(args[0]);
            int height = Integer.parseInt(args[1]);

            Rectangle rectangle = new Rectangle(width, height);

            System.out.println(rectangle);
            System.out.println("Chu vi của hình chữ nhật: " + rectangle.calculatePerimeter());
            System.out.println("Diện tích của hình chữ nhật: " + rectangle.calculateArea());

        } catch (NumberFormatException e) {
            System.out.println("Chiều dài và chiều rộng phải là số nguyên.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
