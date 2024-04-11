package Java.UNIVERSIDAS.Listado_2;

public class Ejercicio11 {
    public static void main(String[] args) {
        OtraClase puntero = new OtraClase(5);
        int p = puntero.sacaDato();
        System.out.println(p);
    }
}

class OtraClase{
    private int numero;
    public OtraClase(int valor){
        this.numero = valor;
    }
    public int sacaDato(){
        return numero;
    }
}
