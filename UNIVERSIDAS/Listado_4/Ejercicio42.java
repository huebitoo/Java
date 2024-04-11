package Java.UNIVERSIDAS.Listado_4;
import java.util.ArrayList;

public class Ejercicio42 {
    public static void main(String[] args) {
        Deposito d1=new Deposito( );
        Deposito d2=new Deposito( );
        Deposito d3=new Deposito( );
        Deposito d4=new Deposito( );
        d1.addBebida(new CocaCola(13));
        d1.addBebida(new CocaCola(14));
        d1.addBebida(new CocaCola(15));
        d2.addBebida(new Kem(26));
        d2.addBebida(new Kem(27));
        d2.addBebida(new Kem(28));
        d3.addBebida(new Fanta(39));
        d3.addBebida(new Fanta(40));
        d4.addBebida(new Sprite(52));
        d4.addBebida(new Sprite(53));
        d4.addBebida(new Sprite(54));
        d4.addBebida(new Sprite(55));
        Bebida b = d1.getBebida();
        if(b!=null) System.out.println(b.getSerie()+", "+b.beber());
    }
}


class Bebida {
    private int numero_serie;

    public Bebida(int a){
        this.numero_serie = a;
    }

    public int getSerie(){
        return this.numero_serie;
    }


    public String beber(){
        return "sabor: ";
    }
    
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
        return super.beber() + "sprite";
    }

}

class CocaCola extends Bebida{
    public CocaCola(int a){
        super(a);
    }

    public String beber(){
        return super.beber() + "cocacola";
    }

}

class Kem extends Bebida{
    public Kem(int a){
        super(a);
    }

    public String beber(){
        return super.beber() + "kem";
    }
}

class Fanta extends Bebida{
    public Fanta(int a){
        super(a);
    }

    public String beber(){
        return super.beber() + "fanta";
    }

}
