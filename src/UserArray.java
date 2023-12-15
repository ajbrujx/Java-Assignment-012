import java.lang.reflect.Array;
import java.util.*;

public class UserArray {

          private List<Integer> integerList;

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

                    System.out.println(integerList.size());

                    for (int i = 0; i < integerList.size() ; i++ ) {
                              System.out.println(integerList.get(i));
                    }

                    Collections.shuffle(integerList);

                    for (int i = 0; i < integerList.size() ; i++ ) {
                              System.out.println(integerList.get(i));
                    }

                    return integerList;
          }

          public static void randomSet(ArrayList<Integer> integerList) {
          }

          public static void randomCustom(ArrayList<Integer> integerList) {
          }
}
