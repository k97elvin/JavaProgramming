package day45_Abstraction_Interface.shape;

public class ReferenceTypeCasting {
    public static void main(String[] args) {
        Shape shape = (Shape) new Square();
        Square square = (Square) shape;



    }
}
