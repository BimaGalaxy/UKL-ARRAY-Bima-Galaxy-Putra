//Nama : Bima Galaxy Putra
//Kelas : X-R4
//No.Absen : 9
package tugasakhirsemesterganjil;

import java.util.Scanner;

/**
 *
 * @author Galaxy
 */
public class ukl_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan nama ");
        System.out.println("bima\tgalaxy\tputra");
        String nama = input.nextLine();

        String[] name = { "bima", "galaxy", "putra" };
        String[] nomor = { "0081", "2220", "1220" };
        String[] moto = { "ok", "siap", "selesai" };
        String[][] kelompok = { name, nomor, moto };
        int terdaftar = 0;

        for (int i = 0; i < 3; i++) {
            if (nama.equalsIgnoreCase(kelompok[0][i])) {
                System.out.print("nama : " + kelompok[0][i] + "\nnomor telepon : " + kelompok[1][i] + "\nmotivasi : "
                        + kelompok[2][i]);
                terdaftar = 1;
            }
        }
    }

}
