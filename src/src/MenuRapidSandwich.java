import java.util.ArrayList;

public class MenuRapidSandwich implements Menu
{
	private String name = "Carte du Rapid Sandwich";
	private ArrayList<MenuItem> items;


	public MenuRapidSandwich()
	{
		items = new ArrayList<MenuItem>();

	}

	public String getName()
	{
		return name;
	}

	@Override
	public MenuItem findItem(String itemName) {

		IterateurListe it = new IterateurListe(items);

		while(it.hasNext()){
			MenuItem next = (MenuItem) it.getNext();
			if(next.getName().equals(itemName)){
				return next;
			}
		}

		return null;

	}


	public ArrayList<MenuItem> getMenuItems()
	{
		return items;
	}

	@Override
	public void addMenuItem(MenuItem item)
	{
		if (item == null)
			throw new IllegalArgumentException("Arguments invalides");
		items.add(item);

	}

	public String toString()
	{
		String ret = name + "\n";
		for (MenuItem item : items)
			ret += item.toString() + "\n";
		return ret;
	}

}
