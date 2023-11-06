public class Fruit {

    //variable declarations
    public String color;
    public String shape;
    public int numSeeds;
    public boolean isRipe;
    public int numBush;

    public void printInfo (){
       //print strawberry
        System.out.println("The fruit is: " + color);
        System.out.println("The shape is: " + shape);
        System.out.println("The seed count: " + numSeeds);
        if (isRipe == true) {
            System.out.println("the fruit is ripe");
        }
        else {
            System.out.println("the strawberry is ripe");
        }
        System.out.println("The bush has this many strawberries: " + numBush);

        //print apple
        System.out.println("The fruit is: " + color);
        System.out.println("The shape is: " + shape);
        System.out.println("The seed count: " + numSeeds);
        if (isRipe == true) {
            System.out.println("the fruit is ripe");
        }
        else {
            System.out.println("the apple is ripe");
        }
        System.out.println("The tree has this many apple: " + numBush);
    }

    public Fruit(){


    }

}
