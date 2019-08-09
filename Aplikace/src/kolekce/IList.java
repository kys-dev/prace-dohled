package kolekce;

/**
 *
 * @author Radek
 * @param <T>
 */
public interface IList<T> extends Iterable<T> {
    
    // Přidá první prvek
    void pridejPrvni(T data);
    
    // Přidá následující prvek
    void pridejNasledujici(T data);
    
    // Přidá předcházející prvek
    void pridejPredchudce(T data);
    
    // Zjistí zda je list prázdný
    boolean jePrazdny();
    
}
