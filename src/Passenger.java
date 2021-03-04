public class Passenger {
    //Encapsulated the attributes
    //Provided getters and setters

    // Nested the Contact & Address class into the Passenger class
    //Provided unique id to the passenger using id counter

    private static int idCounter;
    private int id;
    private Address address; //Should do composition
    private Contact contact; // should do composition

    public Passenger(String name,String phoneNumber,String email,String street,String city, String state) {
        this.id=++idCounter;
        Contact contact=new Contact(name,phoneNumber,email);
        Address address=new Address(street,city,state);


    }
//Getting the number of Passenger Objects created
    public int getPassengerCount(){
        return idCounter;
    }

    public Address getAddress() {
        return address;
    }

    public Contact getContact() {
        return contact;
    }
   private static class Contact {
        // Encapsulated all the attributes with the methods
        private String name;
        private String phoneNo;
        private String email;
        private String fullContact=name+","+phoneNo+", "+email; //Only to be used to update full details

       public Contact(String name, String phoneNumber, String email) {
           this.name=name;
           this.phoneNo=phoneNumber;
           this.email=email;

       }

       public String getContactDetails(){
            return name+", "+phoneNo+", "+email;
        }


        //Need to modify this
        public void updateContactDetails(String contactDetails){
            fullContact=contactDetails;
        }

        public String getFullContact() {
            return fullContact;
        }
    }

    private static class Address {
        //Encapsulated the attributes with members
        private String street;
        private String city;
        private String state;

        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }

        private String fullAddress=street+", "+city+", "+state; //For full updation purpose

        public String getAddressDetails(){
            return street+", "+city+", "+state;
        }

        //Need to modify this
        public void updateAddressDetails(String addressDetails){
            fullAddress=addressDetails;
        }

    }



}

