package Problem2;

public class CollectionT<T> implements CollectionInterface<T> {
    private T[] data;
    private int count = 0;

    public CollectionT(int size){
        data = (T[])new Object[size];
    }

    public void add(T ele){
        // *** Student task #1 ***
        /*
        Requirements: if the collection is full then double the array size 
        before adding operation
        *** Enter your code below ***
        */

        if (isFull()) {
            T[] newCol;
            newCol = (T[])new Object[count * 2];
            for (int i = 0; i < count; i++) {
                newCol[i] = data[i];
            }

            newCol[count++] = ele;
            data = newCol;
        } else {
            data[count] = ele;
            count++;
        }
    }

    public boolean remove(int index){
        // *** Student task #2 ***
        /*
        Requirements: Removes the element at index position, if index < size() 
        returns true after removing, otherwise, returns false
        *** Enter your code below ***
        */

        if (index >= 0 && index < size()) {
            for (int i = index; i < size() - 1; i++) {
                data[i] = data[i + 1];
            }

            count--;
            return true;
        }

        return false;
    }

    public int remove(T ele){
        // *** Student task #3 ***
        /*
        Requirements:
        Removes all elements from this collection such that each of them 
        equals to ele [equals(ele) returns true]
        and returns the number of elements being removed.
        *** Enter your code below ***
        */

        int countOfElements = 0;

        for (int i = 0; i < count;) {
            if (data[i].equals(ele)) {
                countOfElements++;
                remove(i);
            } else {
                i++;
            }
        }

        return countOfElements;
    }

    public T get(T ele){
        int index = indexOf(ele);

        if(index >= 0){
            return data[index];
        } else {
            return null;
        }
    }

    public T get(int index) {
        if (index >= 0 && index < count) {
            return data[index];
        }

        return null;
    }

    public boolean isFull(){
        return count == data.length;
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public int size(){
        return count;
    }

    public int indexOf(T ele){
        for(int i = 0; i < count; i++) {
            if(data[i].equals(ele)) {
                return i;
            }
        }

        return -1;
    }

    public boolean contains(T ele){
        return indexOf(ele) != -1;
    }

    public void print(){
        String tmp = "";

        for(int i = 0; i < count; i++){
            tmp += data[i].toString() + ", ";
        }

        if(tmp.length() > 0){
            tmp = tmp.substring(0, tmp.length() - 2);
        }

        System.out.println("[" + tmp + "]");
    }
}
