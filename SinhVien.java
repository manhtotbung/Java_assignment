package bai03;

import java.util.Scanner;

public class SinhVien extends Nguoi {
	private String msv;

	public SinhVien() {

	}

	public SinhVien(String hoTen, String msv) {
		this.hoTen = hoTen;
		this.msv = msv;
	}

	public void nhapThongTin(Scanner sc) {

		System.out.println("nhap thong tin sinh vien");
		System.out.println("nhap msv: ");
		msv = sc.nextLine();

		super.nhapThongTin(sc);
	}

	public void inThongTin() {
		super.inThongTin();
		System.out.println(msv);
	}

	public String getMsv() {

		return msv;
	}

	public static void main(String[] args) {
		SinhVien sv = new SinhVien();
		Scanner sc = new Scanner(System.in);

		sv.nhapThongTin(sc);
		sv.inThongTin();
	}
}
