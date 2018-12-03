package coets_fase3;



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
		
		/* 2. Mostrar a pantalla el codi dels coets, el número de propulsors que té i la potència
		 * màxima de cada propulsor.
		 * */
		System.out.println("2. Mostrar a pantalla el codi dels coets, el número de propulsors que té i la potència\r\n" + 
				"		  màxima de cada propulsor.");
		System.out.println("El codi del coet 1: " + coet1.getNom()
		+ " Numeros de propulsores " + coet1.getNumPropulsors() + " Potencia Maxima: " + coet1.getMaximaPotencia());
		
		System.out.println("El codi del coet 2: " + coet2.getNom()
		+ " Numeros de propulsores " + coet2.getNumPropulsors() + " Potencia Maxima: " + coet2.getMaximaPotencia());
		
		
		/*
		 * 3. Mostrar a pantalla la velocitat actual dels coets
		 */
		System.out.println("3. Mostrar a pantalla la velocitat actual dels coets----");
		System.out.println("La velocidad actual del coet 1: " + coet1.getPotenciaActual());
		System.out.println("La velocidad actual del coet 2: " + coet2.getPotenciaActual());
		
		/*
		 * 4. Accelerar amb els coets tres cops
		 */
		System.out.println(" 4. Accelerar amb els coets tres cops---------");
		coet1.acelerar(3);
		coet2.acelerar(3);
		
		/*
		 * 5. Mostrar a pantalla la velocitat actual
		 */
		System.out.println("5. Mostrar a pantalla la velocitat actual--------");
		System.out.println(" la velocidad actual del coet 1 habiendo acelerado tres veces es : " + coet1.getPotenciaActual());
		System.out.println(" la velocidad actual del coet 1 habiendo acelerado tres veces es : " + coet2.getPotenciaActual());
		
		/*
		 * 6. Frenar cinc cops amb el primer coet (“32WESSDS”) i accelerar set amb el segon coet.
		 */
		
		System.out.println("6. Frenar cinc cops amb el primer coet (“32WESSDS”) i accelerar set amb el segon coet.");
		coet1.frenar(5);
		coet2.acelerar(7);
		
		/*
		 * 7. Mostrar a pantalla la velocitat actual
		 */
		
		System.out.println("7. Mostrar a pantalla la velocitat actual--------");
		System.out.println(" la velocidad actual del coet 1 habiendo frenado cinco veces es : " + coet1.getPotenciaActual());
		System.out.println(" la velocidad actual del coet 2 habiendo acelerado siete veces es : " + coet2.getPotenciaActual());
		
		/*
		 * 8. Accelerar 15 cops amb els dos coets.
		 */
		System.out.println("8. Accelerar 15 cops amb els dos coets.");
		coet1.acelerar(15);
		coet2.acelerar(15);
		
		/*
		 * 9. Mostrar a pantalla la velocitat actual
		 */
		
		System.out.println("9. Mostrar a pantalla la velocitat actual--------");
		System.out.println(" la velocidad actual del coet 1 habiendo acelerado 15 veces es : " + coet1.getPotenciaActual());
		System.out.println(" la velocidad actual del coet 2 habiendo acelerado 15 veces es : " + coet2.getPotenciaActual());

	}

}
