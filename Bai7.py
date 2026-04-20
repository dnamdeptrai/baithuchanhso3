import math

def tim_ucln(a, b):
    try:
        a, b = int(a), int(b)
    except ValueError:
        return "Lỗi: Đầu vào phải là số nguyên."
        
    if a == 0 and b == 0:
        return "Lỗi: a và b không thể cùng bằng 0."
        
    return math.gcd(abs(a), abs(b))

print("--- KẾT QUẢ CHẠY TEST CASE BÀI 7 ---")
print(f"TC01 (12, 8): {tim_ucln(12, 8)}")
print(f"TC02 (-15, 5): {tim_ucln(-15, 5)}")
print(f"TC03 (0, 7): {tim_ucln(0, 7)}")
print(f"TC04 (0, 0): {tim_ucln(0, 0)}")
print(f"TC05 ('x', 2): {tim_ucln('x', 2)}")