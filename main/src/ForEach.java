public class ForEach {
 public static void main(String[] args) {
  String[] nama = {
    "Yusril", "Fahmi", "Putra", "Sulung"
  };
  System.out.println(nama.length);
  for (int i = 0; i < nama.length; i++) {
    System.out.println(nama[i]);
  }

  //foreach
  for (String value : nama) {
    System.out.println(value);
    System.out.println(value.length()); //testing
  }
 }
}
