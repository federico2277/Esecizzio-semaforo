class ConsumaDato extends Thread{
    Semaforo pieno;
    Semaforo vuoto;
    String nome;
    int dato;
    public ConsumaDato (Semaforo s1,Semaforo s2 ,String nome){
    pieno = s1;
    vuoto = s2;
    this.nome = nome;
    }
    
    public void run(){
        while (true) {
            pieno.P();
            dato = ProdConsSem.buffer;
            System.out.println("Lettore: letto il dato " + dato);
            vuoto.V();
        }
    }
    }