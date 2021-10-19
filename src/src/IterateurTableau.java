public class IterateurTableau implements Iterable
{

    private int indiceCourant = 0;
    private MenuItem[] items;

    public IterateurTableau(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return !(indiceCourant == items.length-1);
    }

    @Override
    public Object getNext() {
        MenuItem res = items[indiceCourant];
        indiceCourant++;
        return res;
    }
}
