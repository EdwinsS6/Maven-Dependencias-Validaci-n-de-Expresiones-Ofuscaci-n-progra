package umg.edu.gt.data_structure.stackhandler;

import umg.edu.gt.data_structure.stackhandler.SymbolValidator;

public class App {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Debe ingresar una expresión algebraica.");
            return;
        }

        String expression = args[0];
        boolean result = SymbolValidator.validate(expression);

        System.out.println("Expresión: " + expression);
        System.out.println("¿Es válida?: " + result);
    }
}