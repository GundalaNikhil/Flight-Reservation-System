public class Flight {
    //Encapsulated attributes with the methods

    private int flightNo;
    private String airline;
    private int capacity;
    private int seatsBooked;

    public Flight(int flightno,String airline,int capacity,int seatsBooked){
        this.flightNo=flightno;
        this.airline=airline;
        this.capacity=capacity;
        this.seatsBooked=seatsBooked;
    }

    public String flightDetails() {
        return Integer.toString(flightNo) + ", " + airline + ", " + capacity + ", " + Integer.toString(seatsBooked);

    }

    public boolean seatsAvailability() {
        if(seatsBooked>capacity){
            return false;
        }
        return true;
    }

    public void updateSeats(int seats) {
        seatsBooked += seats;
    }
}
