package Ejercicio3;

public class ClaseParte2 {

    public static void main(String[] args) {
        Coche Micoche = new Coche();
        Micoche.IncrementarPuertas();

        System.out.println(Micoche.Puertas);

    }

}

class Coche {
    public int Puertas = 5;

    public void IncrementarPuertas() {
        this.Puertas++;

    }
}



