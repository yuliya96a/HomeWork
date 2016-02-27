public class LinSolve {

    protected double a;
    protected double b;
    public double x;

    public void setA(double a) {
        this.a = a;
    }
    public void setB(double b) {
        this.b = b;
    }

    public double solve() {
        if (a != 0 && b != 0) {
           x = -this.b / this.a;
            return x;
        } else if (a == 0) {
             x = this.b;
            return x;
        } else if (b == 0) {
            System.out.println("Linear equation has no solutions.");
        } else if (a == 0 && b == 0) {
            System.out.println("Any real number is the solution.");
        }
         return x;

    }
}
