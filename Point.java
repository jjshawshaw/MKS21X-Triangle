//immutable point class:
public class Point{
  private double x,y;

  public Point(double X, double Y){
    x=X;
    y=Y;
  }

  public Point(Point p){
    x= p.x;
    y= p.y;
  }

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }

  public double distanceTo(Point p){
    double deltaX = this.x - p.x;
    double deltaY = this.y - p.y;
    return Math.sqrt((deltaX * deltaX) + (deltaY * deltaY));
  }

  public static double distance(Point p1, Point p2){
    double deltaX = p1.x - p2.x;
    double deltaY = p1.y - p2.y;
    return Math.sqrt((deltaX * deltaX) + (deltaY * deltaY));
  }

  public String toString(){
    return "(" + x + ", " + y + ")";
  }
}
