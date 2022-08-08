package dateTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Program {
    public static void main(String[] args) {

        LocalDate dateNow = LocalDate.now();
        System.out.println(dateNow);

        LocalDateTime dateTimeNow = LocalDateTime.now();
        System.out.println(dateTimeNow);

        Instant instant = Instant.now(); //GMT
        System.out.println(instant);

        LocalDate dateISO = LocalDate.parse("2022-08-01");
        System.out.println(dateISO);

        LocalDateTime timeISO = LocalDateTime.parse("2022-08-01T12:30:27");
        System.out.println(timeISO);

        Instant instantISO = Instant.parse("2022-08-01T01:30:27Z");
        System.out.println(instantISO);

        //Instant instantISO2 = Instant.parse("2022-08-01T12:30:27-03:00");
        //System.out.println(instantISO2);

        DateTimeFormatter custom = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate customDate = LocalDate.parse("20/08/2022", custom);
        System.out.println(customDate);

        DateTimeFormatter custom2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDateTime customTime = LocalDateTime.parse("20/08/2022 13:09", custom2);
        System.out.println(customTime);

        // or: LocalDateTime customTime = LocalDateTime.parse("20/08/2022 13:09", DateTimeFormatter.ofPattern
        // ("dd/MM/yyyy HH:mm"));

        LocalDate dateOf = LocalDate.of(2022, 8, 5);
        System.out.println(dateOf);

        LocalDateTime timeOf = LocalDateTime.of(2022, 8, 5, 13, 23);
        System.out.println(timeOf);

        System.out.println(dateISO.format(custom));
        System.out.println(custom.format(dateISO));

        // FORMATTING INSTANT
        DateTimeFormatter custom3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        System.out.println(custom3.format(instantISO));

        // https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
        DateTimeFormatter custom4 = DateTimeFormatter.ISO_DATE_TIME;
        System.out.println(timeISO.format(custom4));

        DateTimeFormatter custom5 = DateTimeFormatter.ISO_INSTANT;
        System.out.println(custom5.format(instantISO));

        System.out.println("------------------");

        // converting global to local

        LocalDate local1 = LocalDate.ofInstant(instantISO, ZoneId.systemDefault());
        System.out.println(local1);

        LocalDate local2 = LocalDate.ofInstant(instantISO, ZoneId.of("Portugal"));
        System.out.println(local2);

        LocalDateTime local3 = LocalDateTime.ofInstant(instantISO, ZoneId.systemDefault());
        System.out.println(local3);

        LocalDateTime local4 = LocalDateTime.ofInstant(instantISO, ZoneId.of("Portugal"));
        System.out.println(local4);

        System.out.println(dateISO.getDayOfWeek());
        System.out.println(dateISO.getDayOfMonth());
        System.out.println(dateISO.getDayOfYear());
        System.out.println(dateISO.getMonth());
        System.out.println(dateISO.getMonthValue());
        System.out.println(dateISO.getYear());

        System.out.println(timeISO.getHour());
        System.out.println(timeISO.getMinute());
        System.out.println(timeISO.getSecond());

        System.out.println("------------------");

        LocalDate pastWeek = dateISO.minusDays(7);
        System.out.println(pastWeek);

        LocalDate nextWeek = dateISO.plusWeeks(1);
        System.out.println(nextWeek);

        LocalDateTime nextMonth = timeISO.plusMonths(1);
        System.out.println(nextMonth);

        LocalDateTime nextHour = timeISO.plusHours(1);
        System.out.println(nextHour);

        Instant pastQuarter = instantISO.minus(90, ChronoUnit.DAYS);
        System.out.println(pastQuarter);

        // ChronoUnit Months and Weeks are not working

        Duration duration = Duration.between(timeISO, nextMonth);
        System.out.println(duration.toDays());
    }
}
