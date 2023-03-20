interface MealBuilder {
    void buildBurger();

    void buildDrink();

    Meal getMeal();
}

class VegMealBuilder implements MealBuilder {
    Meal meal = new Meal();

    public void buildBurger() {
        meal.addItem(new VegBurger());
    }

    public void buildDrink() {
        meal.addItem(new Pepsi());
    }

    public Meal getMeal() {
        return meal;
    }
}

class NonVegMealBuilder implements MealBuilder {
    Meal meal = new Meal();

    public void buildBurger() {
        meal.addItem(new ChickenBurger());
    }

    public void buildDrink() {
        meal.addItem(new Coke());
    }

    public Meal getMeal() {
        return meal;
    }
}