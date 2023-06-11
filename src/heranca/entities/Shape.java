package heranca.entities;

import heranca.entities.enums.Color;

public abstract class Shape {

  private Color color;

  protected Shape() {
  }

  protected Shape(Color color) {
    this.color = color;
  }

  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public abstract Double area();

  @Override
  public String toString() {
    return String.format("%.2f", area());
  }

}
