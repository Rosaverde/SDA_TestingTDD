public class Room
{
  private double height;
  private double width;
  private double length;

  public Room(double height, double width, double length) {
    this.height = height;
    this.width = width;
    this.length = length;
  }

  public double calculateArea() {
    return width * length;
  }

  public double calculateVolume() {
    return width * length * height;
  }
}
