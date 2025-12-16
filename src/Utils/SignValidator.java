package Utils;

import java.util.Stack;

public class SignValidator {

    public boolean isValid(String signos){

        Stack<Character> stack = new Stack<Character>();
        
        char[] caracteres = signos.toCharArray();
        for (Character character : caracteres){
            // character -> (
            // character -> }
            // 1. Comprobar si es apertura o cierre
            if(getIsApertura(character)){
                // ingresar a la pila
                stack.push(character);

            }else{
                if(stack.isEmpty()){
                    return false;
                }

                char ultimo = stack.pop(); // Apertura obligatorio
                // ultimo es del mismo tipo que el character?
                                // ultimo (&& character) -> True
                                // ultimo (&& character) -> True
                                // ultimo (&& character) -> True
                                // ultimo (&& character) -> False
                if (!isTipoIgual(ultimo, character)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private boolean getIsApertura(char c){
        return c == '(' || c == '[' || c == '{';
    } 

    private boolean isTipoIgual (char c1, char c2){
        return (c1 == '(' && c2 == ')') ||
               (c1 == '[' && c2 == ']') ||
               (c1 == '{' && c2 == '}');
    }
}
