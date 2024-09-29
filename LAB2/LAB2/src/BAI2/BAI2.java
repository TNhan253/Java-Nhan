package BAI2;

import java.util.Scanner;

public class BAI2 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Nhập các hệ số a, b, c
	        System.out.print("Nhập hệ số a: ");
	        double a = scanner.nextDouble();
	        System.out.print("Nhập hệ số b: ");
	        double b = scanner.nextDouble();
	        System.out.print("Nhập hệ số c: ");
	        double c = scanner.nextDouble();

	        // Giải phương trình bậc hai
	        if (a == 0) {
	            if (b == 0) {
	                if (c == 0) {
	                    System.out.println("Phương trình có vô số nghiệm.");
	                } else {
	                    System.out.println("Phương trình vô nghiệm.");
	                }
	            } else {
	                double x = -c / b;
	                System.out.printf("Phương trình bậc nhất, nghiệm là: x = %.2f%n", x);
	            }
	        } else {
	            double delta = b * b - 4 * a * c;
	            if (delta < 0) {
	                System.out.println("Phương trình vô nghiệm.");
	            } else if (delta == 0) {
	                double x = -b / (2 * a);
	                System.out.printf("Phương trình có một nghiệm kép: x = %.2f%n", x);
	            } else {
	                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
	                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
	                System.out.printf("Phương trình có hai nghiệm phân biệt: x1 = %.2f, x2 = %.2f%n", x1, x2);
	            }
	        }

	        scanner.close();

	}

}
