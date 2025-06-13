package core.models;

import java.util.Date;

public class BookingDates {
    private Date checkIn;

    public Date getCheckout() {
        return checkOut;
    }

    public void setCheckOut(Date checkout) {
        this.checkOut = checkout;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    private  Date checkOut;
}
