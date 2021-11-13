package facade;

public class Pasta implements Food{

    public String preparedItem;

    @Override
    public void prepareFood(String itemsRequired) {
        preparedItem = "Pasta with ingredients: " + itemsRequired;
    }

    @Override
    public String deliverFood() {
        return preparedItem;
    }
}
