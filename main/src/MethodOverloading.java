public class MethodOverloading {
  public static void main(String[] args) {
    sayHello("Yusril");
    sayHello("Yusril", "Fahmi");
  }

  static void sayHello(String namaDepan){
    System.out.println(namaDepan);
  }

  static void sayHello(String namaDepan, String namaBelakang){
    System.out.println(namaDepan + " " + namaBelakang);
  }
}
