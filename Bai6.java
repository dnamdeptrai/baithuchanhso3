public class Bai6 {
    public static int tinhTongDanDau(int n) {
        if (n < 1) throw new IllegalArgumentException("n > 0");
        int tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += (i % 2 == 0) ? -i : i;
        }
        return tong;
    }
}