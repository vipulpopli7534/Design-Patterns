package factory.abstractfactory;

import java.util.HashMap;
import java.util.Map;

public class Machine {
    private final Map<String, HotDrinkFactory> factoryMap;
    public Machine() {
        factoryMap = new HashMap<>();
        factoryMap.put("Tea", new TeaFactory());
        factoryMap.put("Coffee", new CoffeeFactory());
    }

    public HotDrink makeDrink(String drinkType){
        if (factoryMap.containsKey(drinkType)){
            return factoryMap.get(drinkType).create();
        }
        throw new RuntimeException(drinkType + " not available");
    }
}
