public class Tortuga {
    private int posicion;
    private boolean ganador = false;
    public Tortuga(int posicion){
        this.posicion = posicion;
    }

    public synchronized void AvanceRapido() throws InterruptedException{
        Thread.sleep(1000);
        posicion = posicion + 3;
        notifyAll();
    }
    public synchronized void Resbalon() throws InterruptedException{
        Thread.sleep(1000);
        posicion = posicion - 6;
        if(posicion < 1){
            posicion = 1;
        }
        notifyAll();
    }
    public synchronized void AvanceLento() throws InterruptedException{
        Thread.sleep(1000);
        posicion = posicion + 3;
        notifyAll();
    }
    public synchronized int get() {
        notifyAll();
        return posicion;
    }
    public synchronized boolean getWinner(){
        if(posicion >= 70){
            ganador = true;
        }
        return ganador;
    }
}
