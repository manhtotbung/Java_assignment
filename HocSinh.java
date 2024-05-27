package bai03;

import java.util.Date;
import java.util.Scanner;

public class HocSinh extends Nguoi {

	private String lop;
	private String khoaHoc;
	private int kyHoc;
	
	public HocSinh() {

	}

	public HocSinh(String hoTen, Date ngaySinh, String lop, String khoaHoc) {
		super(hoTen,ngaySinh);
		this.lop = lop;
		this.khoaHoc = khoaHoc;
	}

	public HocSinh(String hoTen, String lop, String khoaHoc) {
		
		this.hoTen = hoTen;
		this.lop = lop;
		this.khoaHoc = khoaHoc;
	}
	
	public String getLop() {
		
		return lop;
	}
	//cài đè, gọi lại để nhập thêm tt về quê quán vv...
	@Override
	public void nhapThongTin(Scanner sc) {
		// TODO Auto-generated method stub
		super.nhapThongTin(sc);
		
		System.out.print("nhap lop: ");
		lop = sc.nextLine();
		
		System.out.print("nhap khoa hoc: ");
		khoaHoc = sc.nextLine();
		
		System.out.print("nhap ky hoc: ");
		kyHoc = sc.nextInt(); sc.nextLine();
	}
	
	@Override
	public void inThongTin() {
		// TODO Auto-generated method stub
		super.inThongTin();
		System.out.println(lop);
		System.out.println(khoaHoc);
		System.out.println(kyHoc);
		
	}
	public static void main(String[] args) {
		HocSinh hs = new HocSinh();
		Scanner sc = new Scanner(System.in);
		hs.nhapThongTin(sc);
		hs.inThongTin();
	}
}
