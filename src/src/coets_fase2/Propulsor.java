package coets_fase2;

public class Propulsor {
	
	private int numpropulsores;
	private int potencia;

	public Propulsor() {		
	}

	public Propulsor(int potencia) {		
		this.potencia = potencia;
	}

	/**
	 * @return the potencia
	 */
	public int getPotencia() {
		return potencia;
	}

	/**
	 * @param potencia the potencia to set
	 */
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getNumpropulsores() {
		return numpropulsores;
	}

	public void setNumpropulsores(int numpropulsores) {
		this.numpropulsores = numpropulsores;
	}
	
	

}
