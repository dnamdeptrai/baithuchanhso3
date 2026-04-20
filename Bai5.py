import math

def kiem_tra_snt(n):
    try:
        n = int(n)
    except ValueError:
        return "Lỗi: Đầu vào phải là số nguyên."
        
    if n < 2:
        return False
        
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            return False
    return True

print("--- KẾT QUẢ CHẠY TEST CASE BÀI 5 ---")
print(f"TC01 (7): {kiem_tra_snt(7)}")
print(f"TC02 (10): {kiem_tra_snt(10)}")
print(f"TC03 (2): {kiem_tra_snt(2)}")
print(f"TC04 (1): {kiem_tra_snt(1)}")
print(f"TC05 (-5): {kiem_tra_snt(-5)}")
print(f"TC06 ('bảy'): {kiem_tra_snt('bảy')}")