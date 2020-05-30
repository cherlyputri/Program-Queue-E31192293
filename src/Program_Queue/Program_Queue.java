package Program_Queue;

import java.util.*;

/**
 *
 * @author CHERLY CHRYS
 */
public class Program_Queue {

    public static void main(String[] args) {

        // tahap inialisasi program queue menggunakan objek linked list
        Queue<String> AntrianPendaftaran = new LinkedList<>();

        // menambahkan data atau nilai baru ke dalam list queue (OPERASI ENQUEUE)
        AntrianPendaftaran.add("Cherly");
        AntrianPendaftaran.add("Chrys");
        AntrianPendaftaran.add("Diana");
        AntrianPendaftaran.add("Putri");
        AntrianPendaftaran.add("Tasya");
        AntrianPendaftaran.add("Sunny");

        // digunakan untuk menampilkan output hasil dari list queue
        System.out.println("Antrian Pendaftaran Tiket Nonton : " + AntrianPendaftaran);

        // digunakan untuk menghapus sebuah elemen dari queue menggunakan method remove() (OPERASI DEQUEUE)
        // method remove() akan melempar NoSuchElementException apabila list queue kosong
        String nama = AntrianPendaftaran.remove();
        System.out.println("Menghapus dari Antrian Tiket Nonton : " + nama + "|Daftar Antrian Baru : " + AntrianPendaftaran);

        // digunakan untuk menghapus sebuah elemen dari queu menggunakan method poll()
        // method remove() akan mengembalikan null apabila list queue kosong
        nama = AntrianPendaftaran.poll();
        System.out.println("Menghapus dari Antrian Pendaftaran : " + nama + " | Daftar Antrian Baru : " + AntrianPendaftaran);
    }

}
