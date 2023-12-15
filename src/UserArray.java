import java.lang.reflect.Array;
import java.util.Random;

import java.util.*;

public class UserArray {

          private List<Integer> integerList;
          private static Random randomGenerator = new Random();

          public UserArray(List<Integer> intList){
                    this.integerList = intList;
          }

          public static ArrayList<Integer> randomSequential(ArrayList<Integer> integerList){
                    Scanner s = new Scanner(System.in);
                    System.out.println("How many sequential numbers would you like to sort?");
                    int quantity = s.nextInt();
                    for (int i = 1; i <= quantity; i++) {
                              integerList.add(i);
                    }
                    Collections.shuffle(integerList);
                    return integerList;
          }

          public static ArrayList<Integer> randomSet(ArrayList<Integer> integerList) {
                    Scanner s = new Scanner(System.in);
                    System.out.println("How many random numbers would you like to sort?");
                    int quantity = s.nextInt();
                    System.out.println(quantity);
                    System.out.println("What range of random numbers would like to generate?");
                    int range = s.nextInt();
                    for (int i = 1; i <= quantity; i++) {
                              integerList.add(randomGenerator.nextInt(range) + 1);
                    }
                    return integerList;
          }

          public static void randomCustom(ArrayList<Integer> integerList) {
          }
}
