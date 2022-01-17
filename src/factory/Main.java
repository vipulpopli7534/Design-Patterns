package factory;

import factory.method.Point;

public class Main {
    public static void main(String[] args) {
        Point point = Point.newPolarPoint(30, 28.6);
        System.out.println(point);
    }
}
