package Nhap;

import java.util.Scanner;

public class NhapTuBanPhim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập họ tên:");
		String hoTen = scanner.nextLine();
		System.out.print("Tuổi: ");
		int tuoi = scanner.nextInt();
		System.out.print("Cân nặng (Kg): ");
		double canNang = scanner.nextDouble();
		System.out.print("Chiều cao (cm): ");
		double chieuCao = scanner.nextDouble();
		//Xuất thông tin nhập
		System.out.println("------------------------------------------");
		System.out.println("Họ và tên: " + hoTen);
		System.out.println("Tuổi: " + tuoi);
		System.out.println("Cân nặng: " + canNang);
		System.out.println("Chiều cao: " + chieuCao);
			}

	}


