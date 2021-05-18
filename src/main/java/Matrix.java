import java.util.StringJoiner;
import java.util.concurrent.ThreadLocalRandom;

public class Matrix {

    private int rows;
    private int cols;

    private double [][] matr;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        matr = new double[rows][cols];
    }

    public Matrix(){

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
                m.matr[i][j] = (ThreadLocalRandom.current().nextInt(0, 16));
            }
        }
    }

    public Matrix sum (Matrix m1) {
        Matrix res = new Matrix(m1.getRows(), m1.getCols());

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                res.matr[i][j] = this.matr[i][j] + m1.matr[i][j];
            }
        }
        return res;
    }

    public Matrix sub (Matrix m1) {
        Matrix res = new Matrix(m1.getRows(), m1.getCols());

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                res.matr[i][j] = this.matr[i][j] - m1.matr[i][j];
            }
        }
        return res;
    }


    public Matrix mul (Matrix m1) {
        Matrix res = new Matrix(m1.getRows(), m1.getCols());

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                for(int k = 0; k < cols; k++){
                    res.matr[i][j] += this.matr[i][k] * m1.matr[k][j];
                }
            }
        }
        return res;
    }

}
