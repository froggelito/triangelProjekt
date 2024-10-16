
public class Triangle {
    private Point point1;
    private Point point2;
    private Point point3;

    private Line side1;
    private Line side2;
    private Line side3;

    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;

        side1 = new Line(point1, point2);
        side2 = new Line(point1, point3);
        side3 = new Line(point2, point3);
    }



    public double circumference(){
        return side1.distanceCalc() + side2.distanceCalc() + side3.distanceCalc();
    }
}
