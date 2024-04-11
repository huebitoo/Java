package Java.UNIVERSIDAS.Listado_3;

public class Ejercicio24 {
    public static void main(String[] args) {
        CuatroOperaciones c = new CuatroOperaciones(1, 2);
        System.out.println(c.multiplica());
        System.out.println(c.divide());
        System.out.println(c.suma());
        System.out.println(c.resta());
    }
}

class CuatroOperaciones{
    private SumaResta s;

    public CuatroOperaciones(float a, float b){
        this.s = new SumaResta(a,b);
    }

    public float multiplica(){
        return this.s.getUno()*this.s.getDos();
    }

    public float divide(){
        return this.s.getUno()/this.s.getDos();
    }

    public float suma(){
        return this.s.suma();
    }

    public float resta(){
        return this.s.resta();
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
        return this.uno+this.dos;
    }

    public float resta(){
        return this.uno-this.dos;
    }

    public float getUno(){
        return this.uno;    
    }
    
    public float getDos(){
        return this.dos;    
    }
}
