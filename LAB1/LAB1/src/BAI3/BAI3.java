package BAI3;

import java.util.Scanner;

public class BAI3 {

	public static void main(String[] args) {
		
	        Scanner scanner = new Scanner(System.in);

	        // Nhập cạnh của khối lập phương
	        System.out.print("Nhập cạnh của khối lập phương: ");
	        double side = scanner.nextDouble();

	        // Tính thể tích
	        double volume = Math.pow(side, 3);

	        // Xuất kết quả
	        System.out.printf("Thể tích của khối lập phương là: %.2f%n", volume);

	        scanner.close();

	}

}
