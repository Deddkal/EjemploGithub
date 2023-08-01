import static java.lang.Integer.valueOf;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        // Press Mayús+F10 or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            // Press Mayús+F9 to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Ctrl+F8.
//            System.out.println("i = " + i);
//        }

        String nombre = "hola ";
        String saludo = "hola";
        saludo = saludo + " ";
        String loco = new String("hola ");
        System.out.println(saludo);

        System.out.println(nombre == saludo);
        System.out.println(nombre.equals(saludo));

        int numUno = 0, numDos = 0, resultado =0;

        int numeros[] = new int[3];
        int[] numeritos = new int[3];
        Byte numerito = 6;
        int numeris = valueOf(numerito);
        int numerito2 = (int) numerito;
    }
}