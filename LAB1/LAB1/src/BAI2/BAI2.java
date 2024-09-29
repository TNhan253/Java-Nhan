package BAI2;

import java.util.Scanner;

public class BAI2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Nhập hai cạnh của hình chữ nhật
        System.out.print("Nhập chiều dài: ");
        double length = scanner.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        double width = scanner.nextDouble();

        // Tính chu vi, diện tích, và cạnh nhỏ
        double perimeter = 2 * (length + width);
        double area = length * width;
        double smallerSide = Math.min(length, width);

        // Xuất kết quả
        System.out.printf("Chu vi hình chữ nhật: %.2f%n", perimeter);
        System.out.printf("Diện tích hình chữ nhật: %.2f%n", area);
        System.out.printf("Cạnh nhỏ của hình chữ nhật: %.2f%n", smallerSide);

        scanner.close();

	}

}
