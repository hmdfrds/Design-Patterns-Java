
public class Client {
    public static void main(String[] args) {

        Director director = new Director();

        MealBuilder vegMealBuilder = new VegMealBuilder();
        MealBuilder nonVegMealBuilder = new NonVegMealBuilder();

        // making veg meal
        director.construct(vegMealBuilder);
        Meal meal1 = vegMealBuilder.getMeal();
        meal1.showItems();

        // making non veg meal
        director.construct(nonVegMealBuilder);
        Meal meal2 = nonVegMealBuilder.getMeal();
        meal2.showItems();

    }
}
