import java.util.concurrent.ThreadLocalRandom;

// nextInt is normally exclusive of the top value,
// so add 1 to make it inclusive

public class Main {
    public static void main(String[] args) {
        int[] someArray = new int[10];
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            someArray[i] = ThreadLocalRandom.current().nextInt(0, 1000 + 1);
            System.out.println(someArray[i]);
        }

        for (int i = 0; i < 10; i++) {
            sum += someArray[i];
        }

        System.out.println("For: " + sum);

        sum = 0;

        int k = 0;

        while (k < 10){
            sum += someArray[k];
            k++;
        }

        System.out.println("While: " + sum);

        sum = 0;
        k = 0;

        do {
            sum += someArray[k];
            k++;
        } while(k < 10);

        System.out.println("Do While: " + sum);
    }
}