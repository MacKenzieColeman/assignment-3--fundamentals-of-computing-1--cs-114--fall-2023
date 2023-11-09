import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the size of the matrix: ");
    int size = scan.nextInt();
    if(size < 1) {
      System.out.println("That is too small to make an array! Input a positive number.");
    }  else {
    Matrix matrix = new Matrix(size);

    }

  }
}
