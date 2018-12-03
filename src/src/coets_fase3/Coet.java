package coets_fase3;

import java.util.ArrayList;
import java.util.List;

public class Coet {

	private String nom;	
	// private int maximaPotencia;
	private List<Propulsor> propulsors;

	/**
	 * 
	 */
	public Coet() {
		this.propulsors = new ArrayList<Propulsor>();
	}

	/**
	 * @param nom
	 * @param potencia
	 * @throws Exception 
	 */
	public Coet(String nom) throws Exception {
		if(nom.length() != 8)
			throw new Exception("nombre coet no valido");
		this.nom = nom;
		//this.numPropulsors = propulsores.size();

	}

	/**
	 * @return the numPropulsors
	 */
	public int getNumPropulsors() {
		return propulsors.size();
		// return numPropulsors = propulsors.size();
	}

	

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 * @throws Exception 
	 */
	public void setNom(String nom) throws Exception {
		if(nom.length() != 8)
			throw new Exception("nombre coet no valido");
		this.nom = nom;
	}

	/**
	 * @return the propulosrs
	 */
	public List<Propulsor> getPropulosrs() {
		return propulsors;
	}
	

	/**
	 * encapsulamiento
	 * 
	 * @throws Exception
	 */
	public void addPropulsor(int potencia) throws Exception {
		Propulsor propulsor = new Propulsor(potencia);
		this.propulsors.add(propulsor);

	}

	/*
	 * 
	 */
	public void acelerar(int acelerar) {
		for (Propulsor propulsor : propulsors) {
			propulsor.acelerar(acelerar);
		}
	}

	public void frenar(int frenar) {
		for (Propulsor propulsor : propulsors) {
			propulsor.frenar(frenar);
		}
	}

//	public int getMaximaPotencia() {
//	for (Propulsor p : propulosrs) {
//		maximaPotencia = maximaPotencia + p.getPotenciaMaxima();
//	}
//	return maximaPotencia;
//}
//

	public List<Integer> getMaximaPotencia() {
		List<Integer> llistaPotencia = new ArrayList<>();
		for (Propulsor p : propulsors)
			llistaPotencia.add(p.getPotenciaMaxima());

		return llistaPotencia;
	}

	public List<Integer> getPotenciaActual1() {
		List<Integer> llistaPotenciaActual = new ArrayList<>();
		for (Propulsor p : propulsors)
			llistaPotenciaActual.add(p.getPotenciaMaxima());

		return llistaPotenciaActual;
	}

	public int getPotenciaActual() {
		int potenciaInicial = 0;
		for (Propulsor p : propulsors) {			
			potenciaInicial = potenciaInicial + p.getPotenciaInicial();
		}
		return potenciaInicial;

	}

}
