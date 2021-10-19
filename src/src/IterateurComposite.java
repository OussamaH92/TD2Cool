import java.util.ArrayList;

public class IterateurComposite implements Iterable
{

    private ArrayList<Menu> items;
    private ArrayList<MenuItem> menuItems;
    private Menu lastMenu = null;
    private MenuItem lastMenuItem = null;
    private int positionCouranteMenu = 0;

    public IterateurComposite(ArrayList<Menu> items, ArrayList<MenuItem> menuItems) {
        this.items = items;
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {

        if(!(menuItems.lastIndexOf(lastMenuItem) == menuItems.size()-1))return true;
        if(!(items.lastIndexOf(lastMenu) == items.size()-1))return true;

        return false;
    }

    @Override
    public Object getNext() {

        Object res = null;

        if(!(menuItems.lastIndexOf(lastMenuItem) == menuItems.size()-1)) {

            res = menuItems.get(menuItems.lastIndexOf(lastMenuItem) + 1);

        }else if(!(items.lastIndexOf(lastMenu) == items.size()-1)){

            Iterable it = null;

            if(lastMenu == null){
                lastMenu = items.get(0);
                it = lastMenu.getIterator();
            }

            if(it.hasNext())return it.getNext();
            else{
                while(!it.hasNext()) {
                    lastMenu = items.get(items.lastIndexOf(lastMenu) + 1);
                    it = lastMenu.getIterator();
                }
                return it.getNext();
            }
        }

        return res;

    }
}
