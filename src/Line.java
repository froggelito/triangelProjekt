import java.lang.Math
public class Line {
    public Point point1;
    public Point point2;

    public Line(Point point1, Point point2){
        this.point1 = point1;
        this.point2 = point2;
    }

    public double distanceCalc(){
       double distance = Math.sqrt(Math.pow(point1.xCoordinate - point2.xCoordinate,2) + Math.pow(point1.yCoordinate - point2.yCoordinate,2));
    }
    public void extendCalc(double scalar){
        origo

        point2.yCoordinate *= scalar;
        point2.xCoordinate *= scalar;
    }
    public boolean parallelCheck(Line line1, Line line2){
        degree point1Angel = p
    }
}
