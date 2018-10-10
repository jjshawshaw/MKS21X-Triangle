//driver class
public class demo{

  /* more methods can go here*/
  public static void main(String[]args){
    Point P1 = new Point(1,1);
    Point P2 = new Point(2,2);
    //for the 3 distance functions below Determine:
    //a)static/non-static
    //b)what class the method is located in
    //System.out.println(  distance(P1,P2)); //static in the demo class

    System.out.println(  Point.distance(P1,P2)); //static in the Point class

    System.out.println(  P1.distanceTo(P2)); //non-static in the Point class.
    //It is IMPLIED strongly that this is non static because you need info from P1 to calculate the distance
    //You cannot tell by the calling style alone, this is why we prefer to use CLASS.Method() for static calls.

  }
 }
