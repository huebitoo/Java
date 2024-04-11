package Java.UNIVERSIDAS.Listado_4;
import java.util.ArrayList;

public class Ejercicio41 {
    public static void main(String[] args) {
        Deposito dep = new Deposito();
        Bebida a = new Sprite(3);
        Bebida b = new Kem(3);
        Bebida c = new Fanta(3);
        Bebida d = new CocaCola(3);
        dep.addBebida(a);
        dep.addBebida(b);
        dep.addBebida(c);
        dep.addBebida(d);
        dep.getBebida();
        dep.getBebida();
        dep.getBebida();
        System.out.println(b.getSerie());
        System.out.println(a.getSerie());
        System.out.println(a.getSerie());
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

class Deposito{
    private ArrayList<Bebida> arr;

    public Deposito(){
        this.arr = new ArrayList<Bebida>();
    }

    public void addBebida(Bebida b){
        this.arr.add(b);
    }

    public Bebida getBebida(){
        if(this.arr.size() != 0){ // El size me devuelve la cantidad de elementos
            return this.arr.remove(0);
        }
        return null;
    }

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
