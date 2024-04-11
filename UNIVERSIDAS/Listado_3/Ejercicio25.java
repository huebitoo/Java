package Java.UNIVERSIDAS.Listado_3;

public class Ejercicio25 {
    public static void main(String[] args) {
        Bebida b = new Bebida(1000);
        b.llenar(100);
        System.out.println(b.getSerie());
    }
}

class Bebida{
    public static final int VOLUMEN = 500;
    private int contenido = 0;
    private int serie;

    Bebida(int numero){
        this.serie = numero;
    }

    public int getSerie(){
        return serie;
    }

    public void llenar(int numero){
        if(numero  > 0){
            if(numero + this.contenido > Bebida.VOLUMEN){
                this.contenido = Bebida.VOLUMEN;
            }
            else{
                this.contenido += numero;
            }
        }
    }

    public int beber(int numero){
        if(numero > 0){
            if(numero > this.contenido){
                numero = this.contenido;
                this.contenido = 0;
                return numero;
            }
            else{
                this.contenido -= numero;
                return numero;
            }
        } else{
            return 0;
        }
    }
}
