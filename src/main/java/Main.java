import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the Shape:\n1 - Quad\n2 - Circle\n3 - Triangle\n4 - Rectangle\n5 - Rhombus");
        ShapePrinterUtils.printNameOf(scanner.nextInt());
    }
}
