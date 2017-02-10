package ku.util;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Class for doing array iteration of any type of element.
 * @author Pawat Nakpiphatkul
 */
public class ArrayIterator<T> implements Iterator<T> {
    /** attribute for the array we want to iterate over */
    private T[] array;
    /** Store the length of the array */
    private int arrayLength;
    /** Store cursor of array index */
    private int cursor;
    /**
     * Initialize a new array iterator with the array to process.
     * @param array is the array to iterate over.
     */
    public ArrayIterator(T[] array){
        this.array = array;
        this.arrayLength = array.length;
        this.cursor = -1;
    }
    /**
     * Return the next non-null element from array, if any.
     * @return the next non-null element in the array.
     * @throws NoSuchElementException if there are no more elements to return.
     */
    public T next() {
        while(hasNext()){
            cursor++;
            if(array[cursor]!=null){
                return array[cursor];
            }
        }
        throw new NoSuchElementException();
    }
    /**
     * Check has a next element in array or not.
     * @return true if it has else return false.
     */
    public boolean hasNext(){
        boolean notNull = false;
        for(int i=cursor+1;i<arrayLength;i++){
            if(array[i]!=null)
                notNull = true;
        }
        return cursor != arrayLength-1 && notNull;
    }
    /**
     * Remove most recent array element and set it to null.
     */
    public void remove(){
        if(cursor>=0){
            if(array[cursor]!=null){
                array[cursor] = null;
            }
            else{
                throw new IllegalStateException();
            }
        }
        else{
            throw new IllegalStateException();
        }
    }
    /**
     * Get the current array in the object.
     * @return the array
     */
    public T[] getArray(){
        return array;
    }
}
