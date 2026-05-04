public class Bai1 {
    public static double tinhChuViHCN(double a, double b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Cạnh phải lớn hơn 0.");
        }
        return Math.round((a + b) * 2 * 100.0) / 100.0;
    }
}
