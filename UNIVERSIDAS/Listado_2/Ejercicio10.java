package Java.UNIVERSIDAS.Listado_2;

public class Ejercicio10 {
    public static void main(String[] args) {
        Bebida1 b = new Bebida1();
        System.out.println(b.beber());
    }
}

class Bebida1{
    public Bebida1(){
    }

    public String beber(){
        String s = new String("gluglu");
        return s;
    }
}