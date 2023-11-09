public class Matrix {
  private int[][] matrix;
  private int size;

  public Matrix(int size) {
    this.size = size;
    this.matrix = new int[size][size];
      System.out.println("Matrix dimensions: " + size + "x" + size);
  }

  private void swap(int x1, int y1, int x2, int y2) {
    int temp = matrix[x1][y1];
    matrix[x1][y1] = matrix[x2][y2];
    matrix[x2][y2] = temp;
  }

}
