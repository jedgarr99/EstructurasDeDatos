
package objetosvoladores;

public class MAG {
    public static <T> int busqueda(T[] arr, T obj, int n){
        int i=0;
        
        while(i<n&& !obj.equals(arr[i]))
            i++;
        if(i==n)
            i=-1;
        return i;     
    }
    
}
