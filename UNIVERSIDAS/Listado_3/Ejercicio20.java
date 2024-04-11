package Java.UNIVERSIDAS.Listado_3;

public class Ejercicio20 {
    public static void main(String[] args) {
        Pelota p=new Pelota(5);
        int s = p.dameTuSerie();
        System.out.println(s);
    }
}
class Pelota{
    private int serie;
    public Pelota(int numero_serie){
        this.serie = numero_serie;
    }
    public int dameTuSerie(){
        return this.serie;
    }


}