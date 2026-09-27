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

            //Output
            System.out.println();
            System.out.println("===== KELAYAKAN UJIAN =====");
            System.out.println("Kehadiran   : " + kehadiran + "%");
            System.out.println("Nilai tugas : " + nilaiTugas);
            System.out.println("Dispensasi  : " + dispensasi);

            System.out.println();
            System.out.println("a (tanpa kurung)     : " + a);
            System.out.println("b (kurung precedence): " + b);
            System.out.println("c (kurung digeser)   : " + c);
            System.out.println("!dispensasi          : " + tidakDispensasi);

            /*
            Hasil yang sama dengan a adalah b. Karena operator && memiliki precedence
            lebih tinggi daripada ||.. Jadi, java membaca a persis seperti b. Kesimpulannya,
            karena && mengikat lebih kuat daripada ||.
             */




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




