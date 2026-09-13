import java.util.ArrayList;
import java.util.List;


public class BurgerBuilder {
    private Burger.BurgerSize size = Burger.BurgerSize.ONE;
    private Burger.BurgerType type = Burger.BurgerType.BEEF;
    private Burger.BurgerSauce sauce = Burger.BurgerSauce.KETCHUP;
    private Burger.BurgerDrink drink = Burger.BurgerDrink.SPRITE;
    private Burger.BurgerDrinkSize drinkSize = Burger.BurgerDrinkSize.ONE_HALF;
    private final List<Burger.BurgerAdditionalIngredients> additionalIngredients = new ArrayList<>();
    private final List<Burger.BurgerWithoutIngredients> withoutIngredients = new ArrayList<>();

    public BurgerBuilder setSize(Burger.BurgerSize size){
        this.size = size;
        return this;
    }

    public BurgerBuilder setType(Burger.BurgerType type){
        this.type = type;
        return this;
    }
    public BurgerBuilder setSauce(Burger.BurgerSauce sauce){
        this.sauce = sauce;
        return this;
    }
    public BurgerBuilder setDrink(Burger.BurgerDrink drink) {
        this.drink = drink;
        return this;
    }
    public BurgerBuilder setDrinkSize(Burger.BurgerDrinkSize drinkSize) {
        this.drinkSize = drinkSize;
        return this;
    }

    public BurgerBuilder addIngredient(Burger.BurgerAdditionalIngredients additionalIngredient){
//        Objects.requireNonNull(additionalIngredient, "Ingredient can't be null");
//        if(!additionalIngredients.contains(additionalIngredient)){
            this.additionalIngredients.add(additionalIngredient);
//        }
            return this;
    }
    public BurgerBuilder addWithoutIngredient(Burger.BurgerWithoutIngredients withoutIngredient){
//        Objects.requireNonNull(withoutIngredient, "Ingredient can't be null");
//        if(!withoutIngredients.contains(withoutIngredient)){
            this.withoutIngredients.add(withoutIngredient);
//        }
            return this;
    }

    public double calculateEstimatedPrice() {
        if (size == null) return 0.0;

        double basePrice = 0.0;

        if (size == Burger.BurgerSize.ONE && type == Burger.BurgerType.BEEF) {
            basePrice = 1650.0;
        } else if (size == Burger.BurgerSize.TWO && type == Burger.BurgerType.BEEF) {
            basePrice = 2250.0;
        } else if (size == Burger.BurgerSize.ONE && type == Burger.BurgerType.CHICKEN) {
            basePrice = 1500.0;
        } else if (size == Burger.BurgerSize.TWO && type == Burger.BurgerType.CHICKEN) {
            basePrice = 1900.0;
        } else if (size == Burger.BurgerSize.TWO && type == Burger.BurgerType.MIX) {
            basePrice = 2100.0;
        }

        if (drink == Burger.BurgerDrink.AYRAN && drinkSize == Burger.BurgerDrinkSize.ONE) {
            basePrice += 900.0;
        } else if (drink == Burger.BurgerDrink.AYRAN && drinkSize == Burger.BurgerDrinkSize.ONE_HALF) {
            basePrice += 450.0;
        } else if (drink == Burger.BurgerDrink.BONAQUA && drinkSize == Burger.BurgerDrinkSize.ONE) {
            basePrice += 800.0;
        } else if (drink == Burger.BurgerDrink.BONAQUA && drinkSize == Burger.BurgerDrinkSize.ONE_HALF) {
            basePrice += 400.0;
        } else if (drink == Burger.BurgerDrink.SPRITE && drinkSize == Burger.BurgerDrinkSize.ONE) {
            basePrice += 900.0;
        } else if (drink == Burger.BurgerDrink.SPRITE && drinkSize == Burger.BurgerDrinkSize.ONE_HALF) {
            basePrice += 600.0;
        } else if (drink == Burger.BurgerDrink.FANTA && drinkSize == Burger.BurgerDrinkSize.ONE) {
            basePrice += 900.0;
        } else if (drink == Burger.BurgerDrink.FANTA && drinkSize == Burger.BurgerDrinkSize.ONE_HALF) {
            basePrice += 600.0;
        } else if (drink == Burger.BurgerDrink.COCA_COLA && drinkSize == Burger.BurgerDrinkSize.ONE) {
            basePrice += 900.0;
        } else if (drink == Burger.BurgerDrink.COCA_COLA && drinkSize == Burger.BurgerDrinkSize.ONE_HALF) {
            basePrice += 600.0;
        } else if (drink == Burger.BurgerDrink.COMPOTE && drinkSize == Burger.BurgerDrinkSize.ONE) {
            basePrice += 900.0;
        } else if (drink == Burger.BurgerDrink.COMPOTE && drinkSize == Burger.BurgerDrinkSize.ONE_HALF) {
            basePrice += 600.0;
        } else if (drink == Burger.BurgerDrink.FUSE_TEA && drinkSize == Burger.BurgerDrinkSize.ONE) {
            basePrice += 900.0;
        } else if (drink == Burger.BurgerDrink.FUSE_TEA && drinkSize == Burger.BurgerDrinkSize.ONE_HALF) {
            basePrice += 600.0;
        }

        if (sauce != Burger.BurgerSauce.NONE){
            basePrice += 200;
        }

        if(additionalIngredients.size() != 1){
            basePrice += additionalIngredients.size() * 200;
        }

        return basePrice;
        }

        public Burger build(){
            validateConfiguration();
            return new Burger(this);
        }

        private void validateConfiguration(){
            if (size == null) {
                throw new IllegalStateException("Needs to choose size of burger!");
            }
        }

        public Burger.BurgerSize getSize() {return size;}
        public Burger.BurgerType getType() {return type;}
        public Burger.BurgerSauce getSauce() {return sauce;}
        public Burger.BurgerDrink getDrink() {return drink;}
        public Burger.BurgerDrinkSize getDrinkSize() {return drinkSize;}
        public List<Burger.BurgerAdditionalIngredients> getAdditionalIngredients() {return additionalIngredients;}
        public List<Burger.BurgerWithoutIngredients> getWithoutIngredients() {return withoutIngredients;}
}


