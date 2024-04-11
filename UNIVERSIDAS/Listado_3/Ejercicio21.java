package Java.UNIVERSIDAS.Listado_3;

public class Ejercicio21 {
    public static void main(String[] args) {
        EnvaseCarton ec = new EnvaseCarton();
        Pelota p1=new Pelota(23);
        Pelota r1 = ec.metePelota(p1);
        if(p1==r1)System.out.println("NO entro"+": "+p1.dameTuSerie());
        else System.out.println("SI entro"+": "+p1.dameTuSerie());
        Pelota p2=new Pelota(62);
        Pelota r2 = ec.metePelota(p2);
        if(p2==r2)System.out.println("NO entro"+": "+p2.dameTuSerie());
        else System.out.println("SI entro"+": "+p2.dameTuSerie());
        Pelota saca1 = ec.damePelota();
        if(saca1!=null)System.out.println(saca1.dameTuSerie());
        else System.out.println(saca1);
        Pelota saca2 = ec.damePelota();
        if(saca2!=null)System.out.println(saca2.dameTuSerie());
        else System.out.println(saca2);
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
class EnvaseCarton{
    private Pelota pel;
    private Pelota pel2;
    
    public EnvaseCarton(){
        this.pel = null;
    }

    Pelota metePelota(Pelota p){
        if(this.pel == null){
            this.pel = p;
            return null;
        } else{
            return p;
        }
    }

    Pelota damePelota(){
        if(this.pel == null){
            return null;
        }
        else {
            this.pel2 = this.pel;
            this.pel = null;
            return this.pel2;
        }
    }
}