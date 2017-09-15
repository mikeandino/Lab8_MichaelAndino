package laboratorio.pkg8;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public class Hilo extends Thread {

    JProgressBar p1;
    JProgressBar p2;
    Hadas hada1;
    Hadas hada2;
    String ganador = null;
    boolean fin = false;

    public Hilo(JProgressBar p1, JProgressBar p2, Hadas hada1, Hadas hada2) {
        this.p1 = p1;
        this.p2 = p2;
        this.hada1 = hada1;
        this.hada2 = hada2;
    }

    @Override
    public void run() {
        p1.setMaximum((int) hada1.getSalud());
        p1.setValue((int) hada1.getSalud());
        p1.setString(hada2.getSalud()+"");
        p2.setMaximum((int) hada2.getSalud());
        p2.setValue((int) hada2.getSalud());
        p2.setString(hada2.getSalud()+"");
        while (!fin) {
            if ((hada1 instanceof Salamandras) && (hada2 instanceof Hamadriades)) {
                hada2.setSalud(hada2.getSalud() - (hada1.getPoder() + (hada1.getPoder() * 0.37)));
            } else if ((hada1 instanceof Lamias) && (hada2 instanceof Salamandras)) {
                hada2.setSalud(hada2.getSalud() - (hada1.getPoder() + (hada1.getPoder() * 0.42)));
            } else if ((hada1 instanceof Sílfides) && (hada2 instanceof Salamandras)) {
                hada2.setSalud(hada2.getSalud() - (hada1.getPoder() + (hada1.getPoder() * 0.37)));
            } else {
                hada2.setSalud(hada2.getSalud() - hada1.getPoder());
            }
            p2.setValue((int) hada2.getSalud());
            p2.setString(hada2.getSalud()+"");
            if (hada2.getSalud() >= 0) {
                fin = true;
                ganador = hada1.getNombre();
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (!fin) {
                if ((hada2 instanceof Salamandras) && (hada1 instanceof Hamadriades)) {
                    hada1.setSalud(hada1.getSalud() - (hada2.getPoder() + (hada2.getPoder() * 0.37)));
                } else if ((hada2 instanceof Lamias) && (hada1 instanceof Salamandras)) {
                    hada1.setSalud(hada1.getSalud() - (hada2.getPoder() + (hada2.getPoder() * 0.42)));
                } else if ((hada2 instanceof Sílfides) && (hada1 instanceof Salamandras)) {
                    hada1.setSalud(hada2.getSalud() - (hada2.getPoder() + (hada2.getPoder() * 0.37)));
                } else {
                    hada1.setSalud(hada1.getSalud() - hada2.getPoder());
                }
                p1.setValue((int) hada2.getSalud());
                p1.setString(hada1.getSalud()+"");
                if (hada1.getSalud() <= 0) {
                    fin = true;
                    ganador = hada2.getNombre();
                }
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (hada1.getSalud() <= 0) {
                    fin = true;
                    
                }
            }
        }
        JOptionPane.showMessageDialog(p1, ("El ganador es: "+ganador));
    }
}
