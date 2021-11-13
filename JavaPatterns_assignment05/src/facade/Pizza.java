package facade;

public class Pizza implements Food{

    public String prepareFoodItem;

    @Override
    public void prepareFood(String itemsRequired) {
        prepareFoodItem = "Thin crust pizza with ingredients: " + itemsRequired;
    }

    @Override
    public String deliverFood() {
        return prepareFoodItem;
    }
}
