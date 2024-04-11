package Java.UNIVERSIDAS.Listado_1;

public class Ejercicio4 {
    public static void main(String[] args) {
        int R[] = {3,2,1,5,7,3,0,10};
        int mayor = 0;
        for(int i = 0; i < R.length; i++){
            if(i == 0){
                mayor = R[i];
            }
            else if(R[i] > mayor){
                mayor = R[i];
            }
        }
        System.out.println(mayor);
    }
}
