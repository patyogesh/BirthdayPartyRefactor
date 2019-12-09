package scrap.heap.refactor;

import scrap.heap.refactor.balloon.Balloon;
import scrap.heap.refactor.balloon.BalloonBuilder;
import scrap.heap.refactor.cake.Cake;
import scrap.heap.refactor.cake.CakeBuilder;
import scrap.heap.refactor.enums.*;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {

        Balloon balloon = new BalloonBuilder()
                .withColor(Color.RED)
                .withMaterial(Material.MYLAR)
                .withCount(4)
                .build();
        Cake cake = new CakeBuilder()
                .withFlavor(Flavor.CHOCOLATE)
                .withFrostFlavor(FrostFlavor.CHOCOLATE)
                .withShape(Shape.CIRCLE)
                .withSize(Size.LARGE)
                .withColor(Color.WHITE)
                .build();
         //Place birthday party order
        Order firstOrder = new Order();
        firstOrder.addBalloon(balloon);
        firstOrder.addCake(cake);

        balloon = new BalloonBuilder()
                .withColor(Color.BLUE)
                .withMaterial(Material.LATEX)
                .withCount(7)
                .build();
        cake = new CakeBuilder()
                .withFlavor(Flavor.VANILLA)
                .withFrostFlavor(FrostFlavor.CHOCOLATE)
                .withShape(Shape.SQUARE)
                .withSize(Size.MEDIUM)
                .withColor(Color.BROWN)
                .build();

        //Place birthday party order
        Order secondOrder = new Order();
        firstOrder.addBalloon(balloon);
        firstOrder.addCake(cake);

        balloon = new BalloonBuilder()
                .withColor(Color.YELLOW)
                .withMaterial(Material.MYLAR)
                .withCount(4)
                .build();
        cake = new CakeBuilder()
                .withFlavor(Flavor.VANILLA)
                .withFrostFlavor(FrostFlavor.VANILLA)
                .withShape(Shape.SQUARE)
                .withSize(Size.SMALL)
                .withColor(Color.YELLOW)
                .build();

        //Place birthday party order
        Order thirdOrder = new Order();
        firstOrder.addBalloon(balloon);
        firstOrder.addCake(cake);
    }

    private static void order(String balloonColor, String material, String number, String flavor, String frostingFlavor, String shape, String size, String cakeColor){

        orderBalloons(balloonColor, material, number);

        orderCake(frostingFlavor, flavor, shape, size, cakeColor);
    }

    private static void orderBalloons(String balloonColor, String material, String number){

//        for the purposes of this exercise, pretend this method works and adds balloons to the order
        System.out.println("Balloons ordered; " + balloonColor + ", " + material  + ", " + number);

    }

    private static void orderCake(String flavor, String frostingFlavor, String shape, String size, String cakeColor){

        //for the purposes of this exercise, pretend that this method adds a cake to the order
        System.out.println("cake ordered; " + flavor + ", " + frostingFlavor  + ", " + shape + ", " + size + ", " + cakeColor);

    }

}
