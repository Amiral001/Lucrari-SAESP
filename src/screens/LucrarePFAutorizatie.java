package screens;

import java.awt.GridLayout;

import javax.swing.JPanel;

public class LucrarePFAutorizatie extends JPanel {

	
	public LucrarePFAutorizatie() {
		
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
		DatePersoanaPanel.lblLucratorSaesp.setVisible(false); DatePersoanaPanel.tfLucratorSAESP.setVisible(false);
		DatePersoanaPanel.lblSubunitate.setVisible(false); DatePersoanaPanel.tfSubunitateDomiciliu.setVisible(false);
		DatePersoanaPanel.lblUnitate.setVisible(false); DatePersoanaPanel.tfUnitateDomiciliu.setVisible(false);
		DatePersoanaPanel.lblAdresaResedinta.setVisible(false); DatePersoanaPanel.tfResedintaSolicintant.setVisible(false);
		DatePersoanaPanel.lblUnitate_1.setVisible(false); DatePersoanaPanel.tfUnitateResedinta.setVisible(false);
		DatePersoanaPanel.lblSubunitate_1.setVisible(false); DatePersoanaPanel.tfSubunitateresedinta.setVisible(false);
		DatePersoanaPanel.lblTelefon.setVisible(false); DatePersoanaPanel.tfTelefonSolicitant.setVisible(false);
		
		datePersoanaPanel.setBounds(0, 11, 1200, 243);
		datePersoanaPanel.setLayout(null);
		
		
		DateCererePF dateCererePF = new DateCererePF();
		dateCererePF.btnFinalizareLucrare.setLocation(10, 199);
		DateCererePF.lblNumarCi_1_1.setVisible(false); DateCererePF.regimCerereComboBox.setVisible(false);
		DateCererePF.lblDomiciliuInAlt.setVisible(false); DateCererePF.domiciliuAltJudetComboBox.setVisible(false);
		DateCererePF.lblNumarCi_1_1_1.setVisible(false); DateCererePF.resedintaAltJudetComboBox.setVisible(false);
		DateCererePF.lblNumarCi_1_1_1_1.setVisible(false); DateCererePF.armaLaDomiciliuComboBox.setVisible(false);
		DateCererePF.btnSuspendaLucrare.setVisible(false); DateCererePF.btnVerificari.setVisible(false);
		dateCererePF.setBounds(0, 265, 1200, 535);
		dateCererePF.setLayout(null);
		bigPanel.setLayout(null);
		
		bigPanel.add(datePersoanaPanel);
		bigPanel.add(dateCererePF);
		
		add(bigPanel);
	}

}
