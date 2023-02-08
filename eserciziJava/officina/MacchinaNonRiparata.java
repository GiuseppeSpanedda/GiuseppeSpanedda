package officina;

public class MacchinaNonRiparata extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4792589157755680891L;

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "La macchina in questione non è stata ancora riparata";
	}

	
	
}
