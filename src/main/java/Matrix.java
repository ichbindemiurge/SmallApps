import java.util.Arrays;
import java.util.StringJoiner;
import java.util.concurrent.ThreadLocalRandom;

public class Matrix {
   // Implement a Matrix class with sum, subtract and multiply operations for matrices.
    //https://stackoverflow.com/questions/41657938/matrix-class-in-java

    private int rows;
    private int cols;

    private double [][] matr;


    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        matr = new double[rows][cols];
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public double getElement(int rows, int cols){
        return matr[rows][cols];
    }

    public void setElement(double val, int i, int j) {
        matr[i][j] = val;
    }

    public String toString (Matrix m) {
        StringJoiner str = new StringJoiner(" ");
        for(int i = 0; i < m.getRows(); i++) {
            for (int j = 0; j < m.getCols(); j++) {
                str.add(String.valueOf(m.getElement(i, j)));
            }
        }
        return str.toString();
    }

    public void fillRandomly(Matrix m){
        for(int i = 0; i < m.getRows(); i++) {
            for(int j = 0; j < m.getCols(); j++) {
                matr[i][j] = (ThreadLocalRandom.current().nextInt(0, 16));
            }
        }
        System.out.println(Arrays.deepToString(matr));
    }

    public Matrix sumMatr (Matrix m1, Matrix m2) {
        Matrix res = new Matrix(m1.getRows(), m1.getCols());

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                res.matr[i][j] = m1.matr[i][j] + m2.matr[i][j];
            }
        }
        return res;
    }

}
