public class Liebre {
    private int puesto;
    private boolean ganador = false;
    public Liebre(int puesto){
        this.puesto = puesto;
    }

    public synchronized void duerme() throws InterruptedException{
        Thread.sleep(1000);
        notifyAll();
    }
    public synchronized void Saltogrande() throws InterruptedException{
        Thread.sleep(1000);
        puesto = puesto + 9;
        notifyAll();
    }
    public synchronized void SaltoChico() throws InterruptedException{
        Thread.sleep(1000);
        puesto = puesto + 1;
        notifyAll();
    }
    public synchronized void ResbalonGrande() throws InterruptedException{
        Thread.sleep(1000);
        puesto = puesto - 12;
        if(puesto < 1){
            puesto = 1;
        }
        notifyAll();
    }
    public synchronized void ResbalonChico() throws InterruptedException{
        Thread.sleep(1000);
        puesto = puesto - 2;
        if(puesto < 1){
            puesto = 1;
        }
        notifyAll();
    }

    public synchronized int get() {
        notifyAll();
        return puesto;
    }

    public synchronized boolean getWinner(){
        if(puesto >= 70){
            ganador = true;
        }
        return ganador;
    }
}

