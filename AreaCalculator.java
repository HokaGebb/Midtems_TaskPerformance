import java.util.*;

public class AreaCalculator {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Please Input PG for Parallelogram, RB for Rhombus, SQ for Square, and RT for Rectangle: ");
        String choice = input.nextLine();

        if (choice.equalsIgnoreCase("PG")){
            Parallelogram pg = new Parallelogram();
            System.out.print("Please input the Base: ");
            double base = input.nextDouble();
            pg.setBase(base);
            System.out.print("Please input the Height: ");
            double height = input.nextDouble();
            pg.setHeight(height);

            System.out.println("Area: "+ pg.getArea());

        }else if (choice.equalsIgnoreCase("RB")){
            Rhombus rb = new Rhombus();
            System.out.print("Please input the Diagonal 1: ");
            double diagonal1 = input.nextDouble();
            rb.setDiagonal1(diagonal1);
            System.out.print("Please input the Diagonal 2: ");
            double diagonal2 = input.nextDouble();
            rb.setDiagonal2(diagonal2);

            System.out.println("Area: "+ rb.getArea());

        }else if (choice.equalsIgnoreCase("SQ")){
            Square sq = new Square();
            System.out.print("Please input the Base: ");
            double side = input.nextDouble();
            sq.setSide(side);

            System.out.println("Area "+ sq.getSide());
        }else if (choice.equalsIgnoreCase("RT")){
            Rectangle rt = new Rectangle();
            System.out.print("Please input the Length: ");
            double length = input.nextDouble();
            rt.setLength(length);
            System.out.print("Please input the Width: ");
            double width = input.nextDouble();
            rt.setWidth(width);

            System.out.println("Area "+ rt.getLength() * rt.getWidth());

        }else {
            System.out.println("Please Input Properly!!! Try Again!!!");
            System.exit(0);
        }
    }
}