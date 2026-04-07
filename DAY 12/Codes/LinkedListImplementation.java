import java.util.*;

public class LinkedListImplementation {
    public static void main(String[] args) {
        List<String> race = new LinkedList<>();
        race.add("A");
        race.add("B");
        race.add("C");

        race.addFirst("Start Race");

        System.out.println(runningRace);
        race.remove(2);
        System.out.println("B is disqualified due to early start");
        System.out.println(runningRace);
        runningRace.addLast("Finish Line");
        System.out.println("A won in 0.001 milliseconds");
    }
}