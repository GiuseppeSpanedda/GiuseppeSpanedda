package officina;

public class TestMain {

	public static void main(String[] args) {
		
		GestioneOfficina g = new GestioneOfficina();
		Macchina macchina1 = new Macchina("CT987TS","Volkswagen","Golf","1900",true);
		Macchina macchina2 = new Macchina("CT562AS","Fiat","Punto","1100",false);
		Meccanico meccanico1 = new Meccanico(123,"Luigi","Murreddu",true);
		Meccanico meccanico2 = new Meccanico(1254,"Filippo","Pilosu",false);
		
		try {
			g.addMacchina(macchina1);
			g.addMacchina(macchina2);
		} catch (MacchinaEsistente e) {
			e.printStackTrace();
		}
		System.out.println();
//--------------------------------------------------------------
		try {
			g.addMeccanico(meccanico1);
			g.addMeccanico(meccanico2);
		}catch(MeccanicoEsistente e) {
			e.printStackTrace();
		}
		System.out.println();
		try {
			g.removeMacchina(macchina2.getTarga());
		} catch (MacchinaInesistente | MacchinaNonRiparata e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
//--------------------------------------------------------------		
    	

		g.stampaMacchineGuaste();

       System.out.println();
//--------------------------------------------------------------
       g.stampaMeccaniciDisponibili();
       System.out.println();
//--------------------------------------------------------------
       try {
		g.riparaMacchina(macchina1.getTarga(), meccanico1.getMatricola());
	} catch (MacchinaInesistente | MacchinaGiaRiparata | MeccanicoInesistente e) {
		e.printStackTrace();
	}
     
}

}
