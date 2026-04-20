def tinh_chu_vi_hcn(a, b):
    try:
        a_float = float(a)
        b_float = float(b)
    except ValueError:
        return "Lỗi: Đầu vào phải là số."
    if a_float <= 0 or b_float <= 0:
        return "Lỗi: Cạnh của hình chữ nhật phải lớn hơn 0."
    chu_vi = (a_float + b_float) * 2
    return round(chu_vi, 2) 

print("--- KẾT QUẢ CHẠY TEST CASE BÀI 1 ---")
print(f"TC01 (5, 3): {tinh_chu_vi_hcn(5, 3)}")
print(f"TC02 (0.1, 0.1): {tinh_chu_vi_hcn(0.1, 0.1)}")
print(f"TC03 (-4, 5): {tinh_chu_vi_hcn(-4, 5)}")
print(f"TC04 (0, 10): {tinh_chu_vi_hcn(0, 10)}")
print(f"TC05 ('ba', 4): {tinh_chu_vi_hcn('ba', 4)}")
print(f"TC06 (5, ''): {tinh_chu_vi_hcn(5, '')}")