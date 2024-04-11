package Java.UNIVERSIDAS.Listado_1;

public class Ejercicio6 { 
    
    public static void main(String[] args) {
        int R[]={3,2,1,5,7,3,0,10,5};
        int start = 0;
        int end = R.length-1;
        int aux = 0;
        
        for(int i = 0; i < R.length; i++){
            aux = R[end];
            R[end] = R[start];
            R[start] = aux;
            start++;
            end--;
            
            if(start >= end){
                break;
            }
        }

        for(int i = 0; i < R.length; i++){
            System.out.print(R[i]);
            if(i+1 != R.length){
                System.out.print(",");
            }
        }
        
        System.out.print("\n");
    }
}
