import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Iterator;

public class RangeArray<T> implements Iterable{

    private int indexMin;
    private int indexMax;
    private ArrayList<Pair<Integer, T>> array;


    public RangeArray(int indexMin, int indexMax) throws IndiceInferieurException {

        if (indexMin > indexMax) {
            throw new IndiceInferieurException("Indice min est supérieur à l'indice max");
        }

        this.indexMin = indexMin;
        this.indexMax = indexMax;
        this.array = new ArrayList<>(indexMax-indexMin);



    }

    public T get(int index) {
        T value = null;
        for (Pair<Integer, T> p : this.array) {
            if (p.getKey() == index) {
                value = p.getValue();
            }
        }

        return  value;

    }

    public int getIndexMin() {
        return this.indexMin;
    }

    public void setIndexMin(int indexMin) {
        this.indexMin = indexMin;
    }

    public int getIndexMax() {
        return indexMax;
    }

    public void setIndexMax(int indexMax) {
        this.indexMax = indexMax;
    }

    public void set(Integer key, T value) {
        this.array.add(new Pair<>(key, value));

    }

    public int rangeSize() {
        return this.array.size();
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
