
package Pertemuan6PBO;

import java.util.Scanner;

public class TabelPerkalian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai n (maksimal 10): ");
        int n = scanner.nextInt();

        // Validasi input
        if (n <= 0 || n > 10) {
            System.out.println("Nilai n harus antara 1 dan 10.");
            return;
        }

        // Membuat tabel perkalian
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}

