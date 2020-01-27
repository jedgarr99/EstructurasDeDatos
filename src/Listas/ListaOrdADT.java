package Listas;

public interface ListaOrdADT <T extends Comparable<T>> extends ListaADT<T> {
    public boolean agrega(T dato);
    
}
