import java.util.ArrayList;

public class MenuBonReveil implements Menu
{
	private String name = "Carte du Bon Reveil";
	private MenuItem[] items;
	private IterateurTableau it;

	public MenuBonReveil()
	{
		items = new MenuItem[0];
	}

	public String getName()
	{
		return name;
	}

	@Override
	public MenuItem findItem(String itemName) {

		IterateurTableau it = new IterateurTableau(items);

		while(it.hasNext()){
			MenuItem next = (MenuItem) it.getNext();
			if(next.getName().equals(itemName)){
				return next;
			}
		}

		return null;

	}

	public MenuItem[] getMenuItems()
	{
		return items;
	}

	public void addMenuItem(MenuItem item)
	{
		if (item == null)
			throw new IllegalArgumentException("Arguments invalides");

		MenuItem[] tmp = new MenuItem[items.length + 1];
		for (int i = 0; i < items.length; ++i)
			tmp[i] = items[i];
		items = tmp;
		items[items.length - 1] = item;
	}

	public String toString()
	{
		String ret = name + "\n";
		for (MenuItem item : items)
			ret += item.toString() + "\n";
		return ret;
	}

}
