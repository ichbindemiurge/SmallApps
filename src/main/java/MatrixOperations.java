import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class MatrixOperations {

    public static void main(String[] args) {

        Matrix m = new Matrix(3,3);
        m.fillRandomly(m);
        System.out.println(m.toString(m));

        Matrix mSum = new Matrix(3,3);
        mSum.fillRandomly(mSum);
        System.out.println(mSum.toString(mSum));

        Matrix resM = new Matrix(3,3);
        resM = resM.sumMatr(m,mSum);

        System.out.println(resM.toString(resM));
    }
}
