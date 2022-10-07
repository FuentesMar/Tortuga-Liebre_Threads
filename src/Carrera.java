public class Carrera {

    //Admitir las clases tortuga y liebre para la carrera
    static Tortuga T = new Tortuga(1);
    static Liebre L = new Liebre(1);

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Inicia la carrera");

        boolean fin = false;
        while(!fin){

            int n = (int) (Math.random()*(100)+1);

            int T1 = n;
            int T2 = n;

            TL(T1);
            TT(T2);

            int MovimientoTortuga = (int) T.get();
            int MoviemientoLiebre = (int) L.get();


            // "Animacion de la carrera"
            for(int i = 0; i < MovimientoTortuga; i++){
                System.out.print(" ");
            }
            System.out.println("T");
            for(int i = 0; i < MoviemientoLiebre; i++){
                System.out.print(" ");
            }
            System.out.println("L");

            //Descicion de ganador
            boolean ganador1 = (boolean)T.getWinner();
            boolean ganador2 = (boolean)L.getWinner();

            if(ganador1 && ganador2){
                System.out.println("Empate");
                fin = true;
            }
            if(ganador1){
                System.out.println("Ha ganado la tortuga");
                fin = true;

            }
            if(ganador2){
                System.out.println("Ha ganado la Liebre");
                fin = true;
            }
        }
    }
    public static void TL(int porcentaje) throws InterruptedException {
        if(porcentaje >= 1 && porcentaje < 21){
            L.duerme();
        }
         if(porcentaje >= 21 && porcentaje < 41){
            L.Saltogrande();
        }
         if(porcentaje >= 41 && porcentaje < 51){
            L.ResbalonGrande();
        }
         if(porcentaje >= 51 && porcentaje < 81){
            L.SaltoChico();
        }
        if(porcentaje >= 81 && porcentaje <=100){
            L.ResbalonChico();
        }
    }
    public static void TT(int porcentaje) throws InterruptedException{
        if(porcentaje >= 1 && porcentaje < 51){
            T.AvanceRapido();
        }
        if(porcentaje >= 51 && porcentaje < 71) {
            T.Resbalon();
        }
        if(porcentaje >=71 && porcentaje <=100){
            T.AvanceLento();
        }
    }
}
