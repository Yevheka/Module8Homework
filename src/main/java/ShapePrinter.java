class ShapePrinterUtils {
    static void printNameOf(int shapeIndex) {
        switch(shapeIndex) {
            case 1:
                print(new Quad());
                break;
            case 2:
                print(new Circle());
                break;
            case 3:
                print(new Triangle());
                break;
            case 4:
                print(new Rectangle());
                break;
            case 5:
                print(new Rhombus());
                break;
            default:
                throw new IllegalStateException("Невірне значення: " + shapeIndex);
        }
    }

    static void print(Shape shape){
        shape.getName();
    }
}
