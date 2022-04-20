public class ProduciDatoRaddopiato extends Thread{
    Semaforo pieno;
    Semaforo vuoto;
    int tanti = 24;
    final int attesa = 500;
    String nome;
    public ProduciDatoRaddopiato(Semaforo s1, Semaforo s2, String nome){
        pieno = s1;
        vuoto = s2;
        this.nome = nome;
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
