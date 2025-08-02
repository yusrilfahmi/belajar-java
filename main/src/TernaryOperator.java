public class TernaryOperator {
  public static void main(String[] args) {
    
    var nilai = 75;
    String ucapan = null;

    if (nilai>=75) {
      ucapan = "Selamat Kamu Lulus";
    } else{
      ucapan = "Kamu Tidak Lulus";
    }

    System.out.println(ucapan);

    ucapan = nilai >= 60 ? "Selamat Kamu Lulus tapi Remidi" : "Kamu Tidak Lulus";

    System.out.println(ucapan);
  }
}
