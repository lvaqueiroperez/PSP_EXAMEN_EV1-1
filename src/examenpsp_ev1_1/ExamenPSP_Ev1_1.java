package examenpsp_ev1_1;

public class ExamenPSP_Ev1_1 extends Thread {

    public static void main(String[] args) throws InterruptedException {

        ClaseHilos h1 = new ClaseHilos("HILO1");
        ClaseHilos h2 = new ClaseHilos("HILO2");
        ClaseHilos h3 = new ClaseHilos("HILO3");

        h1.start();

        h2.start();

        h3.start();
        //hasta que termine este hilo el programa principal no prodrá acabar
        //(no afecta al orden en el que se muestran los demás hilos)
        h3.join();

        System.out.println("TERMINA PROGRAMA PRINCIPAL");

    }

}
