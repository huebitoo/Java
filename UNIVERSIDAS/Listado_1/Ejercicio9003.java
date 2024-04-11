package Java.UNIVERSIDAS.Listado_1;

public class Ejercicio9003 {
    public static void main(String[] args) {
        ComoStruct1 cs = new ComoStruct1();
        for(int i = 0; i < cs.ar.length; i++){
            if(i+1 != cs.ar.length){
                System.out.print(cs.ar[i+1]);
            }
            else{
                System.out.print(cs.ar[0]);
            }
            if(i+1 != cs.ar.length){
                System.out.print(",");
            }
        }
        System.out.print("\n");
    }
}

class ComoStruct1 {
    int ar[]={3,2,1,5,7,3,0,10,5};
}