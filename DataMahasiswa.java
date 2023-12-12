public class DataMahasiswa {
    int nilai1 = 85, nilai2 = 95, jumlah;

    public static void main(String[] args) {
        DataMahasiswa nilai = new DataMahasiswa();
        System.out.println("Jumlah nilai mahasiswa adalah " + nilai.jumlah());
    }

    int jumlah(){
        jumlah = (nilai1 + nilai2)/2;
        return jumlah;
    }
}
