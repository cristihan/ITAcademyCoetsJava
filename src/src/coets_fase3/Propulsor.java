package coets_fase3;

public class Propulsor {

	private int potenciaActual;
	private int potenciaMaxima;

	/**
	 * 
	 */
	public Propulsor() {

	}

	/**
	 * @param potenciaActual
	 * @param potenciaMaxima
	 * @throws Exception
	 */
	public Propulsor(int potenciaMaxima) throws Exception {
		this.potenciaActual = 0;
		if (potenciaMaxima <= 0)
			throw new Exception("Potencia no valida");
		this.potenciaMaxima = potenciaMaxima;

	}

	/**
	 * @return the potenciaInicial
	 */
	public int getPotenciaInicial() {
		return potenciaActual;
	}

	/**
	 * @return the potenciaMaxima
	 */
	public int getPotenciaMaxima() {
		return potenciaMaxima;
	}

	/**
	 * @param potenciaMaxima the potenciaMaxima to set
	 * @throws Exception
	 */
	public void setPotenciaMaxima(int potenciaMaxima) throws Exception {
		if (potenciaMaxima <= 0)
			throw new Exception("Potencia no valida");
		this.potenciaMaxima = potenciaMaxima;
	}

	public void acelerar(int n) {
		potenciaActual += 10 * n;
		if (potenciaActual >= potenciaMaxima) {
			potenciaActual = potenciaMaxima;
		}
	}

	public void frenar(int n) {
		potenciaActual = potenciaActual - 10 * n;
		if (potenciaActual < 0) {
			potenciaActual = 0;
		}

	}

}
