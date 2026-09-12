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
        Objects.requireNonNull(additionalIngredient, "Ingredient can't be null");
        if(!additionalIngredients.contains(additionalIngredient)){
            this.additionalIngredients.add(additionalIngredient);
        }
        return this;
    }
    public BurgerBuilder addIngredient(BurgerWithoutIngredients withoutIngredient){
        Objects.requireNonNull(withoutIngredient, "Ingredient can't be null");
        if(!withoutIngredients.contains(withoutIngredient)){
            this.withoutIngredients.add(withoutIngredient);
        }
        return this;
    }

    public double calculateEstimatedPrice(){
        if(size == null) return 0.0;

        double basePrice;

        if (size == Burger.BurgerSize.ONE && type == Burger.BurgerType.BEEF) {
            basePrice = 1900.0;
        } else if (size == Burger.BurgerSize.TWO && type == Burger.BurgerType.CHICKEN) {
            basePrice = 1900.0;
        } else if (size == Burger.BurgerSize.TWO && type == Burger.BurgerType.BEEF) {
            basePrice = 2250.0;
        } else if (size == Burger.BurgerSize.TWO && type == Burger.BurgerType.MIX) {
            basePrice = 2500.0;
        } else {
            basePrice = 1500.0;
        }

        basePrice += additionalIngredients.size() * 200;
        return basePrice;

        public Burger build(){
            validateConfiguration();
            return new Burger(this);
        }

        private void validateConfiguration(){
            if (size == null) {
                throw new IllegalStateException("Needs to choose size of burger!");
            }
        }

        public BurgerSize getSize() {return size};
        public BurgerType getType() {return type};
        public BurgerSauce getSauce() {return sauce};
        public BurgerDrink getDrink() {return drink};
        public BurgerDrinkSize getDrinkSize() {return drinkSize};
        public List<BurgerAdditionalIngredients> getAdditionalIngredients() {return additionalIngredients};
        public List<BurgerWithoutIngredients> getWithoutIngredients() {return withoutIngredients};
    }
}


