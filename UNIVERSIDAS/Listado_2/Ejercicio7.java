package Java.UNIVERSIDAS.Listado_2;

public class Ejercicio7 {
    public static void main(String[] args) {
        int aux = 0;
        ComoStructM cs = new ComoStructM();
        for (int i = 0; i < cs.ar[0].length; i++){
            aux = cs.ar[cs.ar.length-1][i];
            cs.ar[cs.ar.length-1][i] = cs.ar[0][i];
            cs.ar[0][i] = aux;
        }

        for (int i = 0;i < cs.ar.length; i++){
            for(int j = 0; j < cs.ar[0].length; j++){
                if(j+1 != cs.ar[0].length){
                    System.out.print(cs.ar[i][j] + ",");
                }
                else{
                    System.out.print(cs.ar[i][j]);
                }
            }
            System.out.print("\n");
        }
    }
}

class ComoStructM {
    int ar[][]={{3,2,0,-1,-2},{4,8,1,-3,-4},{6,9,5,-9,-7}};
}
