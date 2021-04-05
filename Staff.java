/****************************************************************
 *
 * 2. Vamos a diseñar un programa que nos permita gestionar el personal que concurre
 * 	  a un colegio. Para no hacerlo muy extenso vamos a limitarnos a estudiantes y
 * 	  miembros de staff que a diferencia de los estudiantes, estos perciben una
 * 	  remuneración. Ambos tipos comparten la característica de Persona que posee los
 * 	  atributos de dni, nombre, apellido, email y direccion.
 * 	  Por otro lado tenemos al Estudiante que posee las características de
 * 	  Persona y las de un estudiante, que en este caso son, año de ingreso, cuota
 * 	  mensual y carrera.
 * 	  Y finalmente tenemos al miembro de Staff que también es una Persona pero
 * 	  con características propias de alguien que trabaja para una institución, por ejemplo
 * 	  salario y turno, este puede ser mañana o noche.
 * 	  Diagramar el UML identificando superclase y subclases, crear constructores
 * 	  necesarios, getters y setters, métodos de ayuda como salario anual y toString para
 * 	  facilitar la impresión.
 * 		● Inicializar 4 estudiantes diferentes.
 * 		● Inicializar 4 miembros de staff con características diferentes.
 * 		● Crear un array que permita almacenar juntos los tipos anteriores y
 * 		  almacenar las 8 instancias creadas anteriormente.
 * 		● Investigar el uso de la palabra reservada instanceof.
 * 		● Recorrer el array y mostrar por pantalla la cantidad de estudiantes y
 * 		  la cantidad de miembros de staff.
 * 		● Recorrer el array y sumar el total de ingresos que percibe la
 * 		  institución por parte de la cuota de estudiantes.
 *
 ***************************************************************/

package guia_03;

public class Staff extends Persona {

	private double salario;
	private String turno;

	public Staff(int dni, String nombre, String apellido, String email, String direccion,
					   double salario, String turno) {
		
		super(dni, nombre, apellido, email, direccion);
		this.salario = salario;
		this.turno = turno;
	}

	@Override
	public String toString() {
		return  "\nStaff: "             +
				"\nSalario:......... " + this.salario + 
				"\nTurno:........... " + this.turno + 
				"\nDNI:............. " + this.dni + 
				"\nNombre:.......... " + this.nombre + 
				"\nApellido:........ " + this.apellido + 
				"\nEmail:........... " + this.email + 
				"\nDireccion:....... " + this.direccion;
	}
}