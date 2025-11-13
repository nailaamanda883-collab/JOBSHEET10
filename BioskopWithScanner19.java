import java.util.Scanner;

public class BioskopWithScanner19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        int pilihan;

        while (true) {
            System.out.println("=== MENU BIOSKOP ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1-3): ");
            pilihan = sc.nextInt();
            sc.nextLine();
            if (pilihan == 1) {
                while (true) {
                    System.out.print("Masukkan nama: ");
                    String nama = sc.nextLine();

                    System.out.print("Masukkan baris (1-" + penonton.length + "): ");
                    int baris = sc.nextInt();
                    System.out.print("Masukkan kolom (1-" + penonton[0].length + "): ");
                    int kolom = sc.nextInt();
                    sc.nextLine();
                    if (baris < 1 || baris > penonton.length || kolom < 1 || kolom > penonton[0].length) {
                        System.out.println("Nomor baris atau kolom tidak tersedia! Silakan masukkan ulang.");
                        continue;
                    }

                    if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("Kursi tersebut sudah ditempati oleh " + penonton[baris - 1][kolom - 1]);
                        System.out.println("Silakan pilih baris dan kolom lain.\n");
                        continue;
                    }

                    penonton[baris - 1][kolom - 1] = nama;

                    System.out.print("Input penonton lainnya? (y/n): ");
                    String next = sc.nextLine();

                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                }
            } else if (pilihan == 2) {
                System.out.println("\n=== DAFTAR PENONTON ===");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            System.out.print("***\t");
                        } else {
                            System.out.print(penonton[i][j] + "\t");
                        }
                    }
                    System.out.println();
                }
            } else if (pilihan == 3) {
                System.out.println("Exited.");
                break;
            } else {
                System.out.println("Pilihan tidak valid! Silakan pilih 1-3.");
            }
        }
    }
}