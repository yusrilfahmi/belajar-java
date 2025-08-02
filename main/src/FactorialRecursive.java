public class FactorialRecursive {
  public static void main(String[] args) {
    System.out.println(PerhitunganFactorialRecursive(5));
  }

  static int PerhitunganFactorialRecursive(int value){
    if (value==1) {
      return 1;
    } else{
      return value * PerhitunganFactorialRecursive(value -1);
    }
  }
}
