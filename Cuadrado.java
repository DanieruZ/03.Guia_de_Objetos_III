/****************************************************************
 *
 * 3. Necesitamos crear un programa que nos permita crear diferentes tipos de figuras
 *    que poseen un color, estas figuras pueden o no estar coloreadas. Además
 *    necesitamos que las figuras tengan la posibilidad de calcular area y perimetro. Por
 *    el momento nos piden crear 2 Figuras, Círculo y Rectángulo. ambos deben contar
 *    con sus respectivas características, ya sea radio, alto, largo, etc. Y deben contar con
 *    los métodos de cálculo de area y perimetro implementados.
 *      ● Considerar si existe la posibilidad de crear un tipo abstracto que
 *        defina las características en común y que permita establecer qué
 *        métodos son mandatarios para las subclases.
 *      ● Los tipos deben contener diferentes constructores, por defecto y que
 *        inicialice diferentes atributos.
 *      ● Crear diferentes instancias de cada tipo e imprimir sus
 *        características.
 *      ● Nos piden agregar un nuevo tipo de forma, esta vez es un Cuadrado.
 *        Analice dónde es conveniente agregarlo en el árbol de herencia.
 *        Teniendo en cuenta evitar la duplicación de código innecesario.
 *
 ***************************************************************/

package guia_03;

public class Cuadrado extends Figura {

    protected double lado;

    public Cuadrado(String color, double lado) {
        super(color);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return (Math.pow(this.lado, 2));
    }

    @Override
    public double calcularPerimetro() {
        return (this.lado * 4);
    }

    @Override
    public String toString() {
        return  "\nCuadrado: "   +
                "\nLado:...... " + this.lado +
                "\nColor:..... " + this.color;
    }

}
