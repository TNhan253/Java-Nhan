package BAI4;

import java.util.Scanner;

public class BAI4 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Nhập các hệ số a, b, c của phương trình bậc 2
	        System.out.print("Nhập hệ số a: ");
	        double a = scanner.nextDouble();
	        System.out.print("Nhập hệ số b: ");
	        double b = scanner.nextDouble();
	        System.out.print("Nhập hệ số c: ");
	        double c = scanner.nextDouble();

	        // Tính delta
	        double delta = b * b - 4 * a * c;

	        // Xuất căn delta
	        if (delta < 0) {
	            System.out.println("Delta âm, không có căn bậc hai thực.");
	        } else {
	            double sqrtDelta = Math.sqrt(delta);
	            System.out.printf("Căn bậc hai của delta là: %.2f%n", sqrtDelta);
	        }

	        scanner.close();
	}

}
