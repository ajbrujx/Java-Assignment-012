import java.util.Scanner;

public class Main {

          private static String[] userPrompt = {
                  "Would you like to sort a set of",
                  "Randomized sequential integers",
                  "Random set of integers",
                  "Custom set of integers"
          };


          private static void arraySelection() {
                    int userChoice;
                    Scanner s = new Scanner(System.in);
                    System.out.println(userPrompt[0]);
                    for (int i = 1; i < userPrompt.length; i++) {
                              System.out.printf("%d. %s\n", i, userPrompt[i]);
                    }
                    userChoice = s.nextInt();
                    switch (userChoice) {
                              case 1:
                                        randomSequential();
                                        break;
                              case 2:
                                        randomSet();
                                        break;
                              case 3:
                                        randomCustom();
                                        break;
                              default:
                                        System.out.println("Invalid choice. Please select 1, 2, or 3.");
                    }

          }
          public static void main(String[] arges){
                    arraySelection();
          }


}
