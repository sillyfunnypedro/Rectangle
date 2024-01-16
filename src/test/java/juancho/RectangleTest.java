package juancho;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * The tests for the Rectangle.
 */
public class RectangleTest {
  private Rectangle r1;
  private Rectangle r2;

  @Before
  public void initialize() {
    this.r1 = new Rectangle(10.0, 30.0);
    this.r2 = new Rectangle(2, 3);
  }

  @Test
  public void testGetWidth() {
    assertEquals(10, this.r1.getWidth(), 0.00001);
    assertEquals(2.0, this.r2.getWidth(), 0.00001);
  }

  @Test
  public void testGetHeight() {
    assertEquals(30.0, this.r1.getWidth(), 0.0001);
    assertEquals(3.0, this.r2.getHeight(), 0.00001);
  }

  @Test
  public void testGetArea() {
    assertEquals(300, this.r1.getArea(), 0.0001);
    assertEquals(6.0, this.r2.getArea(), 0.0001);
  }

  @Test
  public void testGetPerimeter() {
    assertEquals(80.0, this.r1.getPerimeter(), 0.0001);
    assertEquals(8, this.r2.getPerimeter(), 0.0001);
  }
}