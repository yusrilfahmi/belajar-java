public class VariabelArgument {
  public static void main(String[] args) {
    cetakNama("Ardi", "Dika", "Yusril");
  }

  static void cetakNama (String... nama){
    for (String name : nama) {
      System.out.println("Hallo " + name);
    }
  }
}
