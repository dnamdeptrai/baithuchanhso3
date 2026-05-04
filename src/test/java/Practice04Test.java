import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Practice04Test {

    @Test
    void testConstructor() {
        new Practice04(); 
    }
    // ==========================================
    // 1 & 2. Test Chu vi và Diện tích hình chữ nhật
    // ==========================================
    @Test
    void testRectangle_ValidInputs() { // Issue 1
        assertEquals(10.0, Practice04.calculatePerimeter(2, 3));
        assertEquals(6.0, Practice04.calculateArea(2, 3));
    }

    @Test
    void testRectangle_InvalidInputs() { // Issue 2
        assertThrows(IllegalArgumentException.class, () -> Practice04.calculatePerimeter(-2, 3));
        assertThrows(IllegalArgumentException.class, () -> Practice04.calculateArea(2, 0));
        assertThrows(IllegalArgumentException.class, () -> Practice04.calculatePerimeter(2, 0)); // Test nhánh chiều rộng sai
        assertThrows(IllegalArgumentException.class, () -> Practice04.calculateArea(0, 3)); // Test nhánh chiều dài sai
    }

    // ==========================================
    // 3. Test Giải phương trình bậc 2
    // ==========================================
    @Test
    void testSolveQuadratic_A_Zero_B_Zero_C_Zero() { // Issue 2 (Biên)
        assertEquals("Vô số nghiệm", Practice04.solveQuadratic(0, 0, 0));
    }

    @Test
    void testSolveQuadratic_A_Zero_B_Zero_C_NotZero() { // Issue 2 (Nhánh)
        assertEquals("Vô nghiệm", Practice04.solveQuadratic(0, 0, 5));
    }

    @Test
    void testSolveQuadratic_A_Zero_B_NotZero() { // Issue 1 (Bậc 1)
        assertEquals("Nghiệm duy nhất: -2.0", Practice04.solveQuadratic(0, 2, 4));
    }

    @Test
    void testSolveQuadratic_Delta_LessThanZero() { // Issue 2 (Vô nghiệm)
        assertEquals("Vô nghiệm", Practice04.solveQuadratic(1, 2, 3));
    }

    @Test
    void testSolveQuadratic_Delta_Zero() { // Issue 1 (Nghiệm kép)
        assertEquals("Nghiệm kép: -1.0", Practice04.solveQuadratic(1, 2, 1));
    }

    @Test
    void testSolveQuadratic_Delta_GreaterThanZero() { // Issue 1 (Hai nghiệm)
        assertEquals("Hai nghiệm phân biệt: -1.0, -2.0", Practice04.solveQuadratic(1, 3, 2));
    }

    // ==========================================
    // 4. Test Tính số ngày của tháng
    // ==========================================
    @Test
    void testDaysInMonth_ValidInputs() { // Issue 1
        assertEquals(31, Practice04.getDaysInMonth(1, 2023));
        assertEquals(30, Practice04.getDaysInMonth(4, 2023));
    }

    @Test
    void testDaysInMonth_LeapYears() { // Issue 1 & 2 (Logic phân nhánh phức tạp)
        assertEquals(29, Practice04.getDaysInMonth(2, 2000)); // Chia hết 400
        assertEquals(29, Practice04.getDaysInMonth(2, 2024)); // Chia hết 4, không chia hết 100
        assertEquals(28, Practice04.getDaysInMonth(2, 1900)); // Chia hết 100, không chia 400
        assertEquals(28, Practice04.getDaysInMonth(2, 2023)); // Không chia hết 4
    }

    @Test
    void testDaysInMonth_Exceptions() { // Issue 2
        assertThrows(IllegalArgumentException.class, () -> Practice04.getDaysInMonth(13, 2023));
        assertThrows(IllegalArgumentException.class, () -> Practice04.getDaysInMonth(5, -5));
        assertThrows(IllegalArgumentException.class, () -> Practice04.getDaysInMonth(0, 2023)); // Test nhánh tháng nhỏ hơn 1
    }

    // ==========================================
    // 5. Test Số nguyên tố
    // ==========================================
    @Test
    void testIsPrime() {
        assertFalse(Practice04.isPrime(1));  // Issue 2 (Biên nhỏ hơn 2)
        assertTrue(Practice04.isPrime(2));   // Issue 1 (Số nguyên tố nhỏ nhất)
        assertTrue(Practice04.isPrime(5));   // Issue 1 (Số nguyên tố lẻ)
        assertFalse(Practice04.isPrime(9));  // Issue 1 (Số lẻ không phải nguyên tố, test vòng lặp)
    }

    // ==========================================
    // 6. Test Tổng Alternating
    // ==========================================
    @Test
    void testAlternatingSum() {
        assertThrows(IllegalArgumentException.class, () -> Practice04.alternatingSum(0)); // Issue 2
        assertEquals(1, Practice04.alternatingSum(1)); // Issue 1 (Chỉ nhánh lẻ)
        assertEquals(-1, Practice04.alternatingSum(2)); // Issue 1 (1 - 2)
        assertEquals(2, Practice04.alternatingSum(3));  // Issue 1 (1 - 2 + 3)
    }

    // ==========================================
    // 7. Test UCLN (GCD)
    // ==========================================
    @Test
    void testFindGCD() {
        assertEquals(5, Practice04.findGCD(0, 5)); // Biên 0
        assertEquals(5, Practice04.findGCD(5, 0)); // Biên 0
        assertEquals(6, Practice04.findGCD(48, 18)); // Issue 1 (Nhánh a > b)
        assertEquals(6, Practice04.findGCD(18, 48)); // Issue 1 (Nhánh a < b)
        assertEquals(5, Practice04.findGCD(-10, 15)); // Issue 2 (Xử lý số âm)
    }

    // ==========================================
    // 8. Test Giai thừa và Tổng giai thừa
    // ==========================================
    @Test
    void testFactorial() {
        assertThrows(IllegalArgumentException.class, () -> Practice04.factorial(-1)); // Issue 2
        assertEquals(1, Practice04.factorial(0)); // Issue 2 (Biên)
        assertEquals(1, Practice04.factorial(1)); // Biên
        assertEquals(6, Practice04.factorial(3)); // Issue 1
    }

    @Test
    void testSumOfFactorials() {
        assertThrows(IllegalArgumentException.class, () -> Practice04.sumOfFactorials(0)); // Issue 2
        assertEquals(1, Practice04.sumOfFactorials(1)); // Issue 1
        assertEquals(9, Practice04.sumOfFactorials(3)); // Issue 1 (1! + 2! + 3! = 1 + 2 + 6)
    }
}