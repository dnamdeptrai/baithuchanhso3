public class Bai4 {
    public static int soNgayCuaThang(int thang, int nam) {
        if (thang < 1 || thang > 12 || nam < 1) throw new IllegalArgumentException("Dữ liệu không hợp lệ");
        switch (thang) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: return 31;
            case 4: case 6: case 9: case 11: return 30;
            case 2:
                if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) return 29;
                return 28;
            default: return -1;
        }
    }
}