package NhapXuatHoTen;

import java.util.Scanner;

public class NhapXuatHoTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Khai báo các biến chứa dữ liệu nhập vào
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập họ: ");
		String ho = scanner.nextLine();
		System.out.print("Nhập chữ lót: ");
		String chuLot = scanner.nextLine();
		System.out.print("Nhập tên: ");
		String ten = scanner.nextLine();
System.out.println("---------------------------");
				System.out.println("Họ và tên: " + ho + chuLot + ten);
	}

}
