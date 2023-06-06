package classes_atributos_metodos_static.application;

import java.util.Locale;
import java.util.Scanner;

import classes_atributos_metodos_static.entities.Rectangle;

public class ProgramRectangle {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);
    System.out.println("Entre com a largura e altura do retângulo:");
    double width = sc.nextDouble();
    double height = sc.nextDouble();

    Rectangle rectangle = new Rectangle(width, height);

    System.out.printf("AREA = %.2f%n", rectangle.area());
    System.out.printf("PERIMETRO = %.2f%n", rectangle.perimeter());
    System.out.printf("DIAGONAL = %.2f", rectangle.diagonal());

    sc.close();

  }
}
