package laboratorio.pkg8;

public class Lamias extends Hadas{
    private int branquias;
    public Lamias() {
        super();
    }

    public Lamias(int branquias, String nombre, int edad, double salud, int estatura, int poder) {
        super(nombre, edad, salud, estatura, poder);
        this.branquias = branquias;
    }

    public int getBranquias() {
        return branquias;
    }

    public void setBranquias(int branquias) {
        this.branquias = branquias;
    }

    @Override
    public String toString() {
        return "Lamias{" + '}';
    }
    
}
