package w3Resources.OOP.Polymorphism;

public class polymorphism {
    public static void main(String[] args) {

        animals myAnimals = new animals(); // Create a Animal object
        cats myCats = new cats();   // Create a cat object
        dogs myDogs = new dogs();   // Create a dog object

        myAnimals.animalSound();
        myCats.animalSound();
        myDogs.animalSound();
    }
}
