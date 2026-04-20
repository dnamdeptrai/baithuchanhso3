import math

def giai_pt_bac_2(a, b, c):
    try:
        a, b, c = float(a), float(b), float(c)
    except ValueError:
        return "Lỗi: Đầu vào phải là số."
        
    if a == 0:
        if b == 0:
            return "Phương trình vô số nghiệm" if c == 0 else "Phương trình vô nghiệm"
        return f"Phương trình có một nghiệm: x = {round(-c / b, 2)}"
        
    delta = b**2 - 4*a*c
    if delta < 0:
        return "Phương trình vô nghiệm"
    elif delta == 0:
        return f"Phương trình có nghiệm kép: x = {round(-b / (2*a), 2)}"
    else:
        x1 = (-b + math.sqrt(delta)) / (2*a)
        x2 = (-b - math.sqrt(delta)) / (2*a)
        return f"Nghiệm phân biệt: x1 = {round(x1, 2)}, x2 = {round(x2, 2)}"

print("--- KẾT QUẢ CHẠY TEST CASE BÀI 3 ---")
print(f"TC01 (1, -3, 2): {giai_pt_bac_2(1, -3, 2)}")
print(f"TC02 (1, -2, 1): {giai_pt_bac_2(1, -2, 1)}")
print(f"TC03 (1, 1, 1): {giai_pt_bac_2(1, 1, 1)}")
print(f"TC04 (0, 2, -4): {giai_pt_bac_2(0, 2, -4)}")
print(f"TC05 (0, 0, 5): {giai_pt_bac_2(0, 0, 5)}")
print(f"TC06 ('a', 2, 3): {giai_pt_bac_2('a', 2, 3)}")