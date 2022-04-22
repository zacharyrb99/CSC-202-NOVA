package Problem2;

public class MirrorCollection<T> {
    public static void main(String[] args) {
        CollectionInterface<Integer> col = new CollectionT<Integer>(4);
        col.add(9);
        col.add(3);
        col.add(5);
        col.print();

        CollectionInterface<Integer> res = new MirrorCollection().mirrorCollection(col);
        res.print();
    }

    public CollectionInterface<T> mirrorCollection(CollectionInterface<T> col) {
        // *** Student task #1 */
        /*
        Requirements:
        This method creates and returns mirror image of the original collection of a parameterized type objects.
        For example, if an Integer collection stores this sequence of values: [9, 5, 1, 8]
        Then its mirror image collection should store the following values: [9, 5, 1, 8, 8, 1, 5, 9]
        */

        for(int i = col.size() - 1; i >= 0; i--) {
            col.get(i);
            col.add(col.get(i));
        }
        
        return col;
    }
}
