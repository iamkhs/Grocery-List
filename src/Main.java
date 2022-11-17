import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static final GroceryList groceryList = new GroceryList();
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        boolean check = true;
        choiceList();

        while(check){
            System.out.println("Enter choice : ");
            int choice = 0;
            try{
                choice = input.nextInt();
                input.nextLine();
            }catch (InputMismatchException e){
                System.out.println("Please enter number only!!");
                input.nextLine();
            }
            switch (choice){
                case 0 -> choiceList();
                case 1 -> groceryList.printItems();
                case 2 -> addItem();
                case 3 -> updateItem();
                case 4 -> removeItem();
                case 5 -> searchItem();
                case 6 -> {
                    check = false;
                    System.out.println("Application Quiting......");
                }
            }
        }
    }

    private static void addItem(){
        System.out.print("Enter item name : ");
        String itemName = input.nextLine();

        groceryList.addGrocery(itemName);
    }

    private static void removeItem(){
        System.out.print("Enter item name : ");
        String itemName = input.nextLine();

        groceryList.removeItem(itemName);
    }

    private static void updateItem(){
        System.out.println("Enter old item name : ");
        String oldItem = input.nextLine();

        System.out.print("Enter new item : ");
        String newItem = input.nextLine();

        groceryList.updateItem(oldItem, newItem);
    }

    private static void searchItem(){
        System.out.println("Enter item name : ");
        String itemName = input.nextLine();

        groceryList.queryItem(itemName);
    }

    private static void choiceList(){
        System.out.println("\nPress :\n"+"""
                \t 0 - To print choice options.
                \t 1 - To print the list of grocery items.
                \t 2 - To add an item to the list.
                \t 3 - To modify an item in the list.
                \t 4 - To remove an item from the list.
                \t 5 - To search for an item in the list.
                \t 6 - To quit the application.
                """);
    }
}