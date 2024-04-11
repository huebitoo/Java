package Java.UNIVERSIDAS.Listado_3;

public class Ejercicio22 {
    public static void main(String[] args) {
        Tubo t = new Tubo();
        Pelota s = new Pelota(5);
        t.meteA(s);
        t.verTubo();
    }
}

class Tubo{
    private Pelota p[] = new Pelota[2];
    private Pelota p1;

    public Tubo(){
        this.p[0] = null;
        this.p[1] = null;
    }

    public Pelota meteA(Pelota a){
        if(this.p[0] == null){
            this.p[0] = a;
            return null;
        }
        else{
            this.p1 = this.p[1];
            this.p[1] = this.p[0];
            this.p[0] = a;
            return this.p1;
        }
    }

    public Pelota meteB(Pelota a){
        if(this.p[1] == null){
            this.p[1] = a;
            return null;
        }
        else{
            this.p1 = this.p[0];
            this.p[0] = this.p[1];
            this.p[1] = a;
            return this.p1;
        }
    }

    public void verTubo(){
        if(this.p[0] == null && this.p[1] == null){
            System.out.println("A:[null,null]:B");
        }
        else if(this.p[0] == null && this.p[1] != null){
            System.out.println("A:[null," + this.p[1].dameTuSerie()+"]:B");
        }
        else if(this.p[0] != null && this.p[1] == null){
            System.out.println("A:[" + this.p[0].dameTuSerie() + ",null]:B");
        }
        else {
            System.out.println("A:[" + this.p[0].dameTuSerie() + "," + this.p[1].dameTuSerie() + "]:B");
        }
        
    }
}

class Pelota{
    private int serie;
    public Pelota(int numero_serie){
        this.serie = numero_serie;
    }
    public int dameTuSerie(){
        return this.serie;
    }
}