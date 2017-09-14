package laboratorio.pkg8;

public class Hamadriades extends Hadas{

    public Hamadriades() {
        super();
    }

    public Hamadriades(String nombre, int edad, double salud, int estatura, int poder) {
        super(nombre, edad, salud, estatura, poder);
    }
    
    public void setSalud(double salud){
        this.salud=salud;
        if (salud<=373) {
            System.out.println("El arbol murio");
        }
    }

    @Override
    public String toString() {
        return nombre;
    }
}
