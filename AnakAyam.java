
package Pertemuan6PBO;

import java.util.Scanner;

public class AnakAyam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah anak 10ayam awalnya: ");
        int jumlahAwal = scanner.nextInt();

        // Menggunakan for loop
        System.out.println("\nMenggunakan for loop:");
        for (int i = jumlahAwal; i >= 1; i--) {
            System.out.println("Anak ayam turunlah " + i);
            if (i == 1) {
                System.out.println("Mati satu, tinggal induknya");
            } else {
                System.out.println("Mati satu, tinggal " + (i - 1));
            }
        }

        // Menggunakan while loop
        System.out.println("\nMenggunakan while loop:");
        int i = jumlahAwal;
        while (i >= 1) {
            System.out.println("Anak ayam turunlah " + i);
            if (i == 1) {
                System.out.println("Mati satu, tinggal induknya");
            } else {
                System.out.println("Mati satu, tinggal " + (i - 1));
            }
            i--;
        }

        // Menggunakan do-while loop
        System.out.println("\nMenggunakan do-while loop:");
        i = jumlahAwal;
        do {
            System.out.println("Anak ayam turunlah " + i);
            if (i == 1) {
                System.out.println("Mati satu, tinggal induknya");
            } else {
                System.out.println("Mati satu, tinggal " + (i - 1));
            }
            i--;
        } while (i >= 1);
    }
}
