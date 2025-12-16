package Utils;

import java.util.LinkedList;
import java.util.Queue;

public class QueueUtils {

    public boolean isPalindrome(String text) {
        
        Queue<Character> colaOriginal = new LinkedList<>();
        Queue<Character> colaInvertida = new LinkedList<>();

        char[] caracteres = text.toCharArray();

        for (char c : caracteres) {
            
            colaOriginal.offer(c);

            Queue<Character> colaAuxiliar = new LinkedList<>();
            
            colaAuxiliar.offer(c);
            
            while (!colaInvertida.isEmpty()) {
                colaAuxiliar.offer(colaInvertida.poll());
            }
            
            colaInvertida = colaAuxiliar;
        }

        while (!colaOriginal.isEmpty()) {
            char charOriginal = colaOriginal.poll();
            char charInvertido = colaInvertida.poll();

            if (charOriginal != charInvertido) {
                return false;
            }
        }

        return true;
    }
}