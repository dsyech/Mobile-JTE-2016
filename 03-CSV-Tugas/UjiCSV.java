import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class UjiCSV {
    public UjiCSV() { }

    @Before
    public void setUp() {
        File file = new File(NAMA_BERKAS);
        if (file.exists() == true)
            file.delete();
    }

    @After
    public void tearDown() {
        File file = new File(NAMA_BERKAS);
        if (file.exists() == true)
            file.delete();
    }
    
    @Test
    public void berkasKosong() throws IOException {
        // Buat berkas CSV kosong untuk diuji
        BufferedWriter berkasTulis = null;
        try {
            berkasTulis = new BufferedWriter(new FileWriter(NAMA_BERKAS));
        } 
        finally {
            // Tutup berkas
            if (berkasTulis != null)
                berkasTulis.close();
        }
        
        // Uji
        CSV csv = new CSV();
        long jumlah = csv.jumlahkan(NAMA_BERKAS);
        assertEquals(jumlah, 0);
    }
    
    @Test
    public void isi1Baris3Koma0Angka() throws IOException {
        // Buat berkas CSV untuk diuji
        String baris1 = ",,,";
        BufferedWriter berkasTulis = null;
        try {
            berkasTulis = new BufferedWriter(new FileWriter(NAMA_BERKAS));
            berkasTulis.write(baris1, 0, baris1.length());
        } 
        finally {
            // Tutup berkas
            if (berkasTulis != null)
                berkasTulis.close();
        }
        
        // Uji
        CSV csv = new CSV();
        long jumlah = csv.jumlahkan(NAMA_BERKAS);
        assertEquals(jumlah, 0);
    }

    @Test
    public void isi2Baris3Koma0AngkaBaris2Kosong() throws IOException {
        // Buat berkas CSV untuk diuji
        String baris1 = ",,,";
        BufferedWriter berkasTulis = null;
        try {
            berkasTulis = new BufferedWriter(new FileWriter(NAMA_BERKAS));
            berkasTulis.write(baris1, 0, baris1.length());
            berkasTulis.newLine();
        } 
        finally {
            // Tutup berkas
            if (berkasTulis != null)
                berkasTulis.close();
        }
        
        // Uji
        CSV csv = new CSV();
        long jumlah = csv.jumlahkan(NAMA_BERKAS);
        assertEquals(jumlah, 0);
    }

    @Test
    public void isi1Baris3Koma3Angka() throws IOException {
        // Buat berkas CSV untuk diuji
        String baris1 = "5,6,7,";
        BufferedWriter berkasTulis = null;
        try {
            berkasTulis = new BufferedWriter(new FileWriter(NAMA_BERKAS));
            berkasTulis.write(baris1, 0, baris1.length());
        } 
        finally {
            // Tutup berkas
            if (berkasTulis != null)
                berkasTulis.close();
        }
        
        // Uji
        CSV csv = new CSV();
        long jumlah = csv.jumlahkan(NAMA_BERKAS);
        assertEquals(jumlah, 18);
    }

    @Test
    public void isi2Baris3Koma3AngkaBaris2Kosong() throws IOException {
        // Buat berkas CSV untuk diuji
        String baris1 = "5,6,7,";
        BufferedWriter berkasTulis = null;
        try {
            berkasTulis = new BufferedWriter(new FileWriter(NAMA_BERKAS));
            berkasTulis.write(baris1, 0, baris1.length());
            berkasTulis.newLine();
        } 
        finally {
            // Tutup berkas
            if (berkasTulis != null)
                berkasTulis.close();
        }
        
        // Uji
        CSV csv = new CSV();
        long jumlah = csv.jumlahkan(NAMA_BERKAS);
        assertEquals(jumlah, 18);
    }

    @Test
    public void isi1Baris3Koma4Angka() throws IOException {
        // Buat berkas CSV untuk diuji
        String baris1 = "5,6,7,8";
        BufferedWriter berkasTulis = null;
        try {
            berkasTulis = new BufferedWriter(new FileWriter(NAMA_BERKAS));
            berkasTulis.write(baris1, 0, baris1.length());
        } 
        finally {
            // Tutup berkas
            if (berkasTulis != null)
                berkasTulis.close();
        }
        
        // Uji
        CSV csv = new CSV();
        long jumlah = csv.jumlahkan(NAMA_BERKAS);
        assertEquals(jumlah, 26);
    }

    @Test
    public void isi2Baris3Koma4AngkaBaris2Kosong() throws IOException {
        // Buat berkas CSV untuk diuji
        String baris1 = "5,6,7,8";
        BufferedWriter berkasTulis = null;
        try {
            berkasTulis = new BufferedWriter(new FileWriter(NAMA_BERKAS));
            berkasTulis.write(baris1, 0, baris1.length());
            berkasTulis.newLine();
        } 
        finally {
            // Tutup berkas
            if (berkasTulis != null)
                berkasTulis.close();
        }
        
        // Uji
        CSV csv = new CSV();
        long jumlah = csv.jumlahkan(NAMA_BERKAS);
        assertEquals(jumlah, 26);
    }

    @Test
    public void isi2Baris3Koma4Angka() throws IOException {
        // Buat berkas CSV untuk diuji
        String baris1 = "5,6,7,8";
        String baris2 = "8,7,6,5";
        BufferedWriter berkasTulis = null;
        try {
            berkasTulis = new BufferedWriter(new FileWriter(NAMA_BERKAS));
            berkasTulis.write(baris1, 0, baris1.length());
            berkasTulis.newLine();
            berkasTulis.write(baris2, 0, baris2.length());
        } 
        finally {
            // Tutup berkas
            if (berkasTulis != null)
                berkasTulis.close();
        }
        
        // Uji
        CSV csv = new CSV();
        long jumlah = csv.jumlahkan(NAMA_BERKAS);
        assertEquals(jumlah, 52);
    }

    @Test
    public void isi3Baris3Koma4AngkaBaris3Kosong() throws IOException {
        // Buat berkas CSV untuk diuji
        String baris1 = "5,6,7,8";
        String baris2 = "8,7,6,5";
        BufferedWriter berkasTulis = null;
        try {
            berkasTulis = new BufferedWriter(new FileWriter(NAMA_BERKAS));
            berkasTulis.write(baris1, 0, baris1.length());
            berkasTulis.newLine();
            berkasTulis.write(baris2, 0, baris2.length());
            berkasTulis.newLine();
        } 
        finally {
            // Tutup berkas
            if (berkasTulis != null)
                berkasTulis.close();
        }
        
        // Uji
        CSV csv = new CSV();
        long jumlah = csv.jumlahkan(NAMA_BERKAS);
        assertEquals(jumlah, 52);
    }

    @Test
    public void isi3Baris3Koma4Angka() throws IOException {
        // Buat berkas CSV untuk diuji
        String baris1 = "5,6,7,8";
        String baris2 = "8,7,6,5";
        String baris3 = "1,2,3,4";
        BufferedWriter berkasTulis = null;
        try {
            berkasTulis = new BufferedWriter(new FileWriter(NAMA_BERKAS));
            berkasTulis.write(baris1, 0, baris1.length());
            berkasTulis.newLine();
            berkasTulis.write(baris2, 0, baris2.length());
            berkasTulis.newLine();
            berkasTulis.write(baris3, 0, baris3.length());
        } 
        finally {
            // Tutup berkas
            if (berkasTulis != null)
                berkasTulis.close();
        }
        
        // Uji
        CSV csv = new CSV();
        long jumlah = csv.jumlahkan(NAMA_BERKAS);
        assertEquals(jumlah, 62);
    }

    private static final String NAMA_BERKAS = "BerkasUji.csv";
}
