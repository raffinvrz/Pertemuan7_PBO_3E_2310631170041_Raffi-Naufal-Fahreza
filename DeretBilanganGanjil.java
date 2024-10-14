
package Pertemuan6PBO;

public class DeretBilanganGanjil {
     public static void main(String[] args) {
        System.out.println("Deret Bilangan Ganjil dan Genap (0-20)");

        // Menggunakan perulangan for
        System.out.println("\nMenggunakan perulangan for:");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nBilangan ganjil:");
        for (int i = 1; i <= 20; i += 2) {
            System.out.print(i + " ");
        }

        // Menggunakan perulangan while
        System.out.println("\n\nMenggunakan perulangan while:");
        int j = 0;
        while (j <= 20) {
            if (j % 2 == 0) {
                System.out.print(j + " ");
            }
            j++;
        }
        System.out.println("\nBilangan ganjil:");
        int k = 1;
        while (k <= 20) {
            System.out.print(k + " ");
            k += 2;
        }

        // Menggunakan perulangan do-while
        System.out.println("\n\nMenggunakan perulangan do-while:");
        int l = 0;
        do {
            if (l % 2 == 0) {
                System.out.print(l + " ");
            }
            l++;
        } while (l <= 20);
        System.out.println("\nBilangan ganjil:");
        int m = 1;
        do {
            System.out.print(m + " ");
            m += 2;
        } while (m <= 20);
    }
}

