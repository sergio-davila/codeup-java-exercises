package shapes;

public class Square extends Rectangle{
    protected int side = length;


    public Square(int side) {
        super(side, side);
        this.side = side;
    }

//    public int getArea() {
//        return side * side; // + 1; used + 1 to check if it was using this method
//    }
//
//    public int getPerimeter() {
//        return 4 * side; // + 1; used + 1 to check if it was using this method
//    }
}
