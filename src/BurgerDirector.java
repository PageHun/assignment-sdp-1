public class BurgerDirector {
    public Burger makeBurger(BurgerRecipeBuilder builder){
        builder.buildSize();
        builder.buildType();
        builder.buildSauce();
        builder.buildDrink();
        builder.buildDrinkSize();
        builder.buildAdditionalIngredients();
        builder.buildWithoutIngredients();

        return builder.getBurger();
    }
}
