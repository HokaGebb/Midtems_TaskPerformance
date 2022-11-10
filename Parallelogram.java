public class Parallelogram {
    private double base;
    private double height;
    private double area;

    public void setBase(double base){
        this.base = base;
    }
    public double getBase(){
        return base;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getHeight(){
        return height;
    }
    public void setArea(double area){
        this.area = area;
    }
    public double getArea(){
        return this.area = getBase() * getHeight();
    }
}