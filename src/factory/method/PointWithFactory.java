package factory.method;

public class PointWithFactory {
    private final double x;
    private final double y;

    private PointWithFactory(double x, double y) {
        this.x = x;
        this.y = y;
    }


    // Only adv. is to club the static methods in a common class to achieve the S of SOLID
    //If we want to make the constructor to be private factory class must lie in the inside the point class
   public static class Factory{

       public static PointWithFactory newCartesianPoint(double x, double y){
           return new PointWithFactory(x, y);
       }

       public static PointWithFactory newPolarPoint(double rho, double theta){
           return new PointWithFactory(rho * Math.sin(theta),
                   rho * Math.cos(theta));
       }

   }

    @Override
    public String toString() {
        return "PointWithFactory{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
