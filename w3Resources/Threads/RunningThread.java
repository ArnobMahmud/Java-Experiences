package w3Resources.Threads;

public class RunningThread implements Runnable {
    public static void main(String[] args) {
        RunningThread obj = new RunningThread();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("This code is outside of the thread");
    }

    public void run() {
        System.out.println("This code is running in a thread");
    }
}

//If the class extends the Thread class, the thread can be run by creating an instance of the class and call its start() method:
// If the class implements the Runnable interface, the thread can be run by
// passing an instance of the class to a Thread object's constructor and then
// calling the thread's start() method: