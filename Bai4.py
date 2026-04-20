def so_ngay_cua_thang(thang, nam):
    try:
        thang, nam = int(thang), int(nam)
    except ValueError:
        return "Lỗi: Đầu vào phải là số nguyên."
        
    if thang < 1 or thang > 12:
        return "Lỗi: Tháng phải từ 1 đến 12."
    if nam < 1:
        return "Lỗi: Năm phải lớn hơn 0."
        
    if thang in [1, 3, 5, 7, 8, 10, 12]:
        return 31
    elif thang in [4, 6, 9, 11]:
        return 30
    else:
        la_nam_nhuan = (nam % 4 == 0 and nam % 100 != 0) or (nam % 400 == 0)
        return 29 if la_nam_nhuan else 28

print("--- KẾT QUẢ CHẠY TEST CASE BÀI 4 ---")
print(f"TC01 (1, 2023): {so_ngay_cua_thang(1, 2023)}")
print(f"TC02 (4, 2023): {so_ngay_cua_thang(4, 2023)}")
print(f"TC03 (2, 2024): {so_ngay_cua_thang(2, 2024)}")
print(f"TC04 (2, 2023): {so_ngay_cua_thang(2, 2023)}")
print(f"TC05 (13, 2023): {so_ngay_cua_thang(13, 2023)}")
print(f"TC06 (5, 0): {so_ngay_cua_thang(5, 0)}")
print(f"TC07 ('hai', 2023): {so_ngay_cua_thang('hai', 2023)}")