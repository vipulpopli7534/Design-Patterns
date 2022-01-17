package factory.abstractfactory;

public class Tea implements HotDrink{
    @Override
    public void consume() {
        System.out.println("Consumed Tea");
    }
}
