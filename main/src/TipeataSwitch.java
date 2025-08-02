public class TipeataSwitch {
  public static void main(String[] args) {
    var nilai = 80;
    String angkaNilai = null;
    if (nilai >= 80) {
      angkaNilai = "A";
    } else if (nilai >= 60) {
      angkaNilai = "B";
    } 
    else {
      angkaNilai = "D";
    }
    switch (angkaNilai) {
      case "A", "B" -> System.out.println("Selamat Kamu Lulus");
      default -> System.out.println("Kamu Mengulang Semester Depan");
    }
    System.out.println(angkaNilai);
  }
}