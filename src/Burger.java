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

}
