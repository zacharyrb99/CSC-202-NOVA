public class CarInLine {
    private long arrivalTime;
    private long departureTime;
    
    public CarInLine(long arrivalTime) {
        this.arrivalTime = arrivalTime;
        this.departureTime = 0;
    }

    public long getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(long arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public long getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(long departureTime) {
        this.departureTime = departureTime;
    }

    public long totalTime() {
        return departureTime - arrivalTime;
    }
}