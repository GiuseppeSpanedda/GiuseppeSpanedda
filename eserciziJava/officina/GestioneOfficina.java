package officina;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class GestioneOfficina {

	private Map<String, Macchina> veicoli;
	private Map<Integer, Meccanico> meccanici;

	public GestioneOfficina() {

		setVeicoli(new HashMap<>());
		setMeccanici(new HashMap<>());

	}

	public Map<String, Macchina> getVeicoli() {
		return veicoli;
	}

	public void setVeicoli(Map<String, Macchina> veicoli) {
		this.veicoli = veicoli;
	}

	public Map<Integer, Meccanico> getMeccanici() {
		return meccanici;
	}

	public void setMeccanici(Map<Integer, Meccanico> meccanici) {
		this.meccanici = meccanici;
	}

	public void addMacchina(Macchina m) throws MacchinaEsistente {

		if (!getVeicoli().containsValue(m)) {
			getVeicoli().put(m.getTarga(), m);
			System.out.println("Macchina aggiunta.");
		} else {
			throw new MacchinaEsistente();
		}
	}

	public void addMeccanico(Meccanico m) throws MeccanicoEsistente {

		if (!getMeccanici().containsValue(m)) {
			getMeccanici().put(m.getMatricola(), m);
			System.out.println("Meccanico aggiunto.");
		} else {
			throw new MeccanicoEsistente();
		}
	}

	public void removeMacchina(String targa) throws MacchinaInesistente, MacchinaNonRiparata {

			if (getVeicoli().containsKey(targa)) {
				if (!getVeicoli().get(targa).isGuasta()) {
					getVeicoli().remove(targa);
					System.out.println("Macchina Eliminata");
				} else {
					throw new MacchinaNonRiparata();
				}
			} else {
				throw new MacchinaInesistente();
			}
		}
	

	public void stampaMacchineGuaste(){

		for (Entry<String, Macchina> entry : getVeicoli().entrySet()) {
			if (entry.getValue().isGuasta()) {
				System.out.println("Macchina con targa: " + entry.getValue().getTarga() + " guasta.");
			}
		}
	}

	public void stampaMeccaniciDisponibili() {

		for (Entry<Integer, Meccanico> entry : getMeccanici().entrySet()) {
			if (entry.getValue().isDisponibile()) {
				System.out.println("Meccanico con matricola: " + entry.getValue().getMatricola() + " disponibile.");
			} else {

			}
		}
	}

	public void riparaMacchina(String targa, Integer matricola)
			throws MacchinaInesistente, MacchinaGiaRiparata, MeccanicoInesistente {

		if (getVeicoli().containsKey(targa)) {

			if (getVeicoli().get(targa).isGuasta()) {

				if (getMeccanici().containsKey(matricola)) {

					if (getMeccanici().get(matricola).isDisponibile()) {
						getVeicoli().get(targa).setGuasta(false);
						System.out.println("Macchina con targa"+targa+" riparata da: "
						+getMeccanici().get(matricola).getNome());
					} else {
						for (Entry<Integer, Meccanico> entry : getMeccanici().entrySet()) {
							if (entry.getValue().isDisponibile()) {
								getVeicoli().get(targa).setGuasta(false);
								System.out.println("questo meccanico: " + entry.getValue().getNome() + " ha riparato: "
										+ getVeicoli().get(targa));
								break;
							}
						}
					}
				} else {
					throw new MeccanicoInesistente();
				}
			} else {
				throw new MacchinaGiaRiparata();
			}
		} else {
			throw new MacchinaInesistente();
		}

	}

}
