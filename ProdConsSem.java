public class ProdConsSem {
    protected static int buffer;
    
    public static void main(String[] args) {
        Semaforo pieno = new Semaforo(0);
        Semaforo vuoto = new Semaforo(1);
        ProduciDato prod = new ProduciDato(pieno , vuoto);
        ProduciDatoRaddopiato prodRaddopiato = new ProduciDatoRaddopiato(pieno , vuoto, "Gioorgiaa", false);
        ConsumaDato cons = new ConsumaDato(pieno , vuoto, "Barrrbaraaa");
        ConsumaDatoRaddopiato consRaddopiato = new ConsumaDatoRaddopiato(pieno, vuoto);
        prod.start();
        prodRaddopiato.start();
        cons.start();
        consRaddopiato.start();
        System.out.println("Main: termine avvio thred ");
        
    }
}