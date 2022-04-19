public class ProduciDatoRaddopiato extends Thread{
    Semaforo pieno;
    Semaforo vuoto;
    int tanti = 5;
    final int attesa = 500;
    public ProduciDatoRaddopiato(Semaforo s1, Semaforo s2){
        pieno = s1;
        vuoto= s2;
    }

    public void run() {
        for (int k = 0; k < tanti; k++) {
            vuoto.P();
            ProdConsSem.buffer = k*2;
            System.out.println("scrittore: dato scritto raddopiato :" + k*2);
            pieno.V();
            try {Thread.sleep(attesa);
            } catch (Exception e) {
            }
            System.out.println("scrittore: terine scrittura dati raddopiato.");
        }
    }
}
