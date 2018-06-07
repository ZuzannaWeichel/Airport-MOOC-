
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AirportPanel lawica = new AirportPanel(scanner);
        
        lawica.startAirportPanel();
        lawica.startFlightService();

    }

    public static void user(Scanner scanner) {
        String input = scanner.nextLine();
    }
}
