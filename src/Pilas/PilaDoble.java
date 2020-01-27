package Pilas;

public class PilaDoble <T> implements PilaADT <T>{
    private T[] pila;
    private int topeI;
    private int topeD;
    private final int MAX=40;

    public PilaDoble() {
        pila=(T[]) new Object[MAX];
        topeI=-1;
        topeD=-1;
        
    }
     public PilaDoble(int maximo) {
        pila= (T[]) new Object[maximo];
        this.topeI = maximo;
        this.topeD = maximo;
    }
    
    

    public T pop() {
        
       if(isEmpty())
           throw new EmptyCollectionException();
       T res;
       res=pila[topeI];
       pila[topeI]=null;
       topeI--;
       return res;
    }
    public T popD() {
        
       if(isEmptyD())
           throw new EmptyCollectionException();
       T res;
       res=pila[topeD];
       pila[topeD]=null;
       topeD--;
       return res;
    }

    @Override
    public T peek() {
        if(isEmpty())
           throw new EmptyCollectionException();
        
       return pila[topeI];
    }
     public T peekD() {
        if(isEmptyD())
           throw new EmptyCollectionException();
        
       return pila[topeD];
    }

   
    public void pushD(T dato) {
        if(topeD+1 == pila.length)
            expande();
        
        topeD++;
        pila[topeD]=dato;
    }
    public void push(T dato) {
        if(topeI+1 == pila.length)
            expande();
        
        topeI++;
        pila[topeI]=dato;
    }
    


    public boolean isEmpty (){
        return topeI==-1;
    }
    public boolean isEmptyD() {
        return topeD==-1;
    }
    
    public void expande(){
        T[] nuevo= (T[]) new Object [pila.length*2];
        for(int i=0; i<=topeI+topeD;i++){
            nuevo[i]=pila[i];
        }
        pila=nuevo;
    }
    
    
    
    
}