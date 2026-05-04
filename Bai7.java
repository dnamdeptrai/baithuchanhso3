public class Bai7 {
    public static int timUCLN(int a, int b) {
        if (a == 0 && b == 0) throw new IllegalArgumentException("Không xác định");
        a = Math.abs(a); b = Math.abs(b);
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}