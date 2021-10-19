import java.util.ArrayList;

public class Waiter
{
	private ArrayList<Menu> menu;

	public Waiter()
	{
		this.menu = new ArrayList<>();
	}

	public void addMenu(Menu menu){
		this.menu.add(menu);
	}

	private Menu isMenu(String menu){

		Menu res = null;
		for(Menu m : this.menu){
			if(m.getName().equals(menu))res=m;
		}
		return res;
	}

	public String displayMenu(String menu)
	{

		Menu m = isMenu(menu);
		if(m==null)return "Menu not found.";
		return m.toString();
	}

	public String displayMenuItem(String itemName)
	{
		MenuItem item = findMenuItemFrom(itemName);
		if (item == null)
			return "";
		else
			return item.toString();
	}

	public String displayPrice(String itemName)
	{
		MenuItem item = findMenuItemFrom(itemName);
		if (item == null)
			return "0.0";
		else
			return String.valueOf(item.getPrice());
	}

	public String displayComposition(String itemName)
	{
		MenuItem item = findMenuItemFrom(itemName);
		if (item == null)
			return "";
		else
			return item.getComposition();
	}

	private MenuItem findMenuItemFrom(String itemName)
	{

		MenuItem res = null;
		Iterable it = null;

		if (itemName != null)
		{
			for(Menu m : this.menu){

				it = m.getIterator();

				while(it.hasNext()){
					MenuItem next = (MenuItem) it.getNext();
					if(next.getName().equals(itemName)){
						return next;
					}
				}

			}
		}
		
		return res;
	}
}
