package iterativeSolution;

public class evaluateGCFAlgorithm {
    public static void main(String[] args) {
        long gcf1Start = System.nanoTime();
        int gcf1Res = GCFAlgorithm.gcf1(6, 2);
        long gcf1End = System.nanoTime();


        long gcf2Start = System.nanoTime();
        int gcf2Res = GCFAlgorithm.gcf2(6, 2);
        long gcf2End = System.nanoTime();


        long gcf3Start = System.nanoTime();
        int gcf3Res = GCFAlgorithm.gcf3(6, 2);
        long gcf3End = System.nanoTime();
    
        System.out.println("a = 6, b = 2");
        System.out.println("GCF 1 Time: " + (gcf1End - gcf1Start) + " nanoseconds.");
        System.out.println("GCF 2 Time: " + (gcf2End - gcf2Start) + " nanoseconds.");
        System.out.println("GCF 3 Time: " + (gcf3End - gcf3Start) + " nanoseconds.");
        System.out.println();

        gcf1Start = System.nanoTime();
        gcf1Res = GCFAlgorithm.gcf1(6, 2);
        gcf1End = System.nanoTime();


        gcf2Start = System.nanoTime();
        gcf2Res = GCFAlgorithm.gcf2(6, 2);
        gcf2End = System.nanoTime();


        gcf3Start = System.nanoTime();
        gcf3Res = GCFAlgorithm.gcf3(6, 2);
        gcf3End = System.nanoTime();
    
        System.out.println("a = 200, b = 1");
        System.out.println("GCF 1 Time: " + (gcf1End - gcf1Start) + " nanoseconds.");
        System.out.println("GCF 2 Time: " + (gcf2End - gcf2Start) + " nanoseconds.");
        System.out.println("GCF 3 Time: " + (gcf3End - gcf3Start) + " nanoseconds.");
    }
}
