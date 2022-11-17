import java.util.ArrayList;

public class GroceryList {
    private final ArrayList<String> groceryList = new ArrayList<>();

    public void addGrocery(String item){
        if (findItem(item)>=0){
            System.out.println(item+ " already available on your list.");
        }
        else{
            this.groceryList.add(item);
            System.out.println(item+" added on your list.");
        }
    }
    public void removeItem(String item){
        int itemIndex = findItem(item);
        if (itemIndex >=0){
            this.groceryList.remove(itemIndex);
            System.out.println(item +" removed.");
        }
        else System.out.println(item +" not found on your list!");
    }
    public void updateItem(String oldItem, String newItem){
        int itemIndex = findItem(oldItem);
        if (itemIndex >=0){
            this.groceryList.set(itemIndex, newItem);
            System.out.println(oldItem +" updated with new item "+ newItem);
        }
        else System.out.println("Sorry "+ oldItem +" not available on your list!");
    }

    public void queryItem(String itemName){
        for (String items : groceryList){
            if (items.equalsIgnoreCase(itemName)){
                System.out.println(items +" found.");
                return;
            }
        }
        System.out.println(itemName +" not found");
    }

    public void printItems(){
        if (!groceryList.isEmpty()){
            System.out.println("You have "+groceryList.size()+" items : ");
            for (int i = 0; i<groceryList.size(); i++){
                System.out.println(i + 1 +". "+groceryList.get(i));
            }
        }
        else System.out.println("You have 0 item on your Grocery list");
    }

    // this method for getting index
    private int findItem(String name){
        return groceryList.indexOf(name);
    }
}
