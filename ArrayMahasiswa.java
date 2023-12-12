import java.util.Scanner;

public class ArrayMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Jumlah mahasiswa : ");
        int a = input.nextInt();

        String Mahasiswa[][] = new String[a][3];

        for(int i=0; i<a ; i++){
            System.out.println();
            System.out.println("Data Mahasiswa ke-" + (i+1));

            for(int j=0; j<3 ; j++){
                if(j==0)
                    System.out.print("NPM = ");
                else if(j==1)
                    System.out.print("Nama mahasiswa = ");
                else
                    System.out.print("Jurusan = ");

                System.out.print("");
                Mahasiswa[i][j] = input.next();
            }
        }

        System.out.println("");
        System.out.println("Data mahasiswa yang telah diinput ");
        System.out.println("==================================");
        System.out.println("NPM \t\t\t Nama \t\t Jurusan \t\t");

        for(int i=0; i<a; i++){
            for(int j=0; j<3; j++){
                System.out.print(Mahasiswa[i][j] + "\t\t\t");
            }
            System.out.println("");
        }
    }
}
