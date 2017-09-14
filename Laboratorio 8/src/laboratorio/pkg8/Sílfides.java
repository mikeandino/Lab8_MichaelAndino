package laboratorio.pkg8;

public class Sílfides extends Hadas{
    private int alas;
    
    public Sílfides() {
        super();
    }

    public Sílfides(String nombre, int edad, double salud, int estatura, int poder) {
        super(nombre, edad, salud, estatura, poder);
    }

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    @Override
    public String toString() {
        return "S\u00edlfides{" + "alas=" + alas + '}';
    }
    
}
