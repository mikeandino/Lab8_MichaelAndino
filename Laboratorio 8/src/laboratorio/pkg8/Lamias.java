package laboratorio.pkg8;

public class Lamias extends Hadas{
    private int aleta;
    private int branquias;
    public Lamias() {
        super();
    }

    public Lamias(int aleta, int branquias, String nombre, int edad, double salud, int estatura, int poder) {
        super(nombre, edad, salud, estatura, poder);
        this.aleta = aleta;
        this.branquias = branquias;
    }

    public int getAleta() {
        return aleta;
    }

    public void setAleta(int aleta) {
        this.aleta = aleta;
    }

    public int getBranquias() {
        return branquias;
    }

    public void setBranquias(int branquias) {
        this.branquias = branquias;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
