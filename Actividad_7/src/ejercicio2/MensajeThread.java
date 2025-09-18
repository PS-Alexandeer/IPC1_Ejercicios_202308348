package ejercicio2;

public class MensajeThread extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("Este es un mensaje desde un hilo");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
