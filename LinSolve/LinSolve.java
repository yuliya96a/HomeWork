public class LinSolve {
    protected double a;
    protected double b;

    public void setA(double a) {
        this.a = a;
    }
        public void setB(double b) {
        this.b = b;
    }
        public double solve() {
        double x = -this.b / this.a;
        return x;
    }
}
