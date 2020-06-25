package edu.ahs.robotics.java;

import jdk.nashorn.api.scripting.ScriptObjectMirror;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double distanceFromOrigin() {


        double distance = Math.sqrt(x * x + y * y);
        return distance;
    }

    public String getQuadrant() {
        if (x > 0 && y > 0) {
            return "Quadrant 1";
        } else if (x < 0 && y > 0) {
            return "Quadrant 2";
        } else if (x < 0 && y < 0) {
            return "Quadrant 3";
        } else if (x > 0 && y < 0) {
            return "Quadrant 4";
        } else if (x == 0 || y == 0) {
            return "Axis";
        } else {
            return null;
        }
    }
    public double distanceToPoint(Point other) {
        double deltaX = x - other.getX();
        double deltaY = y - other.getY();
        double distance = Math.sqrt(deltaX*deltaX+deltaY*deltaY);
        return distance;
    }

    public Point closestPoint(Point[ ] points){
        Point closestPoint = points[0];

        for (int i = 1; i <points.length; i++) {
           double distance = this.distanceToPoint(points[i]);
           double distanceToClosestPoint = this.distanceToPoint(closestPoint);

            if (distance < distanceToClosestPoint) {
                closestPoint = points[i];
            }

        }
        return closestPoint;
    }


}


