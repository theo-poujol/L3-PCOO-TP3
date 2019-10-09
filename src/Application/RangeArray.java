import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Iterator;

public class RangeArray<T> implements Iterable<T>{

    /**
     * Attributs
     */

    private int indexMin;
    private int indexMax;
    private ArrayList<Pair<Integer, T>> array;

    /**
     * Constructeur
     *
     * @param indexMin indice Minimum
     * @param indexMax indice Maximum
     *
     * @throws IndiceInferieurException Exception si l'indice minimum est plus grand que l'indice maximum
     */

    public RangeArray(int indexMin, int indexMax) throws IndiceInferieurException {

        if (indexMin > indexMax) {
            throw new IndiceInferieurException("Indice min est supérieur à l'indice max");
        }

        this.indexMin = indexMin;
        this.indexMax = indexMax;
        this.array = new ArrayList<>(indexMax-indexMin);



    }

    /**
     * Fonction get générique
     *
     * @param index index du tableau à renvoyer
     * @return valeur à la position index
     */

    public T get(int index) {
        T value = null;
        for (Pair<Integer, T> p : this.array) {
            if (p.getKey() == index) {
                value = p.getValue();
            }
        }

        return  value;

    }

    /**
     *
     * @return indice minimum
     */

    public int getIndexMin() {
        return this.indexMin;
    }

    /**
     *
     * @param indexMin indice minimum à set
     */

    public void setIndexMin(int indexMin) {
        this.indexMin = indexMin;
    }

    /**
     *
     * @return indice maximum
     */

    public int getIndexMax() {
        return indexMax;
    }

    /**
     *
     * @param indexMax indice maximum à set
     */

    public void setIndexMax(int indexMax) {
        this.indexMax = indexMax;
    }

    /**
     * Fonction set générique
     *
     * @param key clé de la valeur
     * @param value valeur
     */
    public void set(Integer key, T value) {
        this.array.add(new Pair<>(key, value));

    }

    /**
     *
     * @return taille du tableau
     */
    public int rangeSize() {
        return this.array.size();
    }

    /**
     * Fonction qui rend la classe RangeArray itérable
     * @return l'iterator à utiliser
     */
    @Override
    public Iterator iterator() {
        return null;
    }
}
