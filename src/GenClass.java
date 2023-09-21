import java.util.ArrayList;

public class GenClass <T>{
    public T value;

    public T getValue(){
        return value;
    }

    public <V extends Player> void say(V p){
        System.out.println(p.name);
    }

    public <V> V getElement(ArrayList<V> al, int index){
        return al.get(index);
    }
}
