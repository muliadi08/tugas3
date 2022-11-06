public class Siswa {
    int nis;
    String nama;
    String jkl;
    String alamat;
    public Siswa() {

    }
    public Siswa(int nis, String nama){
        this.nis = nis;
        this.nama = nama;
    }
    public Siswa(int nis, String nama, String jkl, String almat) {
        this.nis = nis;
        this.nama = nama;
        this.jkl = jkl;
        this.alamat = alamat;
    }
    public void cetak_siswa(){
        System.out.println("Nis ="+ nis + "\n" + "Nama ="+nama + "\n"+"jkl ="+ jkl + "\n");
    }
}