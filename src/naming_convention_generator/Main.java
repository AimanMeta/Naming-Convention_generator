package naming_convention_generator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         * What does this program do?
         *
         * Take inputs and then manipulate it to the chosen naming convention
         *
         * how?
         *
         * - input:
         *  1. how many words?
         *  2. naming convention (camel case, pascal case, snake case, kebab case)?
         *
         *  - processing:
         *      put the words into array then manipulate the array based on chosen case
         */

        Scanner inputAmountWords = new Scanner(System.in);
        System.out.println("How many words?");
        int amountWords = inputAmountWords.nextInt();

        // TODO: create array here
        System.out.println();
        String[] words = new String[amountWords];

        // TODO: scan input for each word then add to array (use for loop)
        for (int i = 0; i<amountWords; i++){
            int j = i+1;
            Scanner inputWord = new Scanner(System.in);
            System.out.println(j + ". Word");
            words[i] = inputWord.nextLine();
        }

        /*
        Scanner inputCaseType = new Scanner(System.in);
        System.out.println("Please choose a case type:");
        System.out.println("1: camelCase");
        System.out.println("2: snake_case");
        System.out.println("3: kebab-case");
        System.out.println("4: PascalCase");
        System.out.println();
        int caseType = inputCaseType.nextInt();

        // TODO: manipulate elements in array here

        System.out.println();
        System.out.println(amountWords);
        System.out.println(caseType);

         */
    }
}
