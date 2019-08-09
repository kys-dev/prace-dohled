package kolekce;

import java.util.Iterator;

/**
 *
 * @author Radek
 * @param <T>
 */
public class List<T> implements IList<T> {

    private Prvek aktualni;

    public List() {
        aktualni = null;
    }

    @Override
    public void pridejPrvni(T data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pridejNasledujici(T data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pridejPredchudce(T data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean jePrazdny() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterator iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private class Prvek {

        Prvek dalsi;
        Prvek predchazejici;
        T data;

        public Prvek() {
            this.dalsi = dalsi;
            this.predchazejici = null;
            this.data = null;
        }
    }

}
