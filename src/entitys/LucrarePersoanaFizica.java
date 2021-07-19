package entitys;

public class LucrarePersoanaFizica extends Lucrare {

	private String tipLucrare, letalaNeletala, lungaScurta, destinatieArma, regimCerere, domiciliulAltJudet,
			resedintaAltJudet, armaLaDomiciliu;

	private PersoanaFizica persoanaFizica;

	public LucrarePersoanaFizica() {
	}



	public LucrarePersoanaFizica(String tipLucrare, String letalaNeletala, String lungaScurta, String destinatieArma,
			String regimCerere, String domiciliulAltJudet, String resedintaAltJudet, String armaLaDomiciliu,
			PersoanaFizica persoanaFizica) {
		super();
		this.tipLucrare = tipLucrare;
		this.letalaNeletala = letalaNeletala;
		this.lungaScurta = lungaScurta;
		this.destinatieArma = destinatieArma;
		this.regimCerere = regimCerere;
		this.domiciliulAltJudet = domiciliulAltJudet;
		this.resedintaAltJudet = resedintaAltJudet;
		this.armaLaDomiciliu = armaLaDomiciliu;
		this.persoanaFizica = persoanaFizica;
	}
	
	



	public PersoanaFizica getPersoanaFizica() {
		return persoanaFizica;
	}



	public void setPersoanaFizica(PersoanaFizica persoanaFizica) {
		this.persoanaFizica = persoanaFizica;
	}



	public String getTipLucrare() {
		return tipLucrare;
	}

	public void setTipLucrare(String tipLucrare) {
		this.tipLucrare = tipLucrare;
	}

	public String getLetalaNeletala() {
		return letalaNeletala;
	}

	public void setLetalaNeletala(String letalaNeletala) {
		this.letalaNeletala = letalaNeletala;
	}

	public String getLungaScurta() {
		return lungaScurta;
	}

	public void setLungaScurta(String lungaScurta) {
		this.lungaScurta = lungaScurta;
	}

	public String getDestinatieArma() {
		return destinatieArma;
	}

	public void setDestinatieArma(String destinatieArma) {
		this.destinatieArma = destinatieArma;
	}

	public String getRegimCerere() {
		return regimCerere;
	}

	public void setRegimCerere(String regimCerere) {
		this.regimCerere = regimCerere;
	}

	public String getDomiciliulAltJudet() {
		return domiciliulAltJudet;
	}

	public void setDomiciliulAltJudet(String domiciliulAltJudet) {
		this.domiciliulAltJudet = domiciliulAltJudet;
	}

	public String getResedintaAltJudet() {
		return resedintaAltJudet;
	}

	public void setResedintaAltJudet(String resedintaAltJudet) {
		this.resedintaAltJudet = resedintaAltJudet;
	}

	public String getArmaLaDomiciliu() {
		return armaLaDomiciliu;
	}

	public void setArmaLaDomiciliu(String armaLaDomiciliu) {
		this.armaLaDomiciliu = armaLaDomiciliu;
	}



	@Override
	public String toString() {
		return "LucrarePersoanaFizica [tipLucrare=" + tipLucrare + ", letalaNeletala=" + letalaNeletala
				+ ", lungaScurta=" + lungaScurta + ", destinatieArma=" + destinatieArma + ", regimCerere=" + regimCerere
				+ ", domiciliulAltJudet=" + domiciliulAltJudet + ", resedintaAltJudet=" + resedintaAltJudet
				+ ", armaLaDomiciliu=" + armaLaDomiciliu + ", persoanaFizica=" + persoanaFizica + "]";
	}
	
	

}
