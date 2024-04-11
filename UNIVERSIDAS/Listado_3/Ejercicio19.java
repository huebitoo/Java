package Java.UNIVERSIDAS.Listado_3;

public class Ejercicio19 {
    public static void main(String[] args) {
        Balde b=new Balde(5);         
        b.llenar(3);                
        int s = b.vaciar(2);
        System.out.println(s);
        System.out.println(b.verificar());
    }
}

class Balde {
    private int capacidad;
    private int contenido = 0;
    
    public Balde(int numero){
        this.capacidad = numero;
    }

    public void llenar(int numero){
        if (numero > 0){
            contenido += numero;
        }
    }

    public int verificar(){
        if(contenido > capacidad){
            contenido = capacidad;
            return capacidad;
        }
        else{
            return contenido;
        }
    }

    public int vaciar(int numero){
        if(numero < 0){
            return 0;
        }
        else{
            if(contenido < numero){
                contenido = 0;
                return contenido;
            }
            else{
                contenido -= numero;
                return numero;
            }
        }
    }
}