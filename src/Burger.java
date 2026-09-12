public class Burger {
    public enum Size {ONE, TWO};
    public enum Type {BEEF, CHICKEN, MIX};
    public enum Sauce {KETCHUP, BBQ, CHEESE, NONE};
    public enum Drink {BONAQUA, FUSE_TEA, COCA_COLA, AYRAN, PICO, COMPOTE, SPRITE, FANTA, NONE}
    public enum DrinkSize {ONE, ONE_HALF};
    public enum AdditionalIngredients {JALAPENO, TOMATO, GAUDA_CHEESE, LAZJAN_SAUCE, NONE};
    public enum WithoutIngredients {TOMATO, LETTUCE, WHITE_SAUCE, RED_SAUCE, NONE};

    private final BurgerSize size;
    private final BurgerType type;
    private final BurgerSauce sauce;
    private final BurgerDrink drink;
    private final BurgerDrinkSize drinkSize;
    private final List<BurgerAdditionalIngredients> additionalIngredients;
    private final List<BurgerWithoutIngredients> withoutIngredients;

    Burger(BurgerBuilder builder){
        this.size = builder.getSize();
        this.type = builder.getType();
        this.sauce = builder.getSauce();
        this.drink = builder.getDrink();
        this.drinkSize = builder.getDrinkSize();
        this.additionalIngredients = builder.getAdditionalIngredients();
        this.withoutIngredients = builder.getWithoutIngredients();
    }

    public BurgerSize getSize() {return size};
    public BurgerType getType() {return type};
    public BurgerSauce getSauce() {return sauce};
    public BurgerDrink getDrink() {return drink};
    public BurgerDrinkSize getDrinkSize() {return drinkSize};
    public List<BurgerAdditionalIngredients> getAdditionalIngredients() {return additionalIngredients};
    public List<BurgerWithoutIngredients> getWithoutIngredients() {return withoutIngredients};
}
