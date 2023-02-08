package officina;

import java.util.Objects;

public class Macchina {

	private String targa;
	private String marca;
	private String modello;
	private String cilindrata;
	private boolean guasta;
	
	public Macchina(String targa, String marca, String modello, String cilindrata, boolean guasta) {
		
		setTarga(targa);
		setMarca(marca);
		setModello(modello);
		setCilindrata(cilindrata);
		setGuasta(guasta);
	}

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public String getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(String cilindrata) {
		this.cilindrata = cilindrata;
	}

	public boolean isGuasta() {
		return guasta;
	}

	public void setGuasta(boolean guasta) {
		this.guasta = guasta;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cilindrata, guasta, marca, modello, targa);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Macchina other = (Macchina) obj;
		return Objects.equals(cilindrata, other.cilindrata) && guasta == other.guasta
				&& Objects.equals(marca, other.marca) && Objects.equals(modello, other.modello)
				&& Objects.equals(targa, other.targa);
	}
	
	
}
