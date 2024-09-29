package BAI1;

import java.util.Scanner;

public class BAI1 {

	public static void main(String[] args) {
		
	        Scanner scanner = new Scanner(System.in);

	        // Nhập họ và tên sinh viên
	        System.out.print("Nhập họ và tên sinh viên: ");
	        String fullName = scanner.nextLine();

	        // Nhập điểm trung bình
	        System.out.print("Nhập điểm trung bình: ");
	        double averageScore = scanner.nextDouble();

	        // Xuất kết quả
	        System.out.printf("%s %.2f điểm%n", fullName, averageScore);

	        scanner.close();

	}

}
