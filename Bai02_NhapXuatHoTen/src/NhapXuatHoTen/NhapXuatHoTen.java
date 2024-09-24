package NhapXuatHoTen;

import java.util.Scanner;

public class NhapXuatHoTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Khai báo các biến chứa dữ liệu nhập vào
				String hoTen;
				int tuoi;
				double chieuCao;
				double canNang;
				// Tạo đối tượng của lớp Scanner để nhập dữ liệu
				Scanner banPhim; // Khai báo
				banPhim = new Scanner (System.in);// xin mời
				// Đọc dữ liệu từ bàn phím, cất vào các biến tương ứng
				
				// Lấy chuỗi
				hoTen= banPhim.nextLine();
				tuoi = banPhim.nextInt();
				chieuCao = banPhim.nextDouble();
				System.out.println("Họ và tên: " + hoTen);
	}

}
