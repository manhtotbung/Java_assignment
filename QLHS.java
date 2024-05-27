package bai03;

import java.util.ArrayList;
import java.util.Scanner;

public class QLHS {
	private ArrayList<HocSinh> dshs;
	
	public QLHS() {
		dshs = new ArrayList<HocSinh>();
	}

	public void themHocSinh(HocSinh hs) {
		dshs.add(hs);
	}

	public void nhapDanhSach(Scanner sc) {
		
		System.out.println("nhap so luong hoc sinh: ");
		int n = sc.nextInt();sc.nextLine();
		
		for(int i=0; i<n; i++) {
			HocSinh hs = new HocSinh();
			hs.nhapThongTin(sc);
			themHocSinh(hs);
		}
	}
	
	public void inDanhSach() {
		for(HocSinh hs : dshs) {
			hs.inThongTin();
			System.out.println("------------------------------");
		}
		
		
	}
	
	public void timKiemHocSinh(int namSinh, String queQuan) {
		System.out.println("Danh sach hs sinh nam" + namSinh + "que o " + queQuan + ":");
		for (HocSinh hs : dshs) {
			if((namSinh == hs.ngaySinh.getYear() + 1900) && (queQuan.equals(hs.queQuan))){
				hs.inThongTin();
			}
		}
	}
	
	public void timKiemHocSinh(String lop) {
		System.out.println("Nhap DS hoc sinh cua lop " + lop + ":");
		for (HocSinh hs : dshs) {
			if(lop.equals(hs.getLop())) {
				hs.inThongTin();
			}
		}
	}
	
	public static void main(String[] args) {
		QLHS hs = new QLHS();
		Scanner sc= new Scanner(System.in);
		hs.nhapDanhSach(sc);
		hs.inDanhSach();
		hs.timKiemHocSinh(2004, "hn");
		System.out.println("--------------------------------");
		hs.timKiemHocSinh("cnpma");
	
	}

}
