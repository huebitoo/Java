package Java.UNIVERSIDAS.Listado_4;

public class Ejercicio39 {
    public static void main(String[] args) {
        CuatroOperaciones a = new CuatroOperaciones(24, 0);
        System.out.println(a.multiplica());
        System.out.println(a.resta());
    }
}

class CuatroOperaciones extends SumaResta{
    public CuatroOperaciones(float a, float b){
        super(a,b);
    }

    public float multiplica(){
        return getUno() * getDos();
    }

    public float divide(){
        return getUno() / getDos();
    }
}

class SumaResta{
    private float uno;
    private float dos;

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

    public float getUno(){
        return this.uno;
    }

    public float getDos(){
        return this.dos;
    }
}
