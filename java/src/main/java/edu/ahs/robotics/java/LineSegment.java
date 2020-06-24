package edu.ahs.robotics.java;

public class LineSegment {
private Point point1;
private Point point2;

    public LineSegment(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }
    public Point[] subDivide(int subSegments) {
        double deltaX = point2.getX() - point1.getX();
        double deltaY = point2.getY() - point1.getY();

        double xStep = deltaX / subSegments;
        double yStep = deltaY / subSegments;
        Point[] subDividedPoints = new Point[subSegments - 1];
        for (int i = 1; i < subSegments; i++){
           double subdivedPointx = point1.getX() + xStep * i;
           double subDividedPointY = point1.getY() + yStep * i;

           Point subdivedPoint = new Point(subdivedPointx,subDividedPointY);
           subDividedPoints[i-1]=subdivedPoint;
        }
            return subDividedPoints;
    }

}
