package utils;

import java.awt.Image;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import javax.swing.ImageIcon;
import screens.LucarePFPrimaArma;

public class Service {

	public static ImageIcon changeIconSize(String path, int h, int w) {
		ImageIcon icon = new ImageIcon(LucarePFPrimaArma.class.getResource(path));
		Image img = icon.getImage();
		Image newimg = img.getScaledInstance(h, w, java.awt.Image.SCALE_SMOOTH);
		icon = new ImageIcon(newimg);
		return icon;
	}

	public static LocalDate stringToDate(String string) {
		LocalDate ld = null;
		try {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
					"[dd/MM/yyyy]" + "[dd.MM.yyyy]" + "[dd-MM-yyyy]" + "[d/M/yyyy]" + "[d.M.yyyy]" + "[d-M-yyyy]");
			ld = LocalDate.parse(string, formatter);
		} catch (DateTimeParseException e) {
			e.printStackTrace();
		}
		return ld;
	}
	
	public static String dateToString(LocalDate localDate) {
		String ld = null;
		try {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
			ld = localDate.format(formatter);
		} catch (DateTimeParseException e) {
			e.printStackTrace();
		}
		return ld;
	}

}
