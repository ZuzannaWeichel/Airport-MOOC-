
import java.util.ArrayList;
import java.util.Scanner;

// * @author Zu
public class AirportPanel {

    private ArrayList<Plane> planes;
    private ArrayList<Flight> flights;
    private Scanner reader;

    public AirportPanel(Scanner reader) {
        this.planes = new ArrayList<Plane>();
        this.flights = new ArrayList<Flight>();
        this.reader = reader;
    }

    public void startAirportPanel() {
        System.out.println("Airport panel\n" + "--------------------");
        while (true) {
            System.out.print("Choose operation:\n"
                    + "[1] Add airplane\n"
                    + "[2] Add flight\n"
                    + "[x] Exit\n"
                    + "> ");
            String input = reader.nextLine();
            if (input.equals("1")) {
                System.out.print("Give plane ID: ");
                String planeID = reader.nextLine();
                System.out.print("Give plane capacity: ");
                int planeCopacity = Integer.parseInt(reader.nextLine());
                Plane plane = new Plane(planeID, planeCopacity);
                planes.add(plane);
            } else if (input.equals("2")) {
                System.out.print("Give plane ID: ");
                String planeId = reader.nextLine();
                System.out.print("Give departure airport code: ");
                String departure = reader.nextLine();
                System.out.print("Give destination airport code: ");
                String arrival = reader.nextLine();
                Flight flight = new Flight(planeId, departure, arrival);
                flights.add(flight);
            } else if (input.equals("x")) {
                break;
            }
        }
    }

    public void startFlightService() {
        System.out.println("Flight service\n" + "------------");
        while (true) {
            System.out.print("Choose operation:\n"
                    + "[1] Print planes\n"
                    + "[2] Print flights\n"
                    + "[3] Print plane info\n"
                    + "[x] Quit\n"
                    + "> ");
            String input = reader.nextLine();
            if (input.equals("1")) {
                for (Plane plane : planes) {
                    System.out.println(plane);
                }
            } else if (input.equals("2")) {
               
                for (Flight flight : flights) {
                    for (Plane plane : planes) {
                        if (flight.getPlaneId().equals(plane.getId())) {
                            System.out.println(plane + " " + flight);
                        }
                    }
                }
            }else if (input.equals("3")){
                System.out.print("Give plane ID: ");
                String planeId = reader.nextLine();
                for(Plane plane:planes){
                    if(plane.getId().equals(planeId)){
                        System.out.println(plane);
                    }
                }
            }else if (input.equals("x"))
                break;
        }
    }
}
