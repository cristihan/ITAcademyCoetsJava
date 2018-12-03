package coets_fase1;


public class Coet
{
    private String nombre;
    private int numpropulsores;

    public Coet()
    {


    }

    public Coet(String nombre, int numpropulsor) {
        this.nombre = nombre;
        this.numpropulsores = numpropulsor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumpropulsor() {
        return numpropulsores;
    }

    public void setNumpropulsor(Integer numpropulsor) {
        this.numpropulsores = numpropulsor;
    }
}
