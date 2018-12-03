package coets_fase2;

import java.util.ArrayList;
import java.util.List;

public class Coet {

    private String nom;
    private List<Propulsor> Propulsores;
    
    public Coet() {
        this.Propulsores = new ArrayList<Propulsor>();
    }

    public Coet(String nom, List<Integer> propulsores) {
        this.nom = nom;
        this.Propulsores.size();
    }

    public String getNom() {
        return nom;
    }
    
    public int getNumPropulsores() {
    	return Propulsores.size();
    }

    /**
	 * @return the propulsores
	 */
	public List<Propulsor> getPropulsores() {
		return Propulsores;
	}

	/**
	 * @param propulsores the propulsores to set
	 */
	public void setPropulsores(List<Propulsor> propulsores) {
		Propulsores = propulsores;
	}

	public void setNom(String nom) {
        this.nom = nom;
    }

    

    public void addPropulsors(int potencia) {
    	Propulsor propulsor = new Propulsor(potencia);
    	this.Propulsores.add(propulsor);
    }
    
    //public void addPropulsor(Propulsor potencia){
        //this.Propulsores.add(potencia);
    //}

    public void setNumPropulsor(List<Propulsor> potencia) {
        this.Propulsores = potencia;
    }
}
