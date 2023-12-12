public class DataMahasiswa {
    int nilai1 = 80, nilai2 = 90, jumlah;

    public static void main(String[] args) {
        DataMahasiswa nilai = new DataMahasiswa();
        System.out.println("Jumlah nilai mahasiswa = " + nilai.jumlah());
    }

    int jumlah(){
        jumlah = (nilai1 + nilai2)/2;
        return jumlah;
    }
}
