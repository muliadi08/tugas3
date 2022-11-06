public class Nilai extends matapelajaran{
    int nilai_absen;
    int nilai_tugas;
    int nilai_uts;
    int nilai_uas;
    double addnnlai(){
        double total_nilai=(nilai_absen + nilai_tugas+nilai_uts+nilai_uas);
        return total_nilai;
    }
    double getRata_rata(){
        double rata_rata=addnnlai() / 4;
        return rata_rata;
    }
    void cetak_nilai(){
        System.out.println("total niali =" + addnnlai());
        System.out.println("nilai rata-rata =" + getRata_rata());
    }
    void cetak_status(){
        if (getRata_rata() >= nilailulus){
            System.out.println("anda lulus dengan nilai =" +getRata_rata());
        }else{
            System.out.println("nilai anda, "+getRata_rata() + ",anda dinyatakan lulus");

        }
    }
}
