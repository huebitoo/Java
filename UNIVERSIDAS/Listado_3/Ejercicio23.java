package Java.UNIVERSIDAS.Listado_3;

public class Ejercicio23 {
    public static void main(String[] args) {
        SumaResta1 s = new SumaResta1(10, 20);
        s.suma();
        s.resta();
    }
}

class SumaResta1{
    private float uno;
    private float dos;

    public SumaResta1(float a, float b){
        this.uno = a;
        this.dos = b;
    }

    public float suma(){
        return this.uno+this.dos;
    }

    public float resta(){
        return this.uno-this.dos;
    }
}
