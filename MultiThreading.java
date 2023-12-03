import java.util.Random;
import java.util.Scanner;

class X implements Runnable {
    static int random;
    Random rand = new Random();

    public void run() {
        random = rand.nextInt(25);
        System.out.println("Random Number: " + random);
    }
}

class Y implements Runnable {
    public void run() {
        if (X.random % 2 == 0)
            System.out.println("Square: " + (int) Math.pow(X.random, 2) + "\n");
    }
}

class Z implements Runnable {
    public void run() {
        if (X.random % 2 != 0)
            System.out.println("Cube: " + (int) Math.pow(X.random, 3) + "\n");
    }
}

class MultiThreading {
    public static void main(String args[]) {
        System.out.println("Enter the numbers of iterations: ");
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();

        for (int i = 1; i <= limit; i++) {
            Thread obj X = new Thread(new X());
            Thread obj Y = new Thread(new Y());
            Thread obj Z = new Thread(new Z());

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
               
            }

         obj X.run();
 	obj Y.run();
	obj Z.run();        
}
    }
}
