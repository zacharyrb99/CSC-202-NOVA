package src;

import java.util.Scanner;

public class LineEditor {
    public static void main(String[] args) {
        String menuStr = "Command Menu: \n\n"
                            .concat("1. Menu \n")
                            .concat("2. Load File\n")
                            .concat("3. Print\n")
                            .concat("4. Display number of lines\n")
                            .concat("5. Display line\n")
                            .concat("6. Count words\n")
                            .concat("7. Delete line\n")
                            .concat("8. Append line\n")
                            .concat("9. Insert line\n")
                            .concat("10. Clear document\n")
                            .concat("11. Replace words\n")
                            .concat("12. Save to a file\n")
                            .concat("q: Quit\n");

        System.out.print(menuStr);
        Scanner scan = new Scanner(System.in);
        String option;
        LineList ll = new LineList();

        do {
            option = scan.nextLine();

            switch (option) {
                case "1":
                    System.out.println(menuStr);
                    break;
                case "2":
                    System.out.println("Enter fileName: ");
                    String fileName = scan.nextLine();
                    System.out.println("Enter append option (A-append N-new list)");
                    String appendOption = scan.nextLine();
                    System.out.println("Append Option: " + appendOption);

                    boolean appendBool = false;
                    
                    if (appendOption == "A") {
                        System.out.println("File found.");
                        appendBool = true;
                    }

                    if (appendOption == "N") {
                        System.out.println("File created.");
                        appendBool = false;
                    }

                    ll.load(fileName, appendBool);

                    break;
                case "3":
                    ll.print();
                    break;
                case "4":
                    ll.lines();
                    break;
                case "5":
                    System.out.println("What line would you like to look at?");
                    int lineNumber = scan.nextInt();
                    ll.line(lineNumber);
                    break;
                case "6":
                    int count = ll.words();
                    System.out.println("Word Count: " + count);
                    break;
                case "7":
                    System.out.println("Which line do you want to delete?");
                    int ln = scan.nextInt();
                    ll.delete(ln);
                    break;
                case "8":
                    System.out.println("What would you like to add?");
                    String value = scan.nextLine();
                    ll.addLine(value);
                    break;
                case "9":
                    System.out.println("What would you like to add?");
                    String val = scan.nextLine();
                    System.out.println("What line would you like to insert it into?");
                    int year = scan.nextInt();
                    ll.addLine(val, year);
                    break;
                case "10":
                    System.out.println("Emptying list.");
                    ll.empty();
                    break;
                case "11":
                    System.out.println("What word do you want to replace?");
                    String s1 = scan.nextLine();
                    System.out.println("What word do you want to replace " + s1 + " with?");
                    String s2 = scan.nextLine();
                    ll.replace(s1, s2);
                    break;
                case "12":
                    System.out.println("What is the name of the file you would like to save?");
                    String fn = scan.nextLine();
                    ll.save(fn);
                    break;
                case "q":
                    System.out.println("Exiting menu.");
                    break;
                default:
                    System.out.println("Invalid option input.");
                    break;
            }
        } while (option != "q");
        // switch (option) {
        //     case "m":
        //         System.out.println(menuStr);
        //         option = scan.next();
        //         break;
        //     case "load":
        //         String fileName = scan.next();
        //         Integer appendOption = scan.nextInt();

        //         if (appendOption == 1) {
        //             ll.load(fileName, true);
        //         } else if (appendOption == 0) {
        //             ll.load(fileName, false);
        //         } else {
        //             System.out.println("Incorrect input. Try again.");
        //             option = scan.next();
        //         }
                
        //         option = scan.next();
        //         break;
        //     case "p":
        //         ll.print();
        //         option = scan.next();
        //         break;
        //     case "lines":
        //         ll.lines();
        //         option = scan.next();
        //         break;
        //     case "quit":
        //         System.out.println("Leaving menu.");
        //         scan.close();
        //         break;
        //     default:
        //         System.out.println("That input isn't an option.");
        //         option = scan.next();
        //         break;
        }
    }
