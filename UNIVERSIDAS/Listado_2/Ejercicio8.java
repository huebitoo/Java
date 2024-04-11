package Java.UNIVERSIDAS.Listado_2;

public class Ejercicio8 {
    public static void main(String[] args) {
        Balde b = new Balde();
        b.llenar(5);
        int contine = b.verificar();
        System.out.println(contine);
    }
}

class Balde {
    private int litros = 0;
    
    public Balde(){
    }

    public void llenar(int numero){
        litros += numero;
    }

    public int verificar(){
        if(litros > 12){
            return 12;
        }
        else{
            return litros;
        }
    }
}
