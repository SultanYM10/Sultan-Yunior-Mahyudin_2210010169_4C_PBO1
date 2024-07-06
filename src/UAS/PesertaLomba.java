package UAS;

import java.util.InputMismatchException;

//Inheritance
public final class PesertaLomba extends DataDiri {
    //Encapsulation
    private String lomba;
    private final String fakultas;
    private final String prodi;
    private final String waktuTempat;

    // Constructor dengan parameter tambahan
    public PesertaLomba(String nama, String npm, String kelas, String jenisKelamin, String lomba) throws Exception {
        super(nama, npm, kelas, jenisKelamin);
        setLomba(lomba);
        this.fakultas = getFakultas();
        this.prodi = getProdi();
        this.waktuTempat = getWaktuTempat(lomba);
    }

    //Seleksi
    public int getTahunMasuk (){
        return Integer.parseInt(getNpm().substring(0,2))+ 2000;
    }
    
    public int getNomorUrut (){
        return Integer.parseInt(getNpm().substring(6,10));
    }
    
    // Seleksi dan switch
    public String getFakultas() {
        String kodeFakultas = getNpm().substring(2, 4);
        if (kodeFakultas.equals("10")) {
            return "Teknologi Informasi";
        } else {
            return "Fakultas lain";
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

    public String getWaktuTempat(String lomba) throws InputMismatchException {
        switch(lomba.toLowerCase()) {
            case "badminton":
                return "08:00 WITA / Lapangan Murjani BJB";
            case "tennis":
                return "10:10 WITA / Uniska Adyakhsa BJM";
            case "volley":
                return "16:00 WITA / Uniska Adyakhsa BJM";
            default:
                throw new InputMismatchException("Lomba tidak sesuai dengan list yang tersedia");
        }
    }

    // Polymorphism - Overriding method displayInfo
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

    public void setLomba(String lomba) throws InputMismatchException {
        this.lomba = lomba;
    }
}