def tinh_tong_dan_dau(n):
    try:
        n = int(n)
    except ValueError:
        return "Lỗi: Đầu vào phải là số nguyên."
        
    if n < 1:
        return "Lỗi: n phải là số nguyên dương (n > 0)."
        
    tong = 0
    for i in range(1, n + 1):
        if i % 2 == 0:
            tong -= i
        else:
            tong += i
    return tong

print("--- KẾT QUẢ CHẠY TEST CASE BÀI 6 ---")
print(f"TC01 (4): {tinh_tong_dan_dau(4)}")
print(f"TC02 (5): {tinh_tong_dan_dau(5)}")
print(f"TC03 (1): {tinh_tong_dan_dau(1)}")
print(f"TC04 (0): {tinh_tong_dan_dau(0)}")
print(f"TC05 (-3): {tinh_tong_dan_dau(-3)}")
print(f"TC06 ('a'): {tinh_tong_dan_dau('a')}")