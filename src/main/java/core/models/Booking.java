package core.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Booking {
    private int bookingId;

    @JsonCreator
    public Booking(@JsonProperty("bookingId") int bookingId){
        this.bookingId = bookingId;
    }

    public int getBookingid(){
        return bookingId;
    }

    public void setBookingId(int bookingId){
        this.bookingId = bookingId;
    }
}
