def tinh_giai_thua(k):
    if k == 0 or k == 1:
        return 1
    gt = 1
    for i in range(2, k + 1):
        gt *= i
    return gt

def tinh_tong_giai_thua(n):
    try:
        n = int(n)
    except ValueError:
        return "Lỗi: Đầu vào phải là số nguyên."
        
    if n < 1:
        return "Lỗi: n phải là số nguyên dương (n > 0)."
        
    tong = 0
    for i in range(1, n + 1):
        tong += tinh_giai_thua(i)
    return tong

print("--- KẾT QUẢ CHẠY TEST CASE BÀI 8 ---")
print(f"TC01 (3): {tinh_tong_giai_thua(3)}")
print(f"TC02 (1): {tinh_tong_giai_thua(1)}")
print(f"TC03 (0): {tinh_tong_giai_thua(0)}")
print(f"TC04 (-2): {tinh_tong_giai_thua(-2)}")
print(f"TC05 ('xyz'): {tinh_tong_giai_thua('xyz')}")