package guia_03;

import java.io.PrintStream;
import java.util.Scanner;


public class Main {

    public static PrintStream show = (System.out);
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int selected;

        do {
            selected = menu();
            switch(selected) {
                case 1:
                    show.println("  -------------------");
                    show.println(" |   Ejercicio 01.   |");
                    show.println("  -------------------");
                    show.println("\n");

                    Cilindro cilindro = new Cilindro();
                    show.println(cilindro);

                    show.println("\nRadio:...... " + cilindro.getRadio());
                    show.println("Altura:..... " + cilindro.getAltura());
                    show.println("Area:....... " + cilindro.calcularArea());
                    show.println("Volumen:.... " + cilindro.calcularVolumen());

                    Cilindro cilindro1 = new Cilindro(4, 10);
                    show.println(cilindro1);

                    show.println("\nRadio:...... " + cilindro1.getRadio());
                    show.println("Altura:..... " + cilindro1.getAltura());
                    show.println("Area:....... " + cilindro1.calcularArea());
                    show.println("Volumen:.... " + cilindro1.calcularVolumen());

                    Pausa.pausar();
                    limpiarPantalla();
                    break;
                case 2:
                    show.println("  -------------------");
                    show.println(" |   Ejercicio 02.   |");
                    show.println("  -------------------");
                    show.println("\n");



                    Pausa.pausar();
                    limpiarPantalla();
                    break;
                case 3:
                    show.println("  -------------------");
                    show.println(" |   Ejercicio 03.   |");
                    show.println("  -------------------");
                    show.println("\n");


                    Pausa.pausar();
                    limpiarPantalla();
                    break;
                case 0:
                    show.println("Programa finalizado.");
                    break;
                default:
                    limpiarPantalla();
                    limpiarPantalla();
                    limpiarPantalla();
                    show.println("¡¡¡Ejercicio incorrecto.!!!");
                    Pausa.pausar();
                    limpiarPantalla();
                    break;
            }
        }while(selected !=0);
    }

    public static int menu() {
        show.println("\n\t____________________________________________________________________");
        show.println("\n");
        show.println("\t    GUIA 02: OBJETOS III.");
        show.println("\n\t____________________________________________________________________");
        show.println("\n");
        show.println("\t    MENU");
        show.println("\n\t____________________________________________________________________");
        show.println("\n");
        show.println("\t   [1].Ejercicio 01.");
        show.println("\t   [2].Ejercicio 02.");
        show.println("\t   [3].Ejercicio 03.");
        show.println("\n\t____________________________________________________________________");
        show.println("\n");
        show.println("\t   [0].Salir del programa.");
        show.println("\n\t____________________________________________________________________");
        show.println("\n\n\t  Elija una opcion: ");
        show.println("\n");
        return scan.nextInt();
    }

    public static void limpiarPantalla() {
        for(int i=0;i<20;i++) {
            show.println("\n");
        }
    }

    public static class Pausa {
        public static void pausar() {
            show.println("\n");
            show.println(" ----------------------------------------");
            show.println("|Presionar la tecla ENTER para continuar.|");
            show.println(" ----------------------------------------");
            Scanner aceptar = new Scanner(System.in);
            show.println("\n");
            aceptar.nextLine();
        }
    }
}
