package Problem2;

public class PolynomialDriver {
    public static void main(String[] args) {
        int[] coefs1 = {5, 4, 4, 3};
        Polynomial p1 = new Polynomial(3, coefs1);

        int[] coefs2 = {3, 2, 1};
        Polynomial p2 = new Polynomial(2, coefs2);

        System.out.println("Polynomial 1: " + p1);
        System.out.println("Polynomial 2: " + p2);
        System.out.println("P1 + P2: " + p2.plus(p1));
        System.out.println();
        
        int[] coefs3 = {2, 3, 4, 5};
        Polynomial p3 = new Polynomial(3, coefs3);

        int[] coefs4 = {4, 5, 1, 2};
        Polynomial p4 = new Polynomial(3, coefs4);

        System.out.println("Polynomial 3: " + p3);
        System.out.println("Polynomial 4: " + p4);
        System.out.println("P3 - P4: " + p4.minus(p4));
        System.out.println();

        int[] coefs5 = {5, 4, 2, 6};
        Polynomial p5 = new Polynomial(3, coefs5);
        
        System.out.println("Polynomial 5: " + p5);
        System.out.println("P5 evaluated at x = 2: " + p5.evaluate(2));
        System.out.println();

        int[] coefs6 = {2, 3, 5};
        Polynomial p6 = new Polynomial(2, coefs6);

        System.out.println("Polynomial 6: " + p6);
        System.out.println("Derivative of Polynomial 6: " + p6.derivative());
        System.out.println();
    }
}
