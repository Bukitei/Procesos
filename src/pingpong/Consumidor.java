package pingpong;
public class Consumidor extends Thread {
    private Cola cola;
    private int n;

    public Consumidor(Cola c, int n) {
        cola = c;
        this.n = n;
    }

    public void run() {
        int valor = 0;
        while(true) {
            valor = cola.get(); //recoge el n�mero
            //System.out.print("PING ");
        }
    }
}
