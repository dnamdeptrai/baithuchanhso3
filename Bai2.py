def tinh_dien_tich_hcn(a, b):
    try:
        a_float = float(a)
        b_float = float(b)
    except ValueError:
        return "Lỗi: Đầu vào phải là số."
        
    if a_float <= 0 or b_float <= 0:
        return "Lỗi: Cạnh của hình chữ nhật phải lớn hơn 0."
        
    dien_tich = a_float * b_float
    return round(dien_tich, 2)

print("--- KẾT QUẢ CHẠY TEST CASE BÀI 2 ---")
print(f"TC01 (5, 3): {tinh_dien_tich_hcn(5, 3)}")
print(f"TC02 (0.1, 0.1): {tinh_dien_tich_hcn(0.1, 0.1)}")
print(f"TC03 (-2, 5): {tinh_dien_tich_hcn(-2, 5)}")
print(f"TC04 (0, 10): {tinh_dien_tich_hcn(0, 10)}")
print(f"TC05 ('năm', 3): {tinh_dien_tich_hcn('năm', 3)}")