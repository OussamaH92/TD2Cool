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
	public Iterable getIterator() {
		return new IterateurListe(items);
	}


	public ArrayList<MenuItem> getMenuItems()
	{
		return items;
	}


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
