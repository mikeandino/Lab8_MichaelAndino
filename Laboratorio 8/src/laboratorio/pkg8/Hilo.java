package laboratorio.pkg8;

import javax.swing.JProgressBar;

public class Hilo extends Thread{
    JProgressBar p1;
    JProgressBar p2;
    Hadas hada1;
    Hadas hada2;

    public Hilo(JProgressBar p1, JProgressBar p2, Hadas hada1, Hadas hada2) {
        this.p1 = p1;
        this.p2 = p2;
        this.hada1 = hada1;
        this.hada2 = hada2;
    }
    
}
