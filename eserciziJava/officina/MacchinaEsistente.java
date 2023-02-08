package officina;

public class MacchinaEsistente extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5356189488884895587L;

	@Override
	public String getMessage() {
		
		return "Macchina già presente";
	}
}
