package Java.UNIVERSIDAS.Listado_3;
import java.util.ArrayList;

public class Ejercicio28 {
    public static void main(String[] args) {
        Moneda m = new Moneda();
        Expendedor e = new Expendedor(3);
        Bebida b = e.comprarBebida(m);
        System.out.println(b);
    }
}

class Expendedor{
    private Deposito exp;

    public Expendedor(int numero){
        this.exp = new Deposito();
        for(int i = 0; i < numero; i++){
            Bebida s = new Bebida(i);
            exp.addBebida(s);
        }
    }

    public Bebida comprarBebida(Moneda a){
        return exp.getBebida();
    }
}

class Bebida{
    private int serie;
    public Bebida(int numero){
        this.serie = numero;
    }

    public int getSerie(){
        return this.serie;
    }

    public String beber(){
        return "gluglu";
    }
}

class Moneda{
    public Moneda(){
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
        return null;
    }
}