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

  public void printMatrix() {
    for (int row = 0; row < size; row++) {
      for (int column = 0; column < size; column++) {
        if (row + column == size - 1) {
          System.out.print("\u001B[1;94m\u001B[4m" + matrix[row][column] + "\u001B[0m\t");
        } else {
          System.out.print(matrix[row][column] + "\t");
        }
      }
      System.out.println();
    }
  }

  public void populateMatrix() {
    int value = 1;
    for (int row = 0; row < size; row++) {
      for (int column = 0; column < size; column++) {
        matrix[row][column] = value++;
      }
    }
  }

  public void flipMatrix() {
    for (int row = 0; row < size / 2; row++) {
      for (int column = 0; column < size; column++) {
        if (row + column != size - 1) {
          swap(row, column, size - 1 - row, size - 1 - column);
        }
      }
    }
  }
}
