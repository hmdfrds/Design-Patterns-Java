public class Director {
    MealBuilder myMealBuilder;

    public void construct(MealBuilder mealBuilder) {
        this.myMealBuilder = mealBuilder;
        myMealBuilder.buildBurger();
        myMealBuilder.buildDrink();
    }
}
