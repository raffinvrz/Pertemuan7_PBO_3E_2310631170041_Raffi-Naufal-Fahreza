
package Pertemuan6PBO;

public class DeretBilanganPrima {
 public static void main(String[] args) {
        System.out.println("Bilangan Prima dari 0-20:");

        // Menggunakan perulangan for
        for (int i = 2; i <= 20; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\nBilangan bukan Prima dari 0-20:");

        // Menggunakan perulangan while
        int num = 1;
        while (num <= 20) {
            if (!isPrime(num)) {
                System.out.print(num + " ");
            }
            num++;
        }

        System.out.println("\n\nBilangan Bukan Prima dari 0-20 (menggunakan do-while):");

        // Menggunakan perulangan do-while
        num = 1;
        do {
            if (!isPrime(num)) {
                System.out.print(num + " ");
            }
            num++;
        } while (num <= 20);
    }

    // Fungsi untuk memeriksa apakah bilangan adalah prima
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

