import java.util.Scanner;

public class MainApp {
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
        Siswa siswa=new Siswa(13132003, "MUHAMMAD MULIADI   ");
        siswa.cetak_siswa();
        System.out.println("============input data mata pelajaran=============");
        Nilai nilai=new Nilai();
        System.out.print("kode mata pelajaran=");
        nilai.kdmt=obj.nextLine();
        System.out.print("nama pelajaran=");
        nilai.nmmt=obj.nextLine();
        System.out.println("============Data Mata pelajaran=============");
        nilai.cetakmt();
        System.out.println("==========Data Nilai===========");
        System.out.print("jumlah kehadiran=");
        nilai.nilai_absen=obj.nextInt();
        System.out.print("nilai tugas=");
        nilai.nilai_tugas= obj.nextInt();
        System.out.print("nilai UTS=");
        nilai.nilai_uts= obj.nextInt();
        System.out.print("nilai UAS=");
        nilai.nilai_uas= obj.nextInt();
        nilai.addnnlai();
        System.out.println("===================Status Nilai=================");
        nilai.getRata_rata();
        nilai.cetak_nilai();
        System.out.println("================================================");
        nilai.cetak_status();


    }
}