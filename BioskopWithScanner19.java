import java.util.Scanner;

public class BioskopWithScanner19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        
        while (true) {
            System.out.println("\n=== MENU BISKOP ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1-3): ");
            
            int pilihan = sc.nextInt();
            sc.nextLine(); 
            
            switch (pilihan) {
                case 1:
                    inputDataPenonton(sc, penonton);
                    break;
                case 2:
                    tampilkanDaftarPenonton(penonton);
                    break;
                case 3:
                    System.out.println("Terima kasih!");
                    return;
                default:
                    System.out.println("Menu tidak valid!");
            }
        }
    }
    
    public static void inputDataPenonton(Scanner sc, String[][] penonton) {
        
    }
    
    public static void tampilkanDaftarPenonton(String[][] penonton) {
        
    }
}