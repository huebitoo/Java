package Java.UNIVERSIDAS.Listado_4;

public class Ejercicio40 {
    public static void main(String[] args) {
        
    }
}
// Codigo


class CreaYPruebaBebida {
    public static void pruebaVeSerieBebe(int que, int serie){
        Bebida b=null;
        switch (que){
            case 1:  b = new Sprite(42); break;
            case 2:  b = new Fanta(42); break;
            case 3:  b = new Kem(42); break;
            case 4:  b = new CocaCola(42); break;
            default: return;
        }
        System.out.println(b.getSerie()+": "+b.beber());  
    }
}

abstract class Bebida {
    private int numero_serie;

    public Bebida(int a){
        this.numero_serie = a;
    }

    public int getSerie(){
        return this.numero_serie;
    }
    
    public abstract String beber();
    
}


class Sprite extends Bebida{
    public Sprite(int a){
        super(a);
    }

    public String beber(){
        return "sprite";
    }

}

class CocaCola extends Bebida{
    public CocaCola(int a){
        super(a);
    }

    public String beber(){
        return "cocacola";
    }

}

class Kem extends Bebida{
    public Kem(int a){
        super(a);
    }

    public String beber(){
        return "kem";
    }
}

class Fanta extends Bebida{
    public Fanta(int a){
        super(a);
    }

    public String beber(){
        return "fanta";
    }

}