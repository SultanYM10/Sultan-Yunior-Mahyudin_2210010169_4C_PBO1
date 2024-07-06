package UAS;

public class DataDiri {
    //Encapsulation
    private String nama;
    public String npm;
    private String kelas;
    private String jenisKelamin;

    // Constructor
    public DataDiri(String nama, String npm, String kelas, String jenisKelamin) {
        this.nama = nama;
        this.npm = npm;
        this.kelas = kelas;
        this.jenisKelamin = jenisKelamin;
    }

    // Accessor (getter)
    public String getNama() {
        return nama;
    }

    public String getNpm() {
        return npm;
    }

    public String getKelas() {
        return kelas;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    // Mutator (setter)
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

    // Method untuk menampilkan informasi
    public String displayInfo() {
        return "Nama : " + nama +
               "\nNPM : " + npm +
               "\nKelas : " + kelas +
               "\nJenis Kelamin : " + jenisKelamin;
    }
}

