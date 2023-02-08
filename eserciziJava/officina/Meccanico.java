package officina;

import java.util.Objects;

public class Meccanico {

	private Integer matricola;
	private String nome;
	private String cognome;
	private boolean disponibile;
	
	public Meccanico(Integer matricola, String nome, String cognome, boolean disponibile) {
		
		setMatricola(matricola);
		setNome(nome);
		setCognome(cognome);
		setDisponibile(disponibile);
	}

	public Integer getMatricola() {
		return matricola;
	}

	public void setMatricola(Integer matricola) {
		this.matricola = matricola;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public boolean isDisponibile() {
		return disponibile;
	}

	public void setDisponibile(boolean disponibile) {
		this.disponibile = disponibile;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(cognome, disponibile, matricola, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Meccanico other = (Meccanico) obj;
		return Objects.equals(cognome, other.cognome) && disponibile == other.disponibile
				&& Objects.equals(matricola, other.matricola) && Objects.equals(nome, other.nome);
	}
	
	
	
}
