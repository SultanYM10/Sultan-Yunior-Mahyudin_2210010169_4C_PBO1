# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah aplikasi program pendaftaran lomba untuk mahasiswa uniska menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama, NPM, kelas, jenis kelamin, dan lomba yang diikuti oleh mahasiswa. Kemudian aplikasi memberikan output berupa informasi detail dari peserta lomba, termasuk tahun masuk, fakultas, program studi, nomor registrasi, dan waktu serta tempat lomba.

Aplikasi ini mengimplementasikan berbagai konsep OOP seperti Class, Object, Atribut, Constructor, Method (Accessor, Mutator, Overriding), Encapsulation, Inheritance, Polymorphism (Overloading dan Overriding), Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `DataDiri`, `PesertaLomba`, dan `Lomba` adalah contoh dari class.

```bash
public class DataDiri {
    ...
}

public final class PesertaLomba extends DataDiri {
    ...
}

public class lomba {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, ` pesertaArray[i] = new PesertaLomba(nama, npm, kelas, jenisKelamin, lomba);` adalah contoh pembuatan object.

```bash
pesertaArray[i] = new PesertaLomba(nama, npm, kelas, jenisKelamin, lomba);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama`, `npm`, `kelas`, dan `jenisKelamin`  adalah contoh atribut.

```bash
private String nama;
public String npm;
private String kelas;
private String jenisKelamin;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `DataDiri` dan `PesertaLomba`.

```bash
public DataDiri(String nama, String npm, String kelas, String jenisKelamin) {
        this.nama = nama;
        this.npm = npm;
        this.kelas = kelas;
        this.jenisKelamin = jenisKelamin;
    }

 public PesertaLomba(String nama, String npm, String kelas, String jenisKelamin, String lomba) throws Exception {
        super(nama, npm, kelas, jenisKelamin);
        setLomba(lomba);
        this.fakultas = getFakultas();
        this.prodi = getProdi();
        this.waktuTempat = getWaktuTempat(lomba);
    }
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama`, `setNpm`, `setKelas`, dan `setJenisKelamin` adalah contoh method mutator.
```
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getNpm`, `getKelas`, dan `getjenisKelamin` adalah contoh method accessor.

```bash
public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `npm` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private String npm;
private String kelas;
private String jenisKelamin;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `PesertaLomba` mewarisi `DataDiri` dengan sintaks `extends`.

```bash
public class PesertaLomba extends DataDiri {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo` dan `displayInfo` di `PesertaLomba` merupakan override dari method `displayInfo` di `DataDiri`.

```bash
@Override
public String displayInfo() {
return super.displayInfo() +
    "\nTahun Masuk : " +getTahunMasuk()+
    "\nNomor Urut : " +getNomorUrut()+
    "\nFakultas : " + fakultas +
    "\nProdi : " + prodi +
    "\nLomba yang di ikuti : " + lomba +
    "\nWaktu & Tempat : " + waktuTempat;
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getFakultas` dan seleksi `switch` dalam method `getProdi`.

```bash
    public String getFakultas() {
        String kodeFakultas = getNpm().substring(2, 4);
        if (kodeFakultas.equals("10")) {
            return "Teknologi Informasi";
        } else {
            return "Fakultas lain";
        }
    }
}

public String getProdi() {
        String kodeFakultas = getNpm().substring(2, 4);
        String kodeProdi = getNpm().substring(4, 6);
        switch (kodeFakultas) {
            case "10":
                switch (kodeProdi) {
                    case "01":
                        return "Teknik Informatika";
                    case "02":
                        return "Sistem Informasi";
                }
            default:
                return "Prodi lain";
        }
    }
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < pesertaArray.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
    ...
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
    ...
System.out.println("\n=======Hasil Data=======");
        for (int i = 0; i < pesertaArray.length; i++) {
            System.out.println("\n-Data Peserta " + (i + 1) + "-");
            System.out.println(pesertaArray[i].displayInfo());
        }
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `MahasiswaDetail[] mahasiswas = new MahasiswaDetail[2];` adalah contoh penggunaan array.

```bash
PesertaLomba[] pesertaArray = new PesertaLomba[jumlahPeserta];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
System.out.print("Lomba yang ingin di ikuti (Badminton/Tennis/Volley) : ");
lomba = input.nextLine();
if (!lomba.equalsIgnoreCase("Badminton") && !lomba.equalsIgnoreCase("Tennis") && !lomba.equalsIgnoreCase("Volley")) {
throw new InputMismatchException("Input Lomba Tidak Sesuai!");
}
break;
} catch (InputMismatchException e) {
System.out.println("Input Lomba Tidak Sesuai!");
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Sultan Yunior Mahyudin
NPM: 2210010169
