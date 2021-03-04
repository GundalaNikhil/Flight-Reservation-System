public class RegularTicket extends Ticket {
    //Used the principle of Inheritance to extend The Ticket Class
    //Encapsulated the attributes with the methods


    public RegularTicket(int pnrNumber, String departureLoc, String destinationLoc, Flight flight,
                         String departureDate, String departureTime, String arrivalDate, String arrivalTime,
                         Passenger passenger, int seatNo, float price, String status, float duration,
                         boolean cancellation, String specialServices) {
        super(pnrNumber, departureLoc, destinationLoc, flight, departureDate, departureTime,
                arrivalDate, arrivalTime, passenger, seatNo, price, status, duration, cancellation);
        this.specialServices = specialServices;
    }

    private String specialServices;

    public String checkSpecialServices(){
        return specialServices;
    }

    public void updateSpecialServices(String specialServiceDetail){
        specialServices+=specialServiceDetail;
    }

}
