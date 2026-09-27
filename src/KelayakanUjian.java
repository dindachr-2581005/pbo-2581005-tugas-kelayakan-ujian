import java.util.Scanner;

    public class KelayakanUjian {
        public static void main(String[] args) {
            Scanner kelayakanUjian = new Scanner(System.in);

            //Program Input
            System.out.print("Kehadiran (%) : ");
            int kehadiran = kelayakanUjian.nextInt();

            System.out.print("Nilai Tugas : ");
            int nilaiTugas = kelayakanUjian.nextInt();

            System.out.print("Dispensasi : ");
            boolean dispensasi = kelayakanUjian.nextBoolean();

            //3 versi penulisan
            boolean a = kehadiran >= 75 && nilaiTugas >= 60 || dispensasi;
            boolean b = (kehadiran >= 75 && nilaiTugas >= 60) || dispensasi;
            boolean c = kehadiran >= 75 && (nilaiTugas >= 60 || dispensasi);

            //negasi dispensasi
            boolean tidakDispensasi = !dispensasi;




            /*
             contoh kehadiran 60 dan nilai tugas 80:
             x tidak menjalankan cek++ karena bagian pertama false.
             Pada y, bagian pertama true sehingga cek++ juga tidak dijalankan.
             Karena kedua operasi mengalami short-circuit, cek tetap 0.
             */

            /*
            contoh kehadiran 80 dan nilai tugas 55:
             x menjalankan cek++ karena bagian pertama true.
             Pada y, bagian pertama false sehingga cek++ dijalankan.
             Karena kedua operasi tidak mengalami short-circuit, cek bertambah 2.
             */
    }
}




