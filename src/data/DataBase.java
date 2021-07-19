package data;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

import entitys.Lucrare;
import entitys.LucrarePersoanaFizica;
import entitys.PersoanaFizica;

public class DataBase {

	private static ArrayList<PersoanaFizica> persoaneFizice = new ArrayList<PersoanaFizica>();
	
	private static ArrayList<Lucrare> lucrari = new ArrayList<Lucrare>();
	

	public static ArrayList<Lucrare> getLucrari() {
		return lucrari;
	}

	public static ArrayList<PersoanaFizica> getPersoaneFizice() {
		return persoaneFizice;
	}

	public static void addPersoanaFizica(PersoanaFizica persoanaFizica) {
		Iterator<PersoanaFizica> iterator = persoaneFizice.iterator();
		while (iterator.hasNext()) {
			if (iterator.next().getCnp().equals(persoanaFizica.getCnp())) {
				iterator.remove();
			}
		}
		persoaneFizice.add(persoanaFizica);
	}

	public static void addLucrare(Lucrare lucrare) {
		if (lucrari.size() == 0) {
			lucrari.add(lucrare);
			JOptionPane.showMessageDialog(null, "Datele au fost salvate cu succes!");
		} else {
			boolean existaLucrare = false;
			for (Lucrare lucrareDeComparat : lucrari) {
				if (lucrareDeComparat.getNrLucrare().equals(lucrare.getNrLucrare())) {
					existaLucrare = true;
				} 
			}
			if(!existaLucrare) {
				lucrari.add(lucrare);
				JOptionPane.showMessageDialog(null, "Datele au fost salvate cu succes!");
			} else {
				JOptionPane.showMessageDialog(null, "Exista deja o lucrare cu acest numar in istoric");
			}
		}
	}

	public static void arataToatePersoaneleFizice() {
		for (PersoanaFizica pf : persoaneFizice) {
			System.out.println(pf.toString());
		}
	}

	public static void arataToateLucrarile() {
		for (Lucrare lucrare : lucrari) {
			System.out.println(lucrare.toString());
		}
	}
}
