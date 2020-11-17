package ejercicio_8_10_11;

import java.util.ArrayList;

public class ListaContactos {

	private ArrayList<Contacto> listaContactos = new ArrayList<>();
	
	public void add(Contacto c) {
		listaContactos.add(c);
	}
	public ArrayList<Contacto> getListaContactos(){
		return listaContactos;
	}
}
