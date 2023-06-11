package heranca.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import heranca.entities.Circle;
import heranca.entities.Rectangle;
import heranca.entities.Shape;
import heranca.entities.enums.Color;

public class ProgramShape {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    List<Shape> list = new ArrayList<>();

    System.out.print("Enter the number of shapes: ");
    int numbersOfShape = sc.nextInt();

    for (int i = 1; i <= numbersOfShape; i++) {
      System.out.printf("Shape #%d data:%n", i);

      System.out.print("Rectangle or Circle (r/c)? ");
      char validateShape = sc.next().toUpperCase().charAt(0);

      System.out.print("Color (BLACK/BLUE/RED): ");
      sc.nextLine();
      Color color = Color.valueOf(sc.nextLine());

      if (validateShape == 'R') {
        System.out.print("Width: ");
        double width = sc.nextDouble();

        System.out.print("Height: ");
        double height = sc.nextDouble();

        list.add(new Rectangle(color, width, height));
      } else {
        System.out.print("Radius: ");
        double radius = sc.nextDouble();

        list.add(new Circle(color, radius));
      }
    }

    System.out.println();
    System.out.println("SHAPE AREAS:");
    for (Shape shape : list) {
      System.out.println(shape);
    }

    sc.close();
  }
}
