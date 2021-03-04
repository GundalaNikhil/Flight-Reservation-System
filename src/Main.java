import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //This is for test purposes check for working
        Flight flight=new Flight(22,"Hyderabad Airlines",100,50);
        System.out.println(flight.flightDetails());
        System.out.println(flight.seatsAvailability());

        //Using The Concept Of Polymorphism
        Passenger passenger=new Passenger("Ted","789007891","ted@gmail.com","gandhinagar","LB Nagar","Hyderabad");

        RegularTicket regularTicket=new RegularTicket(1456789,"Mumbai","Hyderabad",
                flight,"04/03/2021","12 pm","05/04/2021","12 am",passenger,32, 10000.0f,"confirmed",
                12.0f,false,"spa");
        TouristTicket touristTicket=new TouristTicket(1000089,"Mumbai","Hyderabad",
                flight,"04/03/2021","12 pm","05/04/2021","12 am",passenger,32, 10000.0f,"confirmed",
                12.0f,false,"vadodara road, Lal COmplex, Chennai","BalNagar");
        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);
        System.out.println(Arrays.toString(touristTicket.getHotelLoc()));
        touristTicket.removeLoc("BalNagar");
        System.out.println(Arrays.toString(touristTicket.getHotelLoc()));
        touristTicket.addLoc("Madras");
        System.out.println(Arrays.toString(touristTicket.getHotelLoc()));

    }

    public static void printTicketDetails(Ticket ticket){
        System.out.println("PNR Number is "+ticket.getPnrNumber());//Getting the pnr Number on the console

    }
}
