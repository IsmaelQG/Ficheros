package ejercicio_8_10_11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

import com.thoughtworks.xstream.XStream;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException{

		File agenda = new File("agenda.dat");
		ObjectOutputStream dataOS = new ObjectOutputStream(new FileOutputStream(agenda));
		ObjectInputStream dataIS = new ObjectInputStream(new FileInputStream(agenda));
		XStream x = new XStream();
		ListaContactos listaContactos = new ListaContactos();
		
		Contacto contacto;
		
		String nombres[] = {"Ismael", "Jose"};
		int telefonos[] = {698223020, 765889234};
		String direcciones[] = {"C/Monaco", "C/Jose de Espronceda"};
		int codigosPostal[] = {11207, 11205};
		LocalDate fechasNac[] = {LocalDate.of(2000, 01, 01), LocalDate.of(2000, 11, 11)};
		boolean endeudados[] = {true, false};
		double debito[] = {20, 0};
		
		for(int i=0; i<nombres.length; i++) {
			contacto = new Contacto(nombres[i], telefonos[i], direcciones[i], codigosPostal[i], fechasNac[i], endeudados[i], debito[i]);
			dataOS.writeObject(contacto);
			listaContactos.add(contacto);
		}
		
		contacto = new Contacto("Manu", 854838221, "C/Rayos X", 11203, LocalDate.of(1995, 05, 29), true, 89.35);
		dataOS.writeObject(contacto);
		listaContactos.add(contacto);
		
		contacto = new Contacto("Dario", 854838221, "C/Tyler1", 11203, LocalDate.of(1995, 05, 29), true, 89.35);
		dataOS.writeObject(contacto);
		listaContactos.add(contacto);

		dataOS.close();
		
		x.alias("ListaContactos", ListaContactos.class);
		x.alias("Contacto", Contacto.class);
		x.addImplicitCollection(ListaContactos.class, "listaContactos");
		x.toXML(listaContactos, new FileOutputStream("Contactos.xml"));
		
		listaContactos = (ListaContactos) x.fromXML(new FileInputStream("Contactos.xml"));
		ArrayList<Contacto> listaArrayContactos = listaContactos.getListaContactos();
		
		Iterator iterator = listaArrayContactos.listIterator();
		while(iterator.hasNext()) {
			contacto = (Contacto) iterator.next();
			System.out.printf("%s\n%d\n%s\n%d\n%s\n%s\n%.2f\n\n", contacto.getNombre(), contacto.getTelefono(), contacto.getDireccion(), contacto.getcPostal(), contacto.getfNac().toString(), contacto.isSiDebo(), contacto.getDebito());
		}
		
		/*
		 try {
			while(true) {
				contacto= (Contacto) dataIS.readObject();
				System.out.printf("%s\n%d\n%s\n%d\n%s\n%s\n%.2f\n\n", contacto.getNombre(), contacto.getTelefono(), contacto.getDireccion(), contacto.getcPostal(), contacto.getfNac().toString(), contacto.isSiDebo(), contacto.getDebito());
			}
		}
		catch(EOFException e) {
			
		}
		dataIS.close();
		
		*/
		
	}

}
