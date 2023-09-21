import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //printMegaBytesAndKiloBytes(0);

        ArrayList<Player> players = new ArrayList<>();
        players.add(new Player(1, "Dmytro", 232));
        players.add(new Player(5, "Danylo", 434));
        players.add(new Player(3, "Ihor", 4334));
        players.sort(new IdComparator());
        System.out.println(players);
        players.sort(new NameComparator());
        System.out.println(players);

        GenClass<String> g = new GenClass<>();
        g.value = "chlen";
        g.say(players.get(0));
        System.out.println(g.getElement(players, 1));
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0)
            System.out.println("Invalid Value");
        else{
            int megaBytes = kiloBytes / 1024;
            int remKiloBytes = (megaBytes==0)?0:kiloBytes % (megaBytes * 1024);
            System.out.println(kiloBytes+" KB = "+megaBytes+" MB and "+remKiloBytes+" KB");
        }
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(hourOfDay < 0 || hourOfDay > 23)
            return false;
        return barking && (hourOfDay < 8 || hourOfDay > 22);
    }

    public static boolean number(int number){
        return number > 5;
    }
}