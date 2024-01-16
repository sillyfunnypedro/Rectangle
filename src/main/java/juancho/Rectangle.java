package juancho;

/**
 * A class to store a rectangle, it also calculates area and perimeter.
 */
public class Rectangle {
  private final double width;
  private final double height;

  Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  /**
   * getWidth().
   *
   * @return double
   */
  public double getWidth() {
    return this.width;
  }

  /**
   * getHeight().
   *
   * @return double
   */
  public double getHeight() {
    return this.height;
  }

  /**
   * getArea()
   * this computes the area of the rectangle.
   *
   * @return double
   */
  public double getArea() {
    return this.width * this.height;
  }

  /**
   * getPerimeter()
   * This computes the perimeter of the rectangle.
   *
   * @return double
   */
  public double getPerimeter() {
    return 2.0 * this.width + 2.0 * this.height;
  }
}
