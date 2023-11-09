public class Matrix {
  private int[][] matrix;
  private int size;

  public Matrix(int size) {
    this.size = size;
    this.matrix = new int[size][size];
      System.out.println("Matrix dimensions: " + size + "x" + size);
  }

}
