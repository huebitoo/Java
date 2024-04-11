package Java.UNIVERSIDAS.Listado_2;

public class Ejercicio12 {
    public static void main(String[] args) {
        Persona p = new Persona("Felipe", true);
        System.out.println(p.elNombre());
        System.out.println(p.esCasado());
    }
}

class Persona{
    private String nombre;
    private boolean estado;
    public Persona(String name, boolean uwu){
        this.nombre = name;
        this.estado = uwu;
    }

    public boolean esCasado(){
        return estado;
    }

    public String elNombre(){
        return nombre;
    }
}
