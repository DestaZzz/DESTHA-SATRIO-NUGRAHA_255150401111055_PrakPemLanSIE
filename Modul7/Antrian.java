import java.util.LinkedList;
import java.util.Scanner;

public class Antrian {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        String nama;
        int pilihan;

        do {
            System.out.println("\n1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Antrian Terdepan");
            System.out.println("4. Tampilkan Semua Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            if (pilihan == 1) {
                System.out.print("Masukkan nama: ");
                nama = scanner.nextLine();

                if (nama.equalsIgnoreCase("Budi")) {
                    queue.addFirst(nama);
                    System.out.println("Budi masuk ke depan antrian");
                } else {
                    queue.addLast(nama); 
                }
            }

            else if (pilihan == 2) {
                if (queue.isEmpty()) {
                    System.out.println("Antrian kosong");
                } else {
                    nama = queue.poll();
                    System.out.println("Memanggil: " + nama);
                }
            }

            else if (pilihan == 3) {
                if (queue.isEmpty()) {
                    System.out.println("Tidak ada antrian");
                } else {
                    System.out.println("Antrian terdepan: " + queue.peek());
                }
            }

            else if (pilihan == 4) {
                if (queue.isEmpty()) {
                    System.out.println("Antrian kosong");
                } else {
                    System.out.println("Isi antrian: " + queue);
                }
            }

        } while (pilihan != 0);

        scanner.close();
        System.out.println("Program selesai.");
    }
}