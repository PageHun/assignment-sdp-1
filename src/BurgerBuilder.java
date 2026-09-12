import java.util.ArrayList;
import java.util.Objects;

public class BurgerBuilder {
    private BurgerSize size = Burger.Size.ONE;
    private BurgerType type = Burger.Type.BEEF;
    private BurgerSauce sauce = Burger.Sauce.KETCHUP;
    private BurgerDrink drink = Burger.Drink.SPRITE;
    private BurgerDrinkSize drinkSize = Burger.DrinkSize.ONE_HALF;
    private final List<BurgerAdditionalIngredients> additionalIngredients = new ArrayList<>();
    private final List<BurgerWithoutIngredients> withoutIngredients = new ArrayList<>();

    public BurgerBuilder setSize(BurgerSize size){
        this.size = size;
        return this;
    }

    public BurgerBuilder setType(BurgerType type){
        this.type = type;
        return this;
    }
    public BurgerBuilder setSauce(BurgerSauce sauce){
        this.sauce = sauce;
        return this;
    }
    public BurgerBuilder setDrink(BurgerDrink drink) {
        this.drink = drink;
        return this;
    }
    public BurgerBuilder setDrinkSize(BurgerDrinkSize drinkSize) {
        this.drinkSize = drinkSize;
        return this;
    }

    public BurgerBuilder addIngredient(BurgerAdditionalIngredients additionalIngredient){
        Objects.requireNonNull(additionalIngredient, "Ингредиент не может быть null");
        if(!additionalIngredients.contains(additionalIngredient)){
            this.additionalIngredients.add(additionalIngredient);
        }
        return this;
    }
    public BurgerBuilder addIngredient(BurgerWithoutIngredients withoutIngredient){
        Objects.requireNonNull(withoutIngredient, "Ингредиент не может быть null");
        if(!withoutIngredients.contains(withoutIngredient)){
            this.withoutIngredients.add(withoutIngredient);
        }
        return this;
    }
}


