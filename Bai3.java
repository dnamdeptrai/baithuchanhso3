public class Bai3 {
    public static String giaiPtBac2(double a, double b, double c) {
        if (a == 0) {
            if (b == 0) {
                return (c == 0) ? "Vô số nghiệm" : "Vô nghiệm";
            }
            return "x = " + (Math.round(-c / b * 100.0) / 100.0);
        }
        double delta = b * b - 4 * a * c;
        if (delta < 0) return "Vô nghiệm";
        if (delta == 0) return "x = " + (Math.round(-b / (2 * a) * 100.0) / 100.0);
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        return "x1 = " + (Math.round(x1 * 100.0) / 100.0) + ", x2 = " + (Math.round(x2 * 100.0) / 100.0);
    }
}