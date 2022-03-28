package Problem3;

/**
* @author EMILIA BUTU
* version 1.0
* since   2020-07
*
* Student name:  xxxxx
* Completion date: xxxx
*
* Staff.java
*
* Driver for the inheritance application testing the inheritance, and
* showing how polymorphism and dynamic binding works.
*
* Students have to run the program after building all classes
*
*/

public class Personnel {
    public static void main(String[] args) {
        Person[] group = new Person[3];
        group[0] = new GTA("Anna Smiley", 234, "Science", 20);
        group[1] = new Fulltime("Jane Dane", 2343, "Lecturer", 49000);
        group[2] = new Adjunct("Edward Stone", 121, "Assistant Professor", 950);
        
        for(Person p: group) {
            System.out.println(p);
            p.displayPayInfo();
            System.out.println();
        }
    }
}