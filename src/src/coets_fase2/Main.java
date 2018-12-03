package coets_fase2;

import coets_fase3.Coet;

public class Main {
    public static void main(String[] args) throws Exception {
    	
    	
    	/*1. Creem dos coets amb els codis “32WESSDS” I “LDSFJA32”. El primer coet tindrà
		 * tres propulsors (potència: 10,30,80) i el segon sis propulsors (potència:
		 * 30,40,50,50,30,10).
		 */
		 
		System.out.println("1.- Creem dos coets");
		Coet coet1 = new Coet();
		coet1.setNom("32WESSDS");
		coet1.addPropulsor(10);
		coet1.addPropulsor(30);
		coet1.addPropulsor(50);
		
		Coet coet2 = new Coet();
		coet2.setNom("LDSFJA32");
		coet2.addPropulsor(30);
		coet2.addPropulsor(40);
		coet2.addPropulsor(50);		
		coet2.addPropulsor(50);
		coet2.addPropulsor(30);
		coet2.addPropulsor(10);  
		
		
		System.out.println("2. Mostrar a pantalla el codi dels coets , el número de propulsors que té"
				+ " i la potència màxima de cada propulsor.");
		System.out.println("El codi del coet 1: " + coet1.getNom()
		+ " Numeros de propulsores " + coet1.getNumPropulsors() + " Potencia Maxima: " + coet1.getMaximaPotencia());
		
		System.out.println("El codi del coet 2: " + coet2.getNom()
		+ " Numeros de propulsores " + coet2.getNumPropulsors() + " Potencia Maxima: " + coet2.getMaximaPotencia());
		
        
      
        
       
        	
			
    }	
    
}
