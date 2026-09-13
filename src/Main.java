public class Main {
    public static void main(String[] args){
        BurgerBuilder builder = new BurgerBuilder();
        builder.setSize(Burger.BurgerSize.TWO)
                .setType(Burger.BurgerType.BEEF)
                .setSauce(Burger.BurgerSauce.BBQ)
                .setDrink(Burger.BurgerDrink.FUSE_TEA)
                .setDrinkSize(Burger.BurgerDrinkSize.ONE)
                .addIngredient(Burger.BurgerAdditionalIngredients.TOMATO)
                .addIngredient(Burger.BurgerAdditionalIngredients.GAUDA_CHEESE)
                .addWithoutIngredient(Burger.BurgerWithoutIngredients.LETTUCE);

        System.out.println("Final cost: " + builder.calculateEstimatedPrice() + " ₸");

        Burger burger = builder.build();
        System.out.println(burger);
    }
}
