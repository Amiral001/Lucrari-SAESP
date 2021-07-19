package screens;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import data.DataBase;
import entitys.LucrarePersoanaFizica;
import entitys.PersoanaFizica;
import utils.Service;

public class LucrarePFADouaArma extends JPanel {

	public LucrarePFADouaArma() {
		
		setLayout(null);
		setBounds(0, 0, 1200, 800);
		
		GridLayout gridLayout = new GridLayout(2,1);
		JPanel bigPanel = new JPanel();
		bigPanel.setBounds(0, 10, 1200, 800);
		
		DatePersoanaPanel datePersoanaPanel = new DatePersoanaPanel();
		datePersoanaPanel.tfNrCI.setLocation(769, 199);
		datePersoanaPanel.lblNumarCi.setLocation(608, 199);
		datePersoanaPanel.tfSerieCI.setLocation(206, 199);
		datePersoanaPanel.lblSerieCi.setLocation(10, 199);
		DatePersoanaPanel.lblUnitate.setVisible(false); DatePersoanaPanel.tfUnitateDomiciliu.setVisible(false);
		DatePersoanaPanel.lblSubunitate.setVisible(false); DatePersoanaPanel.tfSubunitateDomiciliu.setVisible(false);
		DatePersoanaPanel.lblAdresaResedinta.setVisible(false); DatePersoanaPanel.tfResedintaSolicintant.setVisible(false);
		DatePersoanaPanel.lblUnitate_1.setVisible(false); DatePersoanaPanel.tfUnitateResedinta.setVisible(false);
		DatePersoanaPanel.lblSubunitate_1.setVisible(false); DatePersoanaPanel.tfSubunitateresedinta.setVisible(false);
		DatePersoanaPanel.lblTelefon.setVisible(false); DatePersoanaPanel.tfTelefonSolicitant.setVisible(false);
		DatePersoanaPanel.lblLucratorSaesp.setVisible(false); DatePersoanaPanel.tfLucratorSAESP.setVisible(false);
		
		datePersoanaPanel.setBounds(0, 23, 1200, 244);
		datePersoanaPanel.setLayout(null);
		
		
		DateCererePF dateCererePF = new DateCererePF();
		DateCererePF.lblDomiciliuInAlt.setVisible(false); DateCererePF.domiciliuAltJudetComboBox.setVisible(false);
		DateCererePF.lblNumarCi_1_1_1.setVisible(false); DateCererePF.resedintaAltJudetComboBox.setVisible(false);
		DateCererePF.lblNumarCi_1_1_1_1.setVisible(false); DateCererePF.armaLaDomiciliuComboBox.setVisible(false);
		DateCererePF.btnSuspendaLucrare.setVisible(false);
		dateCererePF.setBounds(0, 291, 1200, 509);
		dateCererePF.setLayout(null);
		bigPanel.setLayout(null);
		
		bigPanel.add(datePersoanaPanel);
		bigPanel.add(dateCererePF);
		
		add(bigPanel);
	}
}
