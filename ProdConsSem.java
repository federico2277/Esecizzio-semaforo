public class ProdConsSem {
    protected static int buffer;
    public static void main(String[] args) {
        Semaforo pieno = new Semaforo(20);
        Semaforo vuoto = new Semaforo(20);
        ProduciDato prod = new ProduciDato(pieno , vuoto);
        ProduciDato cons = new ProduciDato(pieno , vuoto);
        prod.start();
        cons.start();
        System.out.println("Lettore:dato letto");
    }
}