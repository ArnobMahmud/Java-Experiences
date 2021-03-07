package w3Resources.Threads;

public class AliveConcurrency extends Thread {
    public static int amount = 0;

    public static void main(String[] args) {
        AliveConcurrency thread = new AliveConcurrency();
        thread.start();
        // Wait for the thread to finish
        while (thread.isAlive()) {
            System.out.println("Waiting...");
        }
        // Update amount and print its value
        System.out.println("Main: " + amount);
        amount++;
        System.out.println("Main: " + amount);
    }

    public void run() {
        amount++;
    }

}

// To avoid concurrency problems, it is best to share as few attributes between
// threads as possible. If attributes need to be shared, one possible solution
// is to use the isAlive() method of the thread to check whether the thread has
// finished running before using any attributes that the thread can change.