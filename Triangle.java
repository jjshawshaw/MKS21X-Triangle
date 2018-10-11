public class Triangle{

  Point v0;
  Point v1;
  Point v2;

  public Triangle(Point p0, Point p1, Point p2){
    v0 = p0;
    v1 = p1;
    v2 = p2;
  }

  public Triangle(double p0x, double p0y, double p1x, double p1y, double p2x, double p2y) {
    v0 = new Point(p0x, p0y);
    v1 = new Point(p1x, p1y);
    v2 = new Point(p2x, p2y);
  }

  public String toString(){
    return "Triangle: A" + v0 + " B" + v1 + " C" + v2;
  }

  public double getPerimeter(){
    return v0.distanceTo(v1) + v1.distanceTo(v2) + v0.distanceTo(v2);
  }

  public Point getVertex(int dex){
    Point[] vertices = new Point[]{v0, v1, v2};
    return vertices[dex];
  }

  public void setVertex(int index, Point newP) {
    if (index == 0) v0 = newP;
    if (index == 1) v1 = newP;
    if (index == 2) v2 = newP;
  }

}
