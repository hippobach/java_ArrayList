package test;

import java.util.Scanner;

import main.DanhSachSinhVien;
import main.SinhVien;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DanhSachSinhVien dssv = new DanhSachSinhVien();
		int luaChon = 0;
		
		do {
			System.out.println("MENU ---------- ");
			System.out.println("VUI LONG CHON CHUC NANG  ");
			System.out.println(
			  "1.	Them sinh vien.\n"
			+ "2.	In danh sach sinh vien.\n"
			+ "3.	Kiem tra danh ssch co rong hay khong.\n"
			+ "4.	Lay ra so luong sinh vien trong danh sach.\n"
			+ "5.	Lam rong danh sach sinh vien.\n"
			+ "6.	Kiem tra sinh vien ton tai trong danh sach hay khong, dua vao msv.\n"
			+ "7.	Xoa sv dua vao msv.\n"
			+ "8.	Tim kiem dua vao ten duoc nhap.\n"
			+ "9.	Xuat ra man hinh sinh vien co diem tu cao toi thap.\n"
			+ "0.   Exit");
			luaChon = sc.nextInt();
			sc.nextLine();

//			them sinh vien vao danh sach
			if(luaChon == 1) {
				System.out.println("Nhap ma sv: "); String maSinhVien = sc.nextLine();
				System.out.println("Nhap ho va ten: "); String hoVaTen = sc.nextLine();
				System.out.println("Nhap nam sinh: "); int namSinh = sc.nextInt();
				System.out.println("Nhap diem: "); float diemTrungBinh = sc.nextFloat();
				SinhVien sv = new SinhVien(maSinhVien, hoVaTen, namSinh, diemTrungBinh);
			    dssv.themSinhVien(sv);			    

			} 
//			in danh sach sinh vien
			else if(luaChon == 2) {
				dssv.inDanhSachSinhVien();
			} 
//			kiem tra danh sach co rong hay khong
			else if(luaChon == 3) {
				System.out.println("Danh sach rong: "+ dssv.kiemTraRong());
			}
//			so luong phan tu
			else if(luaChon == 4) {
				System.out.println("So luong phan tu: "+ dssv.soLuongPhanTu());
			} 
//			lam rong danh sach sinh vien
			else if(luaChon == 5) {
				dssv.lamRongDanhSach();
			}
//			kiem tra phan tu co ton tai hay khong
			else if(luaChon == 6) {
				System.out.println("Nhap ma sinh vien can kiem tra: "); String maSinhVien = sc.nextLine();
				SinhVien sv = new SinhVien(maSinhVien);
				System.out.println("Check: "+ dssv.kiemTraTonTai(sv));
				
			}
//			Xoa phan tu ra khoi danh sach
			else if(luaChon == 7) {
				System.out.println("Nhap ma sinh vien: "); String maSinhVien = sc.nextLine();
				SinhVien sv = new SinhVien(maSinhVien);
				System.out.println("Xoa sinh vien trong danh sach: "+ dssv.xoaSinhVien(sv));
				dssv.inDanhSachSinhVien();
				
			}
//	        tim kiem phan tu duoc nhap tu ban phim	
			else if(luaChon == 8) {
				System.out.println("Nhap ho va ten sinh vien: "); String hoVaTen = sc.nextLine();
				System.out.println("Ket qua tim kiem: ");
				dssv.timSinhVien(hoVaTen);
			}
//			xuat ra man hinh sinh vien co diem tu thap toi cao
			else if(luaChon == 9) {
				dssv.sapXepSinhVienGiamDan();
				dssv.inDanhSachSinhVien();
			}
			
		} while(luaChon != 0);
	}
}
