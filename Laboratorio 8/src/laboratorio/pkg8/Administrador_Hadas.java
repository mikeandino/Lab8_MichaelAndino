package laboratorio.pkg8;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;

public class Administrador_Hadas {

    private File archivo = null;
    private ArrayList<Hadas> lista = new ArrayList<>();

    public Administrador_Hadas() {
    }

    public Administrador_Hadas(String path) {
        archivo = new File(path);
        cargarArchivo();
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Hadas> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Hadas> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Lista de hadas = " + lista + '}';
    }

    public void setHada(Hadas hada) {
        this.lista.add(hada);
    }

    public void escribirArchivo() throws IOException {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Hadas persona : lista) {
                bw.writeObject(persona);
            }
            bw.flush();
        } catch (Exception e) {
        }
        fw.close();
        bw.close();
    }

    public void cargarArchivo() {
        try {
            lista = new ArrayList();
            Hadas temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Hadas) objeto.readObject()) != null) {
                        lista.add(temp);
                    }
                } catch (EOFException e) {
                }
                entrada.close();
                objeto.close();
            }
        } catch (IOException | ClassNotFoundException e) {
        }
    }
}
