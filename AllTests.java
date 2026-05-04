import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class AllTests {

    @Test
    @DisplayName("Bài 1")
    void testBai1() {
        assertEquals(16.0, Bai1.tinhChuViHCN(5, 3));
        assertEquals(0.4, Bai1.tinhChuViHCN(0.1, 0.1));
        assertThrows(IllegalArgumentException.class, () -> Bai1.tinhChuViHCN(-4, 5)); // Phủ nhánh a <= 0
        assertThrows(IllegalArgumentException.class, () -> Bai1.tinhChuViHCN(0, 10));
        assertThrows(IllegalArgumentException.class, () -> Bai1.tinhChuViHCN(5, -2)); // BỔ SUNG: Phủ nhánh b <= 0 khi a > 0
    }

    @Test
    @DisplayName("Bài 2")
    void testBai2() {
        assertEquals(15.0, Bai2.tinhDienTichHCN(5, 3));
        assertThrows(IllegalArgumentException.class, () -> Bai2.tinhDienTichHCN(-2, 5)); // Phủ nhánh a <= 0
        assertThrows(IllegalArgumentException.class, () -> Bai2.tinhDienTichHCN(5, -2)); // BỔ SUNG: Phủ nhánh b <= 0 khi a > 0
    }

    @Test
    @DisplayName("Bài 3")
    void testBai3() {
        assertEquals("x1 = 2.0, x2 = 1.0", Bai3.giaiPtBac2(1, -3, 2));
        assertEquals("x = 1.0", Bai3.giaiPtBac2(1, -2, 1));
        assertEquals("Vô nghiệm", Bai3.giaiPtBac2(1, 1, 1));
        assertEquals("x = 2.0", Bai3.giaiPtBac2(0, 2, -4));
        assertEquals("Vô nghiệm", Bai3.giaiPtBac2(0, 0, 5));
        assertEquals("Vô số nghiệm", Bai3.giaiPtBac2(0, 0, 0)); // BỔ SUNG: Phủ nhánh c == 0
    }

    @Test
    @DisplayName("Bài 4")
    void testBai4() {
        assertEquals(31, Bai4.soNgayCuaThang(1, 2023));
        assertEquals(30, Bai4.soNgayCuaThang(4, 2023));
        assertEquals(29, Bai4.soNgayCuaThang(2, 2024)); // Phủ nhánh chia hết cho 4 nhưng không chia hết cho 100
        assertEquals(29, Bai4.soNgayCuaThang(2, 2000)); // BỔ SUNG: Phủ nhánh chia hết cho 400 (Năm nhuận thế kỷ)
        assertEquals(28, Bai4.soNgayCuaThang(2, 2023));
        assertThrows(IllegalArgumentException.class, () -> Bai4.soNgayCuaThang(0, 2023)); // BỔ SUNG: Phủ nhánh thang < 1
        assertThrows(IllegalArgumentException.class, () -> Bai4.soNgayCuaThang(13, 2023));
        assertThrows(IllegalArgumentException.class, () -> Bai4.soNgayCuaThang(5, 0));
    }

    @Test
    @DisplayName("Bài 5")
    void testBai5() {
        assertTrue(Bai5.kiemTraSNT(7));
        assertFalse(Bai5.kiemTraSNT(10));
        assertTrue(Bai5.kiemTraSNT(2));
        assertFalse(Bai5.kiemTraSNT(1));
        assertFalse(Bai5.kiemTraSNT(-5));
    }

    @Test
    @DisplayName("Bài 6")
    void testBai6() {
        assertEquals(-2, Bai6.tinhTongDanDau(4));
        assertEquals(3, Bai6.tinhTongDanDau(5));
        assertThrows(IllegalArgumentException.class, () -> Bai6.tinhTongDanDau(0));
    }

    @Test
    @DisplayName("Bài 7")
    void testBai7() {
        assertEquals(4, Bai7.timUCLN(12, 8));
        assertEquals(5, Bai7.timUCLN(-15, 5));
        assertEquals(7, Bai7.timUCLN(0, 7));
        assertThrows(IllegalArgumentException.class, () -> Bai7.timUCLN(0, 0));
    }

    @Test
    @DisplayName("Bài 8")
    void testBai8() {
        assertEquals(9, Bai8.tinhTongGiaiThua(3));
        assertEquals(1, Bai8.tinhTongGiaiThua(1));
        assertThrows(IllegalArgumentException.class, () -> Bai8.tinhTongGiaiThua(0));
    }
}