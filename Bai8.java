public class Bai8 {
    public static long tinhGiaiThua(int k) {
        long gt = 1;
        for (int i = 1; i <= k; i++) gt *= i;
        return gt;
    }

    public static long tinhTongGiaiThua(int n) {
        if (n < 1) throw new IllegalArgumentException("n > 0");
        long tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += tinhGiaiThua(i);
        }
        return tong;
    }
}