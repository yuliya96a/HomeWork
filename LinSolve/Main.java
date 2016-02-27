public class Main {
    public static void main(String[] args) {
        LinSolve l = new LinSolve();
        l.setA(0);
        l.setB(0);
        double x = l.solve();

        if (Double.isNaN(x))
            System.out.println("The equation has many solutions");
        else
            System.out.println("x=" + x);
    }
}
