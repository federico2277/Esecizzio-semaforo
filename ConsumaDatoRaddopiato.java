class ConsumaDatoRaddopiato extends Thread{
    Semaforo pieno;
    Semaforo vuoto;
    int dato;
    public ConsumaDatoRaddopiato(Semaforo s1,Semaforo s2){
    pieno = s1;
    vuoto = s2;
    }
    public void run(){
        while (true) {
            pieno.P();
            dato = ProdConsSem.buffer;
            System.out.println("Lettore: dato letto raddoppiato:" + dato*2);
            vuoto.V();
        }
    }
    }