// Koleksi.java
public class Koleksi<T> {
    private int nbElmt;
    private T[] wadah;

    public Koleksi(int size) {
        this.nbElmt = 0;
        this.wadah = (T[]) new Object[size];
    }

    public T getIsi(int idx) {
        if (idx >= 0 && idx < getSize()) {
            return wadah[idx];
        } else {
            return null;
        }
    }

    public void setIsi(int idx, T value) {
        if (idx >= 0 && idx < wadah.length) {
            wadah[idx] = value;
        }
    }

    public int getSize() {
        return nbElmt;
    }

    public void setSize(int size) {
        if (size >= 0 && size <= wadah.length) {
            this.nbElmt = size;
        }
    }

    public void add(T value) {
        if (getSize() < wadah.length) {
            setIsi(getSize(), value);
            setSize(getSize() + 1);
        }
    }

    public T delete(int idx) {
        if (idx >= 0 && idx < getSize()) {
            T deleted = wadah[idx];
            for (int i = idx; i < getSize() - 1; i++) {
                wadah[i] = wadah[i + 1];
            }
            wadah[getSize() - 1] = null;
            setSize(getSize() - 1);
            return deleted;
        }
        return null;
    }

    public void showAll() {
        for (int i = 0; i < getSize(); i++) {
            System.out.println(wadah[i]);
        }
    }
}
