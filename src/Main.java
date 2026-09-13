public class Main {
    public static void main(String[] args){
        BurgerDirector director = new BurgerDirector();
        BurgerBuilder builder = new BurgerBuilder();
        BurgerRecipeBuilder gamburgerBuild = new GamburgerBuilder();
        BurgerRecipeBuilder cheeseburgerBuild = new CheeseburgerBuilder();


        builder.setSize(Burger.BurgerSize.TWO)
                .setType(Burger.BurgerType.BEEF)
                .setSauce(Burger.BurgerSauce.BBQ)
                .setDrink(Burger.BurgerDrink.FUSE_TEA)
                .setDrinkSize(Burger.BurgerDrinkSize.ONE)
                .addIngredient(Burger.BurgerAdditionalIngredients.TOMATO)
                .addIngredient(Burger.BurgerAdditionalIngredients.GAUDA_CHEESE)
                .addWithoutIngredient(Burger.BurgerWithoutIngredients.LETTUCE);

        Burger gamburger = director.makeBurger(gamburgerBuild);
        Burger cheeseburger = director.makeBurger(cheeseburgerBuild);

        Burger burger = builder.build();
        System.out.print(burger);
        System.out.println("Final cost: " + builder.calculateEstimatedPrice() + " ₸\n");
        System.out.print(gamburger);
        System.out.println("Final cost: " + gamburgerBuild.calculateEstimatedPrice() + " ₸\n");
        System.out.print(cheeseburger);
        System.out.println("Final cost: " + cheeseburgerBuild.calculateEstimatedPrice() + " ₸");
    }
}
