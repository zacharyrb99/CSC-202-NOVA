package ProgrammingAssignment.Problem2;

/*
    Algorithm to eat only red pez candies:

    1. Top() and check whether candy is red or not
    2. If it is red:
            pop()
       It it isn't red:
            var pez = top()
            pop()
            push() to other pez holder
    3. Once you have gone through all candies in pez 1 and either eaten or moved it to pez 2 you should:
        a. var pez = top()
        b. pop()
        c. push() to other pez holder
*/

public class PezCandyDriver {
    public static void main(String[] args) {
        final String[] COLORS = {"yellow", "red", "blue", "pink", "green"}; 
        
        PezCandy<String> pezDispenser;
        pezDispenser = new PezCandy<String>(10);

        for (int i = 0; i < 10; i++) {
            String color = COLORS[(int)Math.floor(Math.random() * 5)];
            pezDispenser.push(color);
        }

        System.out.println(pezDispenser);
        PezCandy<String> temp = new PezCandy<String>(pezDispenser.size());

        for (int i = 0; i < 10; i++) {
            if (pezDispenser.top() == "red") {
                System.out.println("Eating a red candy!");
                pezDispenser.pop();
            } else if (pezDispenser.top() != "red") {
                temp.push(pezDispenser.top());
                pezDispenser.pop();
            }
        }

        System.out.println("The spare dispenser: ");
        System.out.println(temp);

        for (int i = 0; i < 10; i++) {
            try {
                pezDispenser.push(temp.top());
                temp.pop();
            } catch (Exception e) {
                continue;
            }
            
        }

        System.out.println("Contents of original dispenser after eating red candies: ");
        System.out.println(pezDispenser);
    }
}
