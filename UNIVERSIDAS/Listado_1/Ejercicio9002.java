package Java.UNIVERSIDAS.Listado_1;

public class Ejercicio9002 {
    public static void main(String[] args) {
        ComoStruct cs = new ComoStruct();
        int contador = 0;
        for(int i = 0; i < cs.ar.length; i++){
            if(cs.ar[i]%2 == 0){
                if(contador == 0){
                    System.out.print(cs.ar[i]);
                    contador++;
                }
                else if(i+1 != cs.ar.length){
                    System.out.print("," + cs.ar[i]);
                }
            }
        }
        System.out.print("\n");
    }
}

class ComoStruct{
    int ar[]={3,2,1,5,7,3,0,10,5};
}