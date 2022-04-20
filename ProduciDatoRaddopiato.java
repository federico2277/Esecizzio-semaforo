public class ProduciDatoRaddopiato extends Thread{
    Semaforo pieno;
    Semaforo vuoto;
    int tanti = 5;
    final int attesa = 500;
    String nome;
    boolean monetina = false;
    public ProduciDatoRaddopiato(Semaforo s1, Semaforo s2, String nome,boolean monetina ) {
        pieno = s1;
        vuoto = s2;
        this.nome = nome;
        this.monetina = monetina;
    }
    public void run() {
        for (int k = 0; k < tanti; k++) {
            vuoto.P();
            ProdConsSem.buffer = k*2;
            System.out.println("scrittore: dato scritto raddopiato :" + k*2);
            System.out.println("il nome del produttore è " + nome);
            pieno.V();
            try {Thread.sleep(attesa);
            } catch (Exception e) {
            }
            System.out.println("scrittore: terine scrittura dati raddopiato.");
        }
    }
}
