public class FruitHQ {
    public static void main(String[] args) {
        System.out.println("Hello fruit world!");
    FruitHQ myFactory = new FruitHQ();

    }

// constructor method
// a constructor is a method with no return type that has the same name as the class it's in
    public FruitHQ(){
        //strawberry: red, triangle, 200, true, 20
        Fruit strawberry; //declare strawberry
        strawberry = new Fruit(); //construct strawberry
        strawberry.color = "red";
        strawberry.shape = "triangle";
        strawberry.numSeeds = 200;
        strawberry.isRipe = true;
        strawberry.numBush = 20;
        strawberry.printInfo();

        // apple: red, circle, 10, true, 20

        Fruit apple;
        apple = new Fruit(); //construct strawberry
        apple.color = "red";
        apple.shape = "circle";
        apple.numSeeds = 10; 
        apple.isRipe = true;
        apple.numBush = 50;
        apple.printInfo();

    }

}


