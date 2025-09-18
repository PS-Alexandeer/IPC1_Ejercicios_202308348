package ejercicio3;

public class SumadorRunnable implements Runnable {
    @Override
    public void run() {
        int suma = 0;
        try {
            for (int i = 1; i <= 10; i++) {
                suma += i;
                System.out.println("Sumando: " + i);
                Thread.sleep(500);
            }
            System.out.println("Total: " + suma);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
