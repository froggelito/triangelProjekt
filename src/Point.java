public class Point {
    public int xCoordinate;
    public int yCoordinate;

    public Point(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public void moveHorizontal(int xCoordinateMove){
        xCoordinate += xCoordinateMove;
    }
    public void moveVertical(int yCoordinateMove){
        yCoordinate += yCoordinateMove;
    }
}

}

