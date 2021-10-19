import java.util.ArrayList;

public class CompositeMenu implements Menu
{

    private ArrayList<Menu> menu;
    private ArrayList<MenuItem> menuItems;
    private String name;

    public CompositeMenu(String name, ArrayList<Menu> menu) {
        this.menu = menu;
        this.name = name;
    }


    public void addMenuItem(Menu item) {
        this.menu.add(item);
    }

    @Override
    public String getName() {
        return this.name;
    }

    public MenuItem findItem(String itemName) {
        return null;
    }

    @Override
    public Iterable getIterator() {
        return new IterateurComposite(menu,menuItems);
    }
}
