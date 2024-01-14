import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence. This programme is case sensitive");
        String sentence = scanner.nextLine();
        System.out.println("Enter a letter");
        char letter = scanner.next().charAt(0);
        boolean isPrime = false;
        int clock = 0;

        for (int i = 0 ; i<sentence.length() ; i++ ){

            if (sentence.charAt(i) == letter){
                isPrime = true;
                clock++;
            }

        }
        System.out.println("Sentence : "+sentence+". Letter : "+letter);
        System.out.println("Does the sentence inludes the letter? "+isPrime);
        if (clock!=0){
            System.out.println("How many times?"+clock);
        }



    }

}
