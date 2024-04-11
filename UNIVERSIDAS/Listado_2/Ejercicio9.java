package Java.UNIVERSIDAS.Listado_2;

public class Ejercicio9 {
    public static void main(String[] args) {
        PrimeraClase p = new PrimeraClase("Hola");
        String s = p.getString();
        System.out.println(s);
    }
}
class PrimeraClase{
    private String palabra;
    
    public PrimeraClase(String texto){
        this.palabra = texto;
    }

    public String getString(){
        return palabra;
    }
}

