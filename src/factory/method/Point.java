package factory.method;

public class Point {
    private final double x;
    private final double y;

    private Point(double x, double y) {
        this.x = x;
        this.y = y;
    }


    //Factory methods

    public static Point newCartesianPoint(double x, double y){
        return new Point(x, y);
    }

    public static Point newPolarPoint(double rho, double theta){
        return new Point(rho * Math.sin(theta),
                rho * Math.cos(theta));
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
