import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.lang.System;
import java.text.DecimalFormat;

public class RandomSortSystemInfo {
    public static void main(String[] args) {
       
        Random rand = new Random();
        ArrayList<Double> numbers = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            numbers.add(rand.nextDouble() * 100); // Random numbers from 0 to 100
        }

       
        Collections.sort(numbers);

        
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Sorted Random Numbers:");
        for (double num : numbers) {
            System.out.println(df.format(num));
        }

        
        System.out.println("\nSystem Information:");
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("User Name: " + System.getProperty("user.name"));
        System.out.println("Operating System: " + System.getProperty("os.name"));
    }
}
