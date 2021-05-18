
public class MatrixOperations {

    public static void main(String[] args) {

        Matrix m = new Matrix(3,3);
        m.fillRandomly(m);
        System.out.println("==================M1=====================");
        System.out.println(m.toString(m));

        Matrix m2 = new Matrix(3,3);
        m2.fillRandomly(m2);
        System.out.println("==================M2=====================");
        System.out.println(m2.toString(m2));

        Matrix m3 = new Matrix();
        m3 = m.sum(m2);
        System.out.println("==================SUM=====================");
        System.out.println(m3.toString(m3));

        Matrix m4 = new Matrix();
        m4 = m.sub(m2);
        System.out.println("==================SUBSTR=====================");
        System.out.println(m4.toString(m4));

        Matrix m5 = new Matrix();
        m5 = m.mul(m2);
        System.out.println("==================MUL=====================");
        System.out.println(m5.toString(m5));
    }
}
