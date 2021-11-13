package facade;

public class MainFacade {
    public static void main(String[] args) {
        Ingredient ingredient = new Ingredient();

        Food pasta = new Pasta();
        String pastaitems = ingredient.getPastaItems();
        pasta.prepareFood(pastaitems);
        System.out.println(pasta.deliverFood());

        Food pizza = new Pizza();
        String pizzaItems = ingredient.getPizzaItems();
        pizza.prepareFood(pizzaItems);
        System.out.println(pizza.deliverFood());

        System.out.println("========WAITER========");
        System.out.println(Waiter.deliverFood(FoodType.PASTA));
        System.out.println(Waiter.deliverFood(FoodType.PIZZA));

    }
}
