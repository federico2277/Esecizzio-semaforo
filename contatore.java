public class contatore {
    int valore;
    int passo;
    contatore(int valoe, int passo){
        this.valore = valore;
        this.passo = passo;
        System.out.println("il contatore è nato è vale " + this.getValore());
    }
void incrementa(){
valore += passo;
}
void decrementa(){
    valore -= passo;
}
int getValore(){
    return valore;
}
}