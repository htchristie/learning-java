package exceptions.exampleThree.model.entities;

import exceptions.exampleThree.model.exceptions.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Integer room;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation() {}

    public Reservation(Integer room, Date checkIn, Date checkOut) throws DomainException {
        if (!checkOut.after(checkIn)) {
            throw new DomainException("Check-out date must be later than check-in.");
        }

        this.room = room;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoom() {
        return room;
    }

    public void setRoom(Integer room) {
        this.room = room;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public long duration() {
        long diff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void updateDates(Date checkIn, Date checkOut) throws DomainException {
        Date now = new Date();

        if (checkIn.before(now) || checkOut.before(now)) {
            throw new DomainException("Reservation dates must be later than today's date.");
        }

        if (!checkOut.after(checkIn)) {
            throw new DomainException("Check-out date must be later than check-in.");
        }

        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "Room " + room + ": Check-in " + sdf.format(checkIn) + ", Check-out " + sdf.format(checkOut) + ", " + duration() + " nights";
    }
}
