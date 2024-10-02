import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class App {
    public static void main(String[] args) {
        LocalDate bookingDate = LocalDate.now();  // Initialize booking date (today)
        LocalDate flightDate = LocalDate.of(2024, 12, 15);   // Initialize future flight date
        long daysUntilFlight = ChronoUnit.DAYS.between(bookingDate, flightDate);
        System.out.println(bookingDate);
        System.out.println(flightDate);
        System.out.println("Days until flight: " + daysUntilFlight);
        System.out.println();

        LocalTime departureTime = LocalTime.of(14, 30);
        LocalTime arrivalTime = departureTime.plusHours(5).plusMinutes(45);
        Duration flightDuration = Duration.between(departureTime, arrivalTime);
        System.out.println("Arriving at: " + arrivalTime);
        System.out.println("Flight lasted: " + flightDuration);
        System.out.println();

        LocalDateTime departureDateTime = LocalDateTime.of(flightDate, departureTime);
        LocalDateTime arrivalDateTime = departureDateTime.plus(flightDuration);
        System.out.println("Departure at: " + departureDateTime);
        System.out.println("Arrival at: " + arrivalDateTime);
        System.out.println();
    }
}
