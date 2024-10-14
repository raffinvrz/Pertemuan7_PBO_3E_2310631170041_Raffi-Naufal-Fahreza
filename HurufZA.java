
package Pertemuan6PBO;

public class HurufZA {
    public static void main(String[] args) {
        // Menggunakan perulangan for
        System.out.println("Menggunakan perulangan for:");
        for (char huruf = 'Z'; huruf >= 'A'; huruf--) {
            System.out.print(huruf + " ");
        }
        System.out.println();

        // Menggunakan perulangan while
        System.out.println("\nMenggunakan perulangan while:");
        char huruf = 'Z';
        while (huruf >= 'A') {
            System.out.print(huruf + " ");
            huruf--;
        }
        System.out.println();

        // Menggunakan perulangan do-while
        System.out.println("\nMenggunakan perulangan do-while:");
        huruf = 'Z';
        do {
            System.out.print(huruf + " ");
            huruf--;
        } while (huruf >= 'A');
    }
}

