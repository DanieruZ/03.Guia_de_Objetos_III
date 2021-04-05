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


                    Estudiante estudiante = new Estudiante(30157863, "Anonimo", "Argento", "anonimo@gmail.com", "Cucha cucha al 1300", 2021, 4000, "TUP");
                    Estudiante estudiante1 = new Estudiante(28173266, "Anonimo1", "Argento", "anonimo1@gmail.com", "Cucha cucha al 1301", 2020, 3800, "TUP");
                    Estudiante estudiante2 = new Estudiante(32153321, "Anonimo2", "Argento", "anonimo2@gmail.com", "Cucha cucha al 1302", 2018, 1700, "TUP");
                    Estudiante estudiante3 = new Estudiante(33356941, "Anonimo3", "Argento", "anonimo3@gmail.com", "Cucha cucha al 1303", 2019, 3200, "TUP");

                    Staff miembro = new Staff(14456123, "Anonimo", "Trucheli", "anonimo@hotmail.com", "Acaalavuelta al 5000", 50000, "Mañana");
                    Staff miembro1 = new Staff(16456663, "Anonimo", "Trucheli", "anonimo1@hotmail.com", "Acaalavuelta al 5001", 25000, "Noche");
                    Staff miembro2 = new Staff(31487123, "Anonimo", "Trucheli", "anonimo2@hotmail.com", "Acaalavuelta al 5002", 35000, "Mañana");
                    Staff miembro3 = new Staff(18673997, "Anonimo", "Trucheli", "anonimo3@hotmail.com", "Acaalavuelta al 5003", 45000, "Noche");

                    Persona[] colegio = new Persona[8];
                    colegio[0] = estudiante;
                    colegio[1] = estudiante1;
                    colegio[2] = estudiante2;
                    colegio[3] = estudiante3;
                    colegio[4] = miembro;
                    colegio[5] = miembro1;
                    colegio[6] = miembro2;
                    colegio[7] = miembro3;

                    int totalEstudiantes = 0;
                    int totalMiembros = 0;

                    for(Persona i : colegio) {
                        if(i != null) {
                            if(i instanceof Estudiante) totalEstudiantes++;
                            if(i instanceof Staff) totalMiembros++;
                        }
                    }

                    show.println("Total alumnos del colegio:..... " + totalEstudiantes);
                    show.println("Total miembros del staff:...... " + totalMiembros);

                    double totalIngresos = 0;

                    for(Persona i : colegio) {
                        if(i != null) {
                            if(i instanceof Estudiante) totalIngresos += ((Estudiante) i).getCuota();
                        }
                    }

                    show.println("Total ingreso mensual:......... $" + totalIngresos);

                    Pausa.pausar();
                    limpiarPantalla();
                    break;
                case 3:
                    show.println("  -------------------");
                    show.println(" |   Ejercicio 03.   |");
                    show.println("  -------------------");
                    show.println("\n");

                    Figura circulo = new Circulo3("Violeta", 4);
                    Figura rectangulo = new Rectangulo("Negro", 6, 12);
                    Figura cuadrado = new Cuadrado("Blanco",5);

                    show.println(circulo);
                    show.println(rectangulo);
                    show.println(cuadrado);

                    Figura[] figuras = new Figura[3];
                    figuras[0] = circulo;
                    figuras[1] = rectangulo;
                    figuras[2] = cuadrado;

                    for(Figura i : figuras) {
                        if(i != null) {
                            show.println("\nArea:........ " + i.calcularArea());
                            show.println("Perimetro:... " + i.calcularPerimetro());
                        }
                    }

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
        show.println("\t    GUIA 03: OBJETOS III.");
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
