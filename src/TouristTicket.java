public class TouristTicket extends Ticket {
    private String hotelAddress;
    private String[] hotelLoc=new String[5];
    private int pos=0;

    public TouristTicket(int pnrNumber, String departureLoc, String destinationLoc, Flight flight,
                         String departureDate, String departureTime, String arrivalDate, String arrivalTime,
                         Passenger passenger,
                         int seatNo, float price, String status, float duration, boolean cancellation,
                         String hotelAddress, String hotelLoc) {
        super(pnrNumber, departureLoc, destinationLoc, flight, departureDate, departureTime,
                arrivalDate, arrivalTime, passenger, seatNo, price, status, duration, cancellation);
        this.hotelAddress = hotelAddress;
        addLoc(hotelLoc);
    }

    public String getHotelAddress(){
        return hotelAddress;
    }

    //Adding hotelloc

    public void addLoc(String loc){
        int j=pos+1;
        for (int i=pos;i<j;i++){
            hotelLoc[pos++]=loc;
        }

    }

    //Remove hotel Loc

    public void removeLoc(String loc){
        String[] hl=new String[5];
        for (int i=0;i<hotelLoc.length;i++){
            if (hotelLoc[i]==loc){
                pos--;
                continue;
                
            }
                
            for (int j=0;j< hl.length;j++){
                hl[j]=hotelLoc[i];
            }
        }

        for (int i=0;i< hl.length;i++){
            hotelLoc[i]=hl[i];
        }

        

    }

    public String[] getHotelLoc() {
        return hotelLoc;
    }
}
