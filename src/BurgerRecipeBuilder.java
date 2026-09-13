public interface BurgerRecipeBuilder{
    void buildSize();
    void buildType();
    void buildSauce();
    void buildDrink();
    void buildDrinkSize();
    void buildAdditionalIngredients();
    void buildWithoutIngredients();
    double calculateEstimatedPrice();
    Burger getBurger();
}

class GamburgerBuilder implements BurgerRecipeBuilder {
    private final BurgerBuilder builder = new BurgerBuilder();

    @Override
    public void buildSize() {builder.setSize(Burger.BurgerSize.TWO);}
    @Override
    public void buildType() {builder.setType(Burger.BurgerType.MIX);}
    @Override
    public void buildSauce() {builder.setSauce(Burger.BurgerSauce.CHEESE);}
    @Override
    public void buildDrink() {builder.setDrink(Burger.BurgerDrink.COMPOTE);}
    @Override
    public void buildDrinkSize() {builder.setDrinkSize(Burger.BurgerDrinkSize.ONE_HALF);}
    @Override
    public void buildAdditionalIngredients() {builder.addIngredient(Burger.BurgerAdditionalIngredients.LAZJAN_SAUCE);}
    @Override
    public void buildWithoutIngredients() {builder.addWithoutIngredient(Burger.BurgerWithoutIngredients.NONE);}
    @Override
    public double calculateEstimatedPrice() {
        return builder.calculateEstimatedPrice();
    }

    public Burger getBurger(){
        return builder.build();
    }
}

class CheeseburgerBuilder implements BurgerRecipeBuilder {
    private final BurgerBuilder builder = new BurgerBuilder();

    @Override
    public void buildSize() {builder.setSize(Burger.BurgerSize.ONE);}
    @Override
    public void buildType() {builder.setType(Burger.BurgerType.CHICKEN);}
    @Override
    public void buildSauce() {builder.setSauce(Burger.BurgerSauce.NONE);}
    @Override
    public void buildDrink() {builder.setDrink(Burger.BurgerDrink.NONE);}
    @Override
    public void buildDrinkSize() {builder.setDrinkSize(Burger.BurgerDrinkSize.NONE);}
    @Override
    public void buildAdditionalIngredients() {builder.addIngredient(Burger.BurgerAdditionalIngredients.NONE);}
    @Override
    public void buildWithoutIngredients() {builder.addWithoutIngredient(Burger.BurgerWithoutIngredients.NONE);}
    @Override
    public double calculateEstimatedPrice() {
        return builder.calculateEstimatedPrice(); // Вызов расчета из основного флюент-строителя
    }


    public Burger getBurger(){
        return builder.build();
    }
}
