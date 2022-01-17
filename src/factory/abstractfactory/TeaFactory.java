package factory.abstractfactory;

public class TeaFactory implements HotDrinkFactory{
    @Override
    public HotDrink create() {
        System.out.println("Creating Tea");
        return new Tea();
    }
}
