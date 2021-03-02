package w3Resources.OOP.Polymorphism;

public class Polymorphism {
    public static void main(String[] args) {

        Animals myAnimals = new Animals(); // Create a Animal object
        Cats myCats = new Cats();   // Create a cat object
        Dogs myDogs = new Dogs();   // Create a dog object

        myAnimals.animalSound();
        myCats.animalSound();
        myDogs.animalSound();
    }
}
