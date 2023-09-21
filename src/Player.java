import java.util.Comparator;

public class Player {

    int id;
    String name;
    int salary;

    public Player(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public static void say(String m){
        System.out.println(m);
    }

    @Override
    public String toString(){
        return this.id+ " " +this.name;
    }
}

class IdComparator implements Comparator<Player>{

    @Override
    public int compare(Player o1, Player o2) {
        return Integer.compare(o1.id, o2.id);
    }
}

class NameComparator implements Comparator<Player>{

    @Override
    public int compare(Player o1, Player o2) {
        return o1.name.compareTo(o2.name);
    }
}