package BAI3;

import java.util.Scanner;

public class BAI3 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số điện sử dụng
        System.out.print("Nhập số điện sử dụng (kWh): ");
        double soDien = scanner.nextDouble();

        // Tính tiền điện
        double tien;
        if (soDien < 0) {
            System.out.println("Số điện sử dụng không hợp lệ.");
        } else if (soDien <= 50) {
            tien = soDien * 1000;
            System.out.printf("Tiền điện phải trả là: %.2f VND%n", tien);
        } else {
            tien = 50 * 1000 + (soDien - 50) * 1200;
            System.out.printf("Tiền điện phải trả là: %.2f VND%n", tien);
        }

        scanner.close();
	}

}
