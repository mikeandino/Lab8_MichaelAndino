package laboratorio.pkg8;

import java.io.Serializable;


public class Hadas implements Serializable{
    protected String nombre;
    protected int edad;
    protected double salud;
    protected int estatura;
    protected int poder;
    private static final long SerialVersionUID = 4224;

    public Hadas() {
    }

    public Hadas(String nombre, int edad, double salud, int estatura, int poder) {
        this.nombre = nombre;
        this.edad = edad;
        this.salud = salud;
        this.estatura = estatura;
        this.poder = poder;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalud() {
        return salud;
    }

    public void setSalud(double salud) {
        this.salud = salud;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    @Override
    public String toString() {
        return "Hadas{" + "nombre=" + nombre + ", edad=" + edad + ", salud=" + salud + ", estatura=" + estatura + ", poder=" + poder + '}';
    }
}
