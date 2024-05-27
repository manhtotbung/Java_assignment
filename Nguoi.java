package bai03;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Nguoi {
	protected String hoTen;
	protected Date ngaySinh;
	protected String queQuan;
	
	//constructor
	public Nguoi() {
			
	}
	
	public Nguoi(String hoTen, Date ngaySinh) {
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		
	}
	
	public Nguoi(String hoTen, Date ngaySinh, String queQuan) {
		this(hoTen,ngaySinh);
		this.queQuan = queQuan;
		
	}
	
	public void nhapThongTin(Scanner sc) {
		System.out.print("Nhap ho ten: ");
		hoTen=sc.nextLine();
		
		System.out.print("Nhap ngay sinh: ");
		String ngaySinhstr = sc.nextLine();
		ngaySinh = stringToDate(ngaySinhstr);
		
		System.out.println("nhap que quan: ");
		queQuan = sc.nextLine();
		
	}
	
	private Date stringToDate(String ngaySinhstr) {
		// TODO Auto-generated method stub
		Date ngaySinhDate = null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			ngaySinhDate = sdf.parse(ngaySinhstr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("loi dinh dang");
		}
		return ngaySinhDate;
	}

	public void inThongTin() {
		System.out.println(hoTen);
		System.out.println(ngaySinh);
		System.out.println(queQuan);
		
		
	}
	public static void main(String[] args) {
		Nguoi ng = new Nguoi();
		Scanner sc = new Scanner(System.in);
		ng.nhapThongTin(sc);
		ng.inThongTin();
	}
}

