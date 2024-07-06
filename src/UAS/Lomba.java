package UAS;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Lomba {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input Output
        System.out.println("==========PROGRAM PENDAFTARAN LOMBA UNISKA=========="
                + "\n\nList Lomba Yang Tersedia :"
                + "\n1. Badminton (08:00 WITA / Lapangan Murjani BJB)"
                + "\n2. Tennis (10:10 WITA / Uniska Adyakhsa BJM)"
                + "\n3. Volley (16:00 WITA / Uniska Adyakhsa BJM)");
        System.out.println("====================================================");

        int jumlahPeserta = 0;
        while (true) {
            System.out.print("\nBerapa peserta yang ingin daftar: ");
            try {
                jumlahPeserta = input.nextInt();
                input.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid: Masukkan angka yang sesuai.");
                input.nextLine();
            }
        }

        // Array
        PesertaLomba[] pesertaArray = new PesertaLomba[jumlahPeserta];

        for (int i = 0; i < pesertaArray.length; i++) {
            System.out.println("\n-Peserta " + (i + 1) + "-");
            System.out.print("Nama: ");
            String nama = input.nextLine();
            String npm;
            while (true) {
                try {
                    System.out.print("NPM: ");
                    npm = input.nextLine();
                    ValidasiNpm(npm);
                    break;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            System.out.print("Kelas: ");
            String kelas = input.nextLine();
            String jenisKelamin = "";
            while (true) {
                try {
                    System.out.print("Jenis Kelamin (L/P) : ");
                    jenisKelamin = input.nextLine().toUpperCase();
                    if (!jenisKelamin.equals("L") && !jenisKelamin.equals("P")) {
                        throw new InputMismatchException("Jenis kelamin harus 'L' atau 'P'");
                    }
                    if (jenisKelamin.equals("L")) {
                        jenisKelamin = "Laki-laki";
                    } else if (jenisKelamin.equals("P")) {
                        jenisKelamin = "Perempuan";
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Input Jenis Kelamin Tidak Sesuai : " + e.getMessage());
                }
            }
            String lomba = "";
            while (true) {
                try {
                    System.out.print("Lomba yang ingin di ikuti (Badminton/Tennis/Volley) : ");
                    lomba = input.nextLine();
                    if (!lomba.equalsIgnoreCase("Badminton") && !lomba.equalsIgnoreCase("Tennis") && !lomba.equalsIgnoreCase("Volley")) {
                        throw new InputMismatchException("Input Lomba Tidak Sesuai!");
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Input Lomba Tidak Sesuai!");
                }
            }

            try {
                pesertaArray[i] = new PesertaLomba(nama, npm, kelas, jenisKelamin, lomba);
            } catch (Exception e) {
                System.out.println("Error : " + e.getMessage());
                i--;
            }
        }

        System.out.println("\n=======Hasil Data=======");
        for (int i = 0; i < pesertaArray.length; i++) {
            System.out.println("\n-Data Peserta " + (i + 1) + "-");
            System.out.println(pesertaArray[i].displayInfo());
        }

        input.close();
    }

    // Error Handling NPM
    public static void ValidasiNpm(String npm) throws Exception {
        if (npm.length() != 10) {
            throw new Exception("Input Format NPM Salah : NPM harus terdiri dari 10 digit!");
        }
        try {
            Long.parseLong(npm);
        } catch (NumberFormatException e) {
            throw new Exception("Input Format NPM Salah : Input NPM harus berupa nomor!");
        }
    }
}
