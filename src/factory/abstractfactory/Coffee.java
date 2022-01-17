package factory.abstractfactory;

public class Coffee implements HotDrink{
    @Override
    public void consume() {
        System.out.println("Consumed Coffee");
    }
}
