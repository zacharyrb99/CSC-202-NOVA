import java.util.LinkedList;
import java.util.Queue;

public class TollBooth {
    private static long[] averageProcessingTimes = new long[10];
    private static int index = 0;

    public static void main(String[] args) {
        Queue<Long> booth1 = calculateWaitingTimes();
        Queue<Long> booth2 = calculateWaitingTimes();
        Queue<Long> booth3 = calculateWaitingTimes();
        Queue<Long> booth4 = calculateWaitingTimes();
        Queue<Long> booth5 = calculateWaitingTimes();
        Queue<Long> booth6 = calculateWaitingTimes();
        Queue<Long> booth7 = calculateWaitingTimes();
        Queue<Long> booth8 = calculateWaitingTimes();
        Queue<Long> booth9 = calculateWaitingTimes();
        Queue<Long> booth10 = calculateWaitingTimes();

        display();
    }

    private static void display() {
        String numCashiers = "Number of cashiers:\t 1\t 2\t 3\t 4\t 5\t 6\t 7\t 8\t 9\t 10";
        System.out.println(numCashiers);
        
        String avgTime = "Average Time: \t\t";
        for (int i = 0; i < 10; i++) {
            avgTime += (averageProcessingTimes[i] + "\t");
        }
        System.out.println(avgTime);

        System.out.println("Optimum number of cashiers: " + findOptimumCashier());
        System.out.println("Average processing time: " + calculateAvgProcessTime());
    }

    private static long calculateAvgProcessTime() {
        long totalTime = 0;
        for (long i : averageProcessingTimes) {
            totalTime += i;
        }

        return totalTime / 10;
    }

    private static long findOptimumCashier() {
        long optimumTime = averageProcessingTimes[0];
        long optimumCashier = 0;

        for (int i = 0; i < averageProcessingTimes.length - 1; i++) {
            if(optimumTime > averageProcessingTimes[i]) {
                optimumTime = averageProcessingTimes[i];
                optimumCashier = i;
            }
        }

        return optimumCashier;
    }

    private static Queue<Long> calculateWaitingTimes() {
        Queue<Long> tollBooth = new LinkedList<>();
        long totalProcessingTime = 0;

        // 100 cars for each cashier
        for (int i = 0; i < 100; i++) {
            long arrivalTime = System.nanoTime();
            CarInLine car = new CarInLine(arrivalTime);

            long departureTime = System.nanoTime();
            car.setDepartureTime(departureTime);
            tollBooth.add(car.totalTime() + 100000000); // + 100000000 simulates the 90 second and 10 second delays (in nanoseconds).
            totalProcessingTime += car.totalTime();
        }

        // calculate average processing time for each
        averageProcessingTimes[index++] = totalProcessingTime / 100;
        return tollBooth;
    }
}
