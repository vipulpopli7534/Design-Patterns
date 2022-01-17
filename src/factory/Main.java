package factory;

import factory.abstractfactory.HotDrink;
import factory.abstractfactory.Machine;
import factory.method.Point;
import factory.method.PointWithFactory;

public class Main {
    public static void main(String[] args) {
        //Factory method
        Point point = Point.newPolarPoint(30, 28.6);
        System.out.println(point);

        //Factory
        PointWithFactory pointWithFactory = PointWithFactory.Factory.newCartesianPoint(10, 20);
        System.out.println(pointWithFactory);

        //Abstract Factory
        Machine machine = new Machine();
        HotDrink tea = machine.makeDrink("Tea");
        tea.consume();
        HotDrink coffee = machine.makeDrink("Coffee");
        coffee.consume();
        HotDrink soda = machine.makeDrink("Soda");
        soda.consume();
    }
}
