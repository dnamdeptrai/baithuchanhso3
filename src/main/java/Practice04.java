public class Practice04 {

    // 1. Tính chu vi hình chữ nhật
    public static double calculatePerimeter(double length, double width) {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Chiều dài và chiều rộng phải lớn hơn 0");
        }
        return 2 * (length + width);
    }

    // 2. Tính diện tích hình chữ nhật
    public static double calculateArea(double length, double width) {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Chiều dài và chiều rộng phải lớn hơn 0");
        }
        return length * width;
    }

    // 3. Giải phương trình bậc 2: ax^2 + bx + c = 0
    public static String solveQuadratic(double a, double b, double c) {
        if (a == 0) {
            if (b == 0) {
                return (c == 0) ? "Vô số nghiệm" : "Vô nghiệm";
            }
            return "Nghiệm duy nhất: " + (-c / b);
        }
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            return "Vô nghiệm";
        } else if (delta == 0) {
            return "Nghiệm kép: " + (-b / (2 * a));
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            return "Hai nghiệm phân biệt: " + x1 + ", " + x2;
        }
    }

    // 4. Tính số ngày của một tháng
    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year <= 0) {
            throw new IllegalArgumentException("Tháng hoặc năm không hợp lệ");
        }
        switch (month) {
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                boolean isLeapYear = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
                return isLeapYear ? 29 : 28;
            default:
                return 31;
        }
    }

    // 5. Kiểm tra số nguyên tố
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // 6. Tính tổng S = 1 - 2 + 3 - 4 + ... +/- n
    public static int alternatingSum(int n) {
        if (n < 1) throw new IllegalArgumentException("n phải >= 1");
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            } else {
                sum -= i;
            }
        }
        return sum;
    }

    // 7. Tìm UCLN của a và b
    public static int findGCD(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) return a + b;
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    // 8.1. Hàm tính giai thừa (hàm phụ trợ cho câu 8)
    public static long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("n phải >= 0");
        if (n == 0 || n == 1) return 1;
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // 8.2. Tính tổng S = 1! + 2! + 3! + ... + n!
    public static long sumOfFactorials(int n) {
        if (n < 1) throw new IllegalArgumentException("n phải >= 1");
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += factorial(i);
        }
        return sum;
    }
}