public class Square extends Parallelogram{
    private double side;

    public double getSide() {
        return this.side;
    }
    public void setSide(double side) {
        this.side = side * side;
    }
}