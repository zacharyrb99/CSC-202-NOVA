package Problem1;

public class MapExample {
    public static void main(String[] args) {
		//*** Task #1: declare a variable of MapInterface type, with type of elements of your choice
        MapInterface<Integer, String> map;
		
		//*** Task #2: instantiate the variable declared above using the ArrayListMap constructor
        map = new ArrayListMap<Integer, String>();

		//*** Task #3: check if the map is  empty, and print out the answer you get 
        System.out.println("Map is empty: " + map.isEmpty());

		//*** Task #4: use the appropriate method, and display the size of the map 
        System.out.println("Map size: " + map.size());

		//*** Task #5: use the appropriate method to populate the map with 4-5 entries
        map.put(1, "Zach");
        map.put(2, "Mariah");
        map.put(3, "John");
        map.put(4, "Jane");
        map.put(5, "Emilie");

		//*** Task #6: check if the map is  empty, and print out the answer you get 
        System.out.println("Map is empty: " + map.isEmpty());

		//*** Task #7: use the appropriate method, and display the size of the map 
        System.out.println("Map size: " + map.isEmpty());

		//*** Task #8: check if certain values belong to the map, and replace some of them
        System.out.println("Map contains key = 1: " + map.contains(1));
        System.out.println("Map contains key = 4: " + map.contains(4));
        System.out.println("Map contains key = 7: " + map.contains(7));

		//*** Task #9: display the content of the map
        System.out.println();
        System.out.println("Map Contents: ");
        for (MapEntry mapItem : map) {
            System.out.println(mapItem.toString());
        }
		
		//*** Task #10: remove a number of elements from the map
        System.out.println();
        System.out.println("Removing element 3: " + map.remove(3));
        System.out.println("Removing element 5: " + map.remove(5));
		
		//*** Task #11: display the new content of the map
        System.out.println();
        System.out.println("New Map Contents: ");
        for (MapEntry mapItem : map) {
            System.out.println(mapItem.toString());
        }
	}
}
