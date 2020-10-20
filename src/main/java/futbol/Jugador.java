package futbol;

public class Jugador extends Futbolista{
	
	public short golesMarcados;
	public byte dorsal;
	
	public Jugador() {
		super();
		this.golesMarcados = 289;
		this.dorsal = 7;
	}
	public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
		super(nombre, edad, posicion);
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal;
	}

	public int compareTo(Futbolista f) {
		int a = this.getEdad() - f.getEdad();
		if (a < 0) {
			return -a;
		}
		else {
			return a;
		}
	}
	
	
	public String toString() {
		return "El futbolista "+this.getNombre()+" tiene "+this.getEdad()+ ", y juega de "+this.getPosicion()+" con el dorsal "+this.dorsal+ ". Ha marcado "+this.golesMarcados;
	}
	
	
	
	
	
	public short getGolesMarcados() {
		return golesMarcados;
	}


	public void setGolesMarcados(short golesMarcados) {
		this.golesMarcados = golesMarcados;
	}


	public byte getDorsal() {
		return dorsal;
	}


	public void setDorsal(byte dorsal) {
		this.dorsal = dorsal;
	}
	
	
	
}
