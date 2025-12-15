import Utils.SignValidator;

public class App {

    public static void main(String[] args){
        runSignValidator();
    }

    private static void runSignValidator() {
        SignValidator signValidator = new SignValidator();

        String cadena1 = "{[()]}"; // VALIDO
        String cadena2 = "{[(])}"; // NO VALIDO

        System.out.println("Cadena: " + cadena1 + " es valida? " + signValidator.isValid(cadena1));
        System.out.println("Cadena: " + cadena2 + " es valida? " + signValidator.isValid(cadena2));
    }
}
