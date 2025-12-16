import java.util.Stack;

import Utils.SignValidator;
import Utils.StackSorter;

public class App {

    public static void main(String[] args){
        runSignValidator();
        runStackSorter();
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
}
