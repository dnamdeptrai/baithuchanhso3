public class Bai2 {
    public static double tinhDienTichHCN(double a, double b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Cạnh phải lớn hơn 0.");
        }
        return Math.round(a * b * 100.0) / 100.0;
    }
}