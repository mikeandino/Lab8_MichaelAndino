package laboratorio.pkg8;

public class Salamandras extends Hadas{
    private int alas;

    public Salamandras() {
        super();
    }

    public Salamandras(int alas, String nombre, int edad, double salud, int estatura, int poder) {
        super(nombre, edad, salud, estatura, poder);
        this.alas = alas;
    }

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    @Override
    public String toString() {
        return "Salamandras{" + "alas=" + alas + '}';
    }
    
}
