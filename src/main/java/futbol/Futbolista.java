package futbol;

public class Futbolista {

	private String nombre;
	private int edad;
	private final String posicion;
	
	public Futbolista() {
		this.nombre = "Maradona";
		this.edad = 30;
		this.posicion = "delantero";
	}
	
	
	public Futbolista(String nombre, int edad, String posicion) {
	this.nombre = nombre;
	this.edad = edad;
	this.posicion = posicion;
	}
	
	public String toString() {
		return "El futbolista "+this.nombre+" tiene "+this.edad+", y juega de "+this.posicion;
		
	}


	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}


	public boolean jugarConLasManos() {
		if (this.getPosicion().equals("Portero")) {
			return true;
		}
		else {
			return false;
		}
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getPosicion() {
		return posicion;
	}

	
	
}
