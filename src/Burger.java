import java.util.List;

public class Burger {
    public enum BurgerSize {ONE, TWO}
    public enum BurgerType {BEEF, CHICKEN, MIX}
    public enum BurgerSauce {KETCHUP, BBQ, CHEESE, NONE}
    public enum BurgerDrink {BONAQUA, FUSE_TEA, COCA_COLA, AYRAN, COMPOTE, SPRITE, FANTA, NONE}
    public enum BurgerDrinkSize {ONE, ONE_HALF, NONE}
    public enum BurgerAdditionalIngredients {JALAPENO, TOMATO, GAUDA_CHEESE, LAZJAN_SAUCE, NONE}
    public enum BurgerWithoutIngredients {TOMATO, LETTUCE, WHITE_SAUCE, RED_SAUCE, NONE}

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

    @Override
    public String toString() {
        return String.format("""
        ============================================================
        ЗАКАЗ БУРГЕРА:
        Размер:                            %s
        Котлета:                           %s
        Соус:                              %s
        Напиток:                           %s (%s)
        Дополнительные ингредиенты:        %s
        Убрать:                            %s
        ============================================================
        """,
                size.name(),
                type.name(),
                sauce.name(),
                drink.name(),
                drinkSize.name(),
                additionalIngredients,
                withoutIngredients
        );
    }

    public BurgerSize getSize() {return size;}
    public BurgerType getType() {return type;}
    public BurgerSauce getSauce() {return sauce;}
    public BurgerDrink getDrink() {return drink;}
    public BurgerDrinkSize getDrinkSize() {return drinkSize;}
    public List<BurgerAdditionalIngredients> getAdditionalIngredients() {return additionalIngredients;}
    public List<BurgerWithoutIngredients> getWithoutIngredients() {return withoutIngredients;}
}
