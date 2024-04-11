package Java.UNIVERSIDAS.Listado_3;

import java.util.ArrayList;

public class Ejercicio26 {
    public static void main(String[] args) {        
        Deposito d = new Deposito();
        d.addBebida(new Bebida(1));
        d.getBebida();
        d.addBebida(new Bebida(2));
        d.getBebida();
        d.addBebida(new Bebida(3));
        d.getBebida();

    }
}

class Deposito{
    private ArrayList<Bebida> a;

    public Deposito(){
        this.a = new ArrayList<Bebida>();
    }  

    public void addBebida(Bebida b){
        this.a.add(b);
    }

    public Bebida getBebida(){
        if(!this.a.isEmpty()){
            return this.a.remove(0);
        }
        else {
            return null;
        }
        
    }
}

class Bebida{
    public static final int VOLUMEN = 500;
    private int serie;

    Bebida(int numero){
        this.serie = numero;
    }

    public int getSerie(){
        return serie;
    }

    public void beber(){
    }
}