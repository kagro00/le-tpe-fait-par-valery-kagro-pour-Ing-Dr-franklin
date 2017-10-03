import java.util.Scanner;
class Palindrome {
    private static final Scanner scanner = new Scanner(System.in);
 
    public static void main (String args[]) {
        System.out.print("Entrez un original ou une phrase : ");
        String original = scanner.nextLine();
 
        // On convertit l'original en minuscules pour éviter
        // les problèmes de casse:
        String test = original.toLowerCase();
 
        // On ne garde que les caractères alphabétiques
        String allowedList = "abcdefghijklmnopqrstuvwxyz";
        String temp = "";
        for (int i = 0; i < test.length(); i++) {
            char c = test.charAt(i);
            if (allowedList.indexOf(c) != -1) {
                temp += c;
            }
        }
        test = temp;
 
        // On teste si mot2 est un palindrôme
        int leftPos = 0;
        int rightPos = test.length() - 1;
        boolean palindrome=true;
        while ((leftPos < rightPos) && palindrome) {
            if (test.charAt(leftPos) != test.charAt(rightPos)) {
                palindrome=false;
            }
            leftPos++;
            rightPos--;
        }
 
        if (palindrome) {
            System.out.println("C'est un palindrôme !");
        } else {
            System.out.println("Non, ce n'est pas un palindrôme.");
        }
    }
}