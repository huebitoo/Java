package Java.UNIVERSIDAS.Listado_3;

public class Ejercicio27 {
    public static void main(String[] args) {
        Moneda m = new Moneda();
        Expendedor e = new Expendedor();
        Bebida s = e.comprarBebida(m);
        System.out.println(s.beber());


    }
}

class Expendedor{
    public Expendedor(){

    }

    public Bebida comprarBebida(Moneda a){
        return new Bebida();
    }
}

class Bebida{
    public Bebida(){

    }

    public String beber(){
        return "gluglu";
    }
}

class Moneda{
    public Moneda(){

    }
}