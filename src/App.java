import java.util.Stack;

import Utils.QueueUtils;
import Utils.SignValidator;
import Utils.StackSorter;

public class App {

    public static void main(String[] args){
        runSignValidator();
        runStackSorter();
        runQueuePalindrome();
    }

    private static void runSignValidator() {

        System.out.println("--- EJERCICIO 01: VALIDATOR ---");
        SignValidator signValidator = new SignValidator();

        String cadena1 = "{[()]}"; // VALIDO
        String cadena2 = "{[(])}"; // NO VALIDO

        System.out.println("Cadena: " + cadena1 + " es valida? " + signValidator.isValid(cadena1));
        System.out.println("Cadena: " + cadena2 + " es valida? " + signValidator.isValid(cadena2));
    }

    private static void runStackSorter() {
        System.out.println("--- EJERCICIO 02: STACK SORTER ---");
        StackSorter sorter = new StackSorter();
        Stack<Integer> stack = new Stack<>();
        
        stack.push(2);
        stack.push(4);
        stack.push(1);
        stack.push(5); 

        System.out.println("Stack Original (Tope a Fondo): " + stack);
       
        sorter.sortStack(stack);

        System.out.println("Stack Ordenado (Tope a Fondo): " + stack);
        System.out.println("Tope actual: " + stack.peek());
        System.out.println();
    }

    private static void runQueuePalindrome() {
        System.out.println("--- EJERCICIO 03: PALINDROMO QUEUE ---");
        QueueUtils queueUtils = new QueueUtils();

        String p1 = "ana";
        String p2 = "radar";
        String p3 = "java";

        System.out.println("Input: " + p1 + " | Es palindromo? " + queueUtils.isPalindrome(p1));
        System.out.println("Input: " + p2 + " | Es palindromo? " + queueUtils.isPalindrome(p2));
        System.out.println("Input: " + p3 + " | Es palindromo? " + queueUtils.isPalindrome(p3));
        System.out.println();
    }
}
