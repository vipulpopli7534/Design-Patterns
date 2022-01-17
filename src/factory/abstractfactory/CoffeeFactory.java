package factory.abstractfactory;

public class CoffeeFactory implements HotDrinkFactory{
    @Override
    public HotDrink create() {
        System.out.println("Creating the coffee");
        return new Coffee();
    }
}
