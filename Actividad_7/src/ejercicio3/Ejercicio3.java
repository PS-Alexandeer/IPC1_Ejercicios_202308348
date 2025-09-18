package ejercicio3;

public class Ejercicio3 {
    public static void main(String[] args) {
        Thread hilo = new Thread(new SumadorRunnable());
        hilo.start();
    }
}
