
package Pilas;

public class PilaA <T> implements PilaADT <T>{
    private T[] pila;
    private int tope;
    private final int MAX=20;

    public PilaA() {
        pila=(T[]) new Object[MAX];
        tope=-1;
    }
     public PilaA(int maximo) {
        pila= (T[]) new Object[maximo];
        tope = -1;
    }
    
    

    @Override
    public T pop() {
        
       if(isEmpty())
           throw new EmptyCollectionException();
       T res;
       res=pila[tope];
       pila[tope]=null;
       tope--;
       return res;
    }

    @Override
    public T peek() {
        if(isEmpty())
           throw new EmptyCollectionException();
        
       return pila[tope];
    }

    @Override
    public void push(T dato) {
        if(tope+1 == pila.length)
            expande();
        
        tope++;
        pila[tope]=dato;
    }

    @Override
    public boolean isEmpty() {
        return tope==-1;
    }
    public void expande(){
        T[] nuevo= (T[]) new Object [pila.length*2];
        for(int i=0; i<=tope;i++){
            nuevo[i]=pila[i];
        }
        pila=nuevo;
    }
    
    
    
    
}
