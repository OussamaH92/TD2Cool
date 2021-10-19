import java.util.ArrayList;

public class IterateurListe implements Iterable
{

    private ArrayList<MenuItem> items;
    private MenuItem last;

    public IterateurListe(ArrayList<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return !(items.lastIndexOf(last) == items.size()-1);
    }

    @Override
    public Object getNext() {

        if(last==null)last= items.get(0);
        else last = items.get(items.lastIndexOf(last)+1);
        return last;

    }
}
