package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
	private ArrayList<SinhVien> danhSach;

	public DanhSachSinhVien() {
		this.danhSach = new ArrayList<SinhVien>();
	}

	public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
		this.danhSach = danhSach;
	}

//	them sinh vien vao danh sach
	public void themSinhVien(SinhVien sv) {
		this.danhSach.add(sv);
	}

//	in danh sach sinh vien
	public void inDanhSachSinhVien() {
//		di lan luot tung phan tu trong danh sach
		for (SinhVien sinhVien : danhSach) {
			System.out.println(sinhVien);
		}
	}

//	Kiem tra danh sach co rong hay khong
	public boolean kiemTraRong() {
		return this.danhSach.isEmpty();
	}

//	lay ra so luong phan tu trong danh sach
	public int soLuongPhanTu() {
		return this.danhSach.size();
	}

//	lam rong danh sach 
	public void lamRongDanhSach() {
		this.danhSach.removeAll(danhSach);
	}

//	kiem tra phan tu co ton tai trong danh sach hay khong
	public boolean kiemTraTonTai(SinhVien sv) {
		return this.danhSach.contains(sv);
	}

//	Xoa phan tu ra khoi danh sach
	public boolean xoaSinhVien(SinhVien sv) {
		return this.danhSach.remove(sv);
	}

//	tim kiem phan tu duoc nhap tu ban phim
	public void timSinhVien(String ten) {
		for (SinhVien sinhVien : danhSach) {
			if (sinhVien.getHoVaTen().indexOf(ten) >= 0) {
				System.out.println(sinhVien);
			}
		}
	}

//	xuat ra man hinh cac phan tu theo yeu cau
	public void sapXepSinhVienGiamDan() {
		Collections.sort(this.danhSach, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien sv1, SinhVien sv2) {
				if (sv1.getDiemTrungBinh() < sv2.getDiemTrungBinh()) {
					return -1;
				} else if (sv1.getDiemTrungBinh() > sv2.getDiemTrungBinh()) {
					return 1;
				} else {
					return 0;
				}
			}

		});
	}

}
