public class NonzeroList {
    private int[] data;
    private int index; //the location where new data will be added to the array.
    private int numberOfElements;
    
    public NonzeroList(int cap) {
        data = new int[cap];
        index = numberOfElements = 0;
    }
    
    public void add(int num) {
        // *** Student task #1 ***  

        /* 
        Requirements: 
        -if num is zero, print message saying that zero is not allowed in a nonzerolist
            -if it is full, display message "The NonzeroList is full."
            -if the number is duplicate, display message "This number is in the list. A duplicated number can't be added to the list."
            -num is inserted into the list so that the list is sorted in ascending order

        *** Enter your code below *** 
        */
        if (num == 0) {
            System.out.println("Number cannot be 0.");
            return;
        } else if (isFull()) {
            System.out.println("The NonzeroList is full.");
            return;
        } else if (indexOf(num) != -1) {
            System.out.println("This number is in the list. A duplicate numebr cannot be added to the list.");
            return;
        }

        data[index] = num;
        index++;
        numberOfElements++;

        for (int i = 0; i < numberOfElements; i++) {
            for (int j = i + 1; j < numberOfElements; j++) {
                if (data[i] > data[j]) {
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
    }
    
    public void remove(int target) {
        // *** Student task #2 ***  

        /* 
        Requirements:
            -If the target value does not exist, print message: "Target value does not exist."
            -Remove the target value in the NonzeroList if the value exists
            -Shift all items after the removed one so the order is maintained.

        *** Enter your code below *** 
        */

        if (indexOf(target) == -1) {
            System.out.println("Target value does not exist.");
            return;
        }

        int idx = indexOf(target);
        int lastVal = data[numberOfElements - 1];
        data[idx] = lastVal;
        data[numberOfElements - 1] = 0;
        numberOfElements--;

        for (int i = 0; i < numberOfElements; i++) {
            for (int j = i + 1; j < numberOfElements; j++) {
                if (data[i] > data[j]) {
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
    }
    
    public void removeAll() {
        // *** Student task #3 ***  

        /* 
        Requirements:
            -remove all data from the list. The list will be empty 
            *** Enter your code below *** 
        */

        this.data = new int[size()];
    }

    public int indexOf(int target) { // return the index of the first occurrence of target in the data array
        for(int i = 0; i < numberOfElements; i++) {
            if(data[i] == target)
                // System.out.println("Found");
                return i;
        } 
        
        return -1; // not found
    }

    public boolean isFull() {
        return numberOfElements == data.length;
    }

    public boolean isEmpty() {
        return numberOfElements == 0;
    }

    public int size() {
        return numberOfElements;
    }

    public void print() {
        System.out.print("[");
        for(int i = 0; i < numberOfElements; i++) {
            System.out.print(data[i]);
            if(i < numberOfElements - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
