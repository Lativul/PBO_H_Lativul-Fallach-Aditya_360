import java.time.LocalDate;
import java.util.Scanner;
import java.time.LocalDateTime;

public class CodeLab1 {
    public static void main(String[] args) {
        String Nama_Saya;
        String jenisKelamin;
        int TahunLahir, TahunSekarang, umur;
        TahunSekarang= LocalDate.now().getYear();

        Scanner scan= new Scanner(System.in);
        System.out.print("Masukkan Nama: ");
        Nama_Saya=scan.nextLine();
        System.out.print("Masukkan gender (P/L) : ");
        jenisKelamin= scan.nextLine();

        System.out.print("Masukkan Tahun Lahir :  ");
        TahunLahir= scan.nextInt();
        umur = TahunSekarang - TahunLahir;

     switch (jenisKelamin){
         case "L":
         jenisKelamin= "Laki-Laki" ;
             break;
         case "P":
         jenisKelamin= "Perempuan";
             break;
         default:
             jenisKelamin= "gender Tidak di ketahui";
     }
        System.out.println("==========Data Diri==========");
        System.out.println("=============================");
        System.out.printf("Nama          : %s  \n" , Nama_Saya);
        System.out.printf("Jenis Kelamin : %s \n", jenisKelamin);
        System.out.printf("Umur          :%d tahun \n", umur);
        System.out.println("=============================");
    }
}
