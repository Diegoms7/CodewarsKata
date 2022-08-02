public class BusPassenger {

    public static int countPassengers(ArrayList<int[]> stops) {

        int counter = 0;
        for (int i = 0; i < stops.size(); i++) {
            counter = stops.get(i)[0] - stops.get(i)[1];
        }
        
        return counter;
    }
}
