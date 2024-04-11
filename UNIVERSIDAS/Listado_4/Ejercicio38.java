package Java.UNIVERSIDAS.Listado_4;

public class Ejercicio38 {
    public static void main(String[] args) {
        CuatroOperaciones a = new CuatroOperaciones(2, 3);
        System.out.println(a.multiplica());
        System.out.println(a.resta());
    }
}

class CuatroOperaciones extends SumaResta{
    public CuatroOperaciones(float a, float b){
        super(a,b);
    }

    public float multiplica(){
        return this.uno * this.dos;
    }

    public float divide(){
        return this.uno / this.dos;
    }
}

class SumaResta{
    protected float uno;
    protected float dos;

    public SumaResta(float a, float b){
        this.uno = a;
        this.dos = b;
    }

    public float suma(){
        return this.uno + this.dos;
    }
    
    public float resta(){
        return this.uno - this.dos;
    }
}
