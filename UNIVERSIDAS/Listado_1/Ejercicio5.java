package Java.UNIVERSIDAS.Listado_1;

public class Ejercicio5 {
    public static void main(String[] args) {
        int b[]={3,2,1,5,7,3,0,10,5};
        int x = 0;
        for(int i = 0; i < b.length; i++){
            x += b[i];
        }
        float z = (float)x/(float)b.length;
        System.out.println(z);
    }
}
