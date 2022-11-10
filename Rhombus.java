public class Rhombus extends Parallelogram{
    private double diagonal1;
    private double diagonal2;

    public double getDiagonal1() {
        return diagonal1;
    }
    public void setDiagonal1(double diagonal1) {
        this.diagonal1 = diagonal1;
    }
    public double getDiagonal2() {
        return diagonal2;
    }
    public void setDiagonal2(double diagonal2) {
        this.diagonal2 = diagonal2;
    }
    @Override
    public double getArea() {
        return super.getArea() + getDiagonal1() * getDiagonal2() / 2;
    }
}