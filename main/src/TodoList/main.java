package TodoList;
import java.util.Scanner;
public class main {

  public static Scanner input = new Scanner(System.in);
  public static String[] TodoList = new String [10];
  public static void main(String[] args) {
    
    showTodoList();
    showMenu();
  }

  public static void showTodoList(){
    System.out.println("===Todo List ===");
    for (int i = 0; i < TodoList.length; i++) {
      if (TodoList[i] != null) {
        System.out.println(i+1 + ". " + TodoList[i]);
      }
    }
  }

  public static void showMenu(){
    System.out.println();
    System.out.println("Pilih Menu");
    System.out.println("1. Tambah");
    System.out.println("2. Hapus");
    System.out.println("0. keluar");
    int pilihan = input.nextInt();
    if (pilihan==1) {
      addTodoList();
    } else if (pilihan==2) {
      deleteTodoList();
    } else if (pilihan==0) {
      System.exit(0);
    } else{
      System.out.println("Salah Memasukkan Input");
    }
  }

  public static void addTodoList(){
    var full = false;
    var ArrayTemp = TodoList;
    for (int i = 0; i < TodoList.length; i++) {
        if (TodoList[i]!=null) {
          full = true;
        }
    }

    if (full==true) {
      TodoList = new String[TodoList.length * 2];
      for (int i = 0; i < ArrayTemp.length; i++) {
        TodoList[i]=ArrayTemp[i];
      }
    }
    
    System.out.println("Masukkan TodoList");
    System.out.println("x untuk membatalkan");
    String temp = input.next();
    if (temp=="x") {
      
    } else{
      for (int i = 0; i < TodoList.length; i++) {
      if (TodoList[i]==null) {
        TodoList[i]=temp;
        break;
      }
    }
    }
    showTodoList();
    showMenu();
  }

  public static void deleteTodoList(){
    showTodoList();
    System.out.println("===Pilih Nomor yang Dihapus===");
    System.out.println("0 untuk batal");
    int temp = input.nextInt();

      if (temp == 0) {
        
      } else{
        if (TodoList[temp-1] == null) {
        System.out.println("Operasi Gagal");
      } else if (TodoList[temp-1] != null){
        TodoList[temp-1] = null;
        System.out.println("List telah Dihapus");
        for (int i = 0; i < TodoList.length; i++) {
          if (i+1 == TodoList.length) {
            break;
          } else if (TodoList[i]==null) {
            TodoList[i]=TodoList[i+1];
            TodoList[i+1] = null;
          }
        }
      }
      }
      showTodoList();
      showMenu();
  }
}