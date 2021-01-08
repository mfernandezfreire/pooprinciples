
public class Persona {
	private String nombre;
	private int edad;
	private String DNI;
	private char sexo = 'H';
	private int peso;
	private Double altura;
	
	Persona(String DNI){
		this.DNI = DNI;
	}
	
	Persona(String nombre, int edad, String DNI){
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = DNI;
	}
	
	Persona(String nombre, int edad, String DNI, char sexo, int peso, Double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = DNI;
		this.sexo = comprobarSexo(sexo);
		this.peso = peso;
		this.altura = altura;
	}
	
	public int calcularIMC() {
		double pesoIdeal = this.peso / Math.pow(this.altura, 2);
		return pesoIdeal > this.peso ? -1 : pesoIdeal == this.peso ? 0 : -1;
	}
	
	public Boolean esMayorDeEdad() {
		return edad > 18 ? true : false;
	}
	
	private char comprobarSexo(char s) {
	 return s != 'H' ? 'H' : s; 
	}
	
	public String toString() {
		return this.nombre + " " + this.edad + " " + this.DNI + " " + this.sexo + " " + this.peso + " " + this.altura;
	}
	
	public String generaDNI() {
		return "DNI";
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
	
	
}
