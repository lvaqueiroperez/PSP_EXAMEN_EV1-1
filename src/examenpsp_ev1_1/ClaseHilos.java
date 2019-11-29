package examenpsp_ev1_1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ClaseHilos extends Thread {

    public ClaseHilos(String nombre) {

        super(nombre);

    }

    @Override
    public void run() {

        for (int i = 0; i < 25; i++) {

            System.out.println(i + ". " + getName());

            try {
                sleep((int) (Math.random() * (500 - 600) + 600));
            } catch (InterruptedException ex) {
                Logger.getLogger(ClaseHilos.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        System.out.println("TERMINA HILO: " + getName());

    }

}
