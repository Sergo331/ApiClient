package core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

public class BookingDates {
    @JsonProperty("checkin")
    private Date checkin;
    
    @JsonProperty("checkout")
    private Date checkout;

    public Date getCheckout() {
        return checkout;
    }

    public void setCheckout(Date checkout) {
        this.checkout = checkout;
    }

    public Date getCheckin() {
        return checkin;
    }

    public void setCheckin(Date checkin) {
        this.checkin = checkin;
    }
}
