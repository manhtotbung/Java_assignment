package bai03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLNS {
	private List<Nguoi> dsns;
	
	public QLNS() {
		dsns = new ArrayList<Nguoi>(100);
	//nguoi: kieu du lieu(<>),(100) so phan tu. 	
	}
	public void themNhanSu(Nguoi ns) {
		dsns.add(ns);
	}

	public void nhapDanhSach(Scanner sc) {
		System.out.println("nhap so nhan su n = ");
		int n = sc.nextInt();
		sc.nextLine();

		int chon = 0;
		Nguoi ns = null;
		for (int i = 0; i < n; i++) {
			System.out.println("chọn loại bạn muốn nhập(0: hs, 1:sv): ");
			chon = sc.nextInt();
			sc.nextLine();

			switch (chon) {
			case 0:
				ns = new HocSinh();
				break;
			case 1:
				ns = new SinhVien();
				break;

			default:
				System.out.println("lua chon ko hop le, vui long chon lai");
				continue;
			}
			ns.nhapThongTin(sc); // neu khong co tinh da hinh se khong the biet duoc o day muon nhap la hoc sinh
									// hay sinh vien, se phai dunng rat nhieu cau lenh khac thay the
			themNhanSu(ns);
		}
	}

	public void inDanhSach() {
//		for (ElementType element : collection) {
//		    // collection là tập hợp các phần tử mà bạn muốn lặp qua (như mảng, danh sách, tập hợp, v.v.).
//		}
		for (Nguoi ns : dsns) {
			ns.inThongTin();
			System.out.println("---------------------------------");
		}
		
	}

	public void timKiemTheoMSV(String msv) {
		for (Nguoi ns : dsns) {
			if (ns instanceof SinhVien) {
				SinhVien sv = (SinhVien) ns;
				if (msv.equals(sv.getMsv())) {
					sv.inThongTin();
				}
			}
		}
	}
	public static void main(String[] args) {
		QLNS qlns = new QLNS();
		Scanner sc = new Scanner(System.in);
		qlns.nhapDanhSach(sc);
		System.out.println("---------------------------------");

		qlns.inDanhSach();
		qlns.timKiemTheoMSV("671660");
	}
}
