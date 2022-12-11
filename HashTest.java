import java.util.HashMap;
import java.util.Set;

public class HashTest {
    public static void main(String[] args){
        System.out.println("Henlo, Hash!");
        HashMap<String, String> tracks = new HashMap<String, String>();
        tracks.put("In the Air Tonight", "I can feel it, coooming in the air tonight");
        tracks.put("About a Girl", "I need an easy friend. I do, with an ear to lend.");
        tracks.put("My Name Is", "Hi! My name is: What?");
        tracks.put("Take Me Home, Country Roads", "Almost heaven, West Virginia. Blue Ridge Mountains, Shenandoah River...");

        String johnDenver = tracks.get("Take Me Home, Country Roads");

        System.out.println("Getting a track by the key for value of 'Take Me Home, Country Roads'... " + "\n" + johnDenver);
        System.out.println("Grabbing all the tracks from your playlist!");
        Set<String> keys = tracks.keySet();
        for(String key : keys){
            System.out.println(key);
            System.out.println(tracks.get(key));
        }
    }
}