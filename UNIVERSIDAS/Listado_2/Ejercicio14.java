package Java.UNIVERSIDAS.Listado_2;

public class Ejercicio14 {
    public static void main(String[] args) {
        Promediador p = new Promediador();
        p.agregaNumero(3);
        System.out.println(p.promedio());
        System.out.println(p.numero());
    }
}

class Promediador{
    private int s; // Suma
    private int n; // Numeros agregados
    
    public Promediador(){
        s = 0;
        n = 0;
    }

    public void agregaNumero(int suma){
        s = s + suma;
        n++;
    }

    public float promedio(){
        return (float)s/(float)n;
    }

    public int numero(){
        return n;
    }

}