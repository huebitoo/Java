package Java.UNIVERSIDAS.Listado_2;

public class Ejercicio13 {
    public static void main(String[] args) {
        Bebida p = new Bebida(true);
        System.out.println(p.beber());
        System.out.println(p.beber());
    }
}

class Bebida{
    private boolean llena;
    public Bebida(boolean a){
        this.llena = a;
    }
    public String beber(){
        if(llena == true){
            llena = false;
            String s = new String("gluglu");
            return s;
        }
        else{
            return null; //h ola
        }
        
    }
}