package Java.UNIVERSIDAS.Listado_4;
import java.util.ArrayList;

public class Ejercicio43 {
    public static void main(String[] args) {
        Expendedor exp = new Expendedor(20);
        Moneda moneda = new Moneda();
        Bebida a = exp.comprarBebida(moneda, 1);
        System.out.println(a.beber() + ", " + a.getSerie());   
    }
}

class Expendedor {
    private Deposito a;
    private Deposito b;

    public Expendedor(int cant_bebidas){
        this.a = new Deposito(); // Cocacola
        this.b = new Deposito(); // Sprite
        for(int i = 0; i < cant_bebidas; i++){
            this.a.addBebida(new CocaCola(100+i));
            this.b.addBebida(new Sprite(200+i));
        }
    }

    public Bebida comprarBebida(Moneda mon, int numero){
        if (numero == 1){
            return a.getBebida();
        } else if (numero == 2){
            return b.getBebida();
        }
        else return null;
    }


}

class Moneda {
    public Moneda(){

    }
}

class Deposito {

    private ArrayList<Bebida> arra; // Array que almacenara las bebidas 
    
    public Deposito(){
        this.arra = new ArrayList<Bebida>(); // Creacion del array con las bebidas
    }

    public void addBebida(Bebida bebi){
        this.arra.add(bebi); // Se agregan las bebidas
    }

    public Bebida getBebida(){
        if(this.arra.size() != 0){ // Se retorna la bebida eliminada
            return this.arra.remove(0);
        }
        return null; // Si no hay bebidas, retorna nulo
    }
}

abstract class Bebida {
    private int numero_serie;

    public Bebida(int serie){
        this.numero_serie = serie;
    }

    public int getSerie(){
        return numero_serie;
    }

    public String beber(){
        return "sabor: ";
    }
}

class Sprite extends Bebida {
    public Sprite(int serie){
        super(serie);
    }

    public String beber(){
        return super.beber() + "sprite";
    }
}

class CocaCola extends Bebida{

    public CocaCola(int serie){
        super(serie);
    }

    public String beber(){
        return super.beber() + "cocacola";
    }
}